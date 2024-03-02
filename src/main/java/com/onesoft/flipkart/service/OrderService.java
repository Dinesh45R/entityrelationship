package com.onesoft.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.flipkart.dao.OrderDao;
import com.onesoft.flipkart.entity.Order;
@Service

public class OrderService {
	@Autowired
	OrderDao od;

	public Order save(Order a) {
		return od.save(a);
	}

	public List<Object> get() {
		return od.get();
	}

}
