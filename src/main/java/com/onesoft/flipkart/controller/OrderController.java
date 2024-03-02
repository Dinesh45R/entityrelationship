package com.onesoft.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.flipkart.entity.Order;
import com.onesoft.flipkart.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class OrderController {
	@Autowired
	OrderService os;
	@PostMapping("save")
	public Order getMethodName(@RequestBody Order a) {
		return os.save(a);
	}
	@GetMapping("get")
	public  List<Object> get() {
		return os.get();
	}
	
	

}
