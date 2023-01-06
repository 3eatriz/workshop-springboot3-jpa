package com.estudos.beatriz.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.beatriz.curse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
