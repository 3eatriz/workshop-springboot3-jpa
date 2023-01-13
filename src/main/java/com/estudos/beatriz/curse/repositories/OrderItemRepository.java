package com.estudos.beatriz.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.beatriz.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
