package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
}
