package com.onesoft.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.bank.Exception.BrandNotFoundException;

import com.onesoft.bank.entity.Bank;
import com.onesoft.bank.service.BankService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController

public class BankController {
	@Autowired
	BankService bs;
	@PostMapping(value="/save")
	public String  savedata(@RequestBody List<Bank> a) {
		return bs.save(a);
	}
	@PostMapping("findall")
	public List<Bank> postMethodName(@RequestBody List<Bank> a) {
		
		return bs.findall(a);
	}
	@GetMapping("findbranch/{a}")
	public String getMethodName(@PathVariable String a) throws BrandNotFoundException{
		return bs.getbranch(a);
	}
	@GetMapping("throw/{a}")
	public String findbranch(@RequestParam String  a) {
		return bs.findbranch (a);
	}
	
	
	
	
	
	

}
