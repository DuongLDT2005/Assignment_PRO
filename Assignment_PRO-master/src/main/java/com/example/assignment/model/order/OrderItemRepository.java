package com.example.assignment.model.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  OrderItemRepository
        extends JpaRepository<OrderItem, Long> {
            

}