package com.onesoft.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesoft.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value = "select branch from bankdetails where ifsc=?", nativeQuery = true)
	public String getbranch(String a);

}
