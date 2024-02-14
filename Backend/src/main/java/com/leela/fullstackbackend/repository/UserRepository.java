package com.leela.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leela.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
