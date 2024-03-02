package com.onesoft.flipkart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.flipkart.entity.Order;
import com.onesoft.flipkart.repository.OrderRepository;

@Repository

public class OrderDao {
	@Autowired
	OrderRepository or;

	public Order save(Order a) {
		return or.save(a);
	}

	public List< Object> get() {
		return or.get();
	}

}
