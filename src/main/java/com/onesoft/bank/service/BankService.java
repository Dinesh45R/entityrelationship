package com.onesoft.bank.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.bank.Exception.BrandNotFoundException;

import com.onesoft.bank.dao.BankDao;
import com.onesoft.bank.entity.Bank;

@Service

public class BankService {
	@Autowired
	BankDao bd;

	public String save(List<Bank> a) {
		return bd.save(a);
	}

	public List<Bank> findall(List<Bank> a) {
		return bd.findall(a);
	}

	public String getbranch(String a) throws BrandNotFoundException{
	List<Bank> b= bd.findall();
	List<String> m= b.stream().filter(x-> x.getIfsc().equals(a)).map(x-> x.getBranch()).collect(Collectors.toList());
    if(m.isEmpty()) {
		throw new BrandNotFoundException("ipudi oru branch illa daaaaaa................ ");
	}
    else {
	return "Scuces";
    }
	}

	public String findbranch(String a){//throws MissingServletRequestParameterException {
	List<Bank> b=bd.findall();
	List<Bank> m=b.stream().filter(x-> x.getBranch().equals(a)).collect(Collectors.toList());
	 return "succes";
		//throw new("Number illa da String kududa loosu.........");
	}
	

}
