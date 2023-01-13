package com.estudos.beatriz.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.beatriz.curse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
