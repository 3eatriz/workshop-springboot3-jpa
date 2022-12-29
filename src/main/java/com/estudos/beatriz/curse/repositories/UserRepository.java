package com.estudos.beatriz.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.beatriz.curse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
