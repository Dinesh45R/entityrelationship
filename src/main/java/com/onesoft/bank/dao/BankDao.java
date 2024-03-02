package com.onesoft.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.onesoft.bank.entity.Bank;
import com.onesoft.bank.repository.BankRepository;

@Repository

public class BankDao {
	@Autowired
	BankRepository br;
	

	public String save(List<Bank> a) {
		  br.saveAll(a);
		 return "Success";
	}


	public List<Bank> findall(List<Bank> a) {
		return br.findAll();
	}






	public List<Bank> findall() {
	
		return br.findAll();
	}
public String getbranch(String a) {
	return br.getbranch(a);
}
	
	

}
