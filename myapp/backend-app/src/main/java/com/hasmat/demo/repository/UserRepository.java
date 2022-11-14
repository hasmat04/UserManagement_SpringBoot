package com.hasmat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hasmat.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
