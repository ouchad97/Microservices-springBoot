package com.ouchadprogramming.orderservice.repository;

import com.ouchadprogramming.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}