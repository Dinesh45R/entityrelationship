package com.onesoft.flipkart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesoft.flipkart.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	
    @Query(value="select city,quantity from order_table join product_table on order_table.id=product_table.order_fkey",nativeQuery = true)
	public List<Object> get();

}
