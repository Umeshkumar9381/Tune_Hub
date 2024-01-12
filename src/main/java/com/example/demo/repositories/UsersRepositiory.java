package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Users;

public interface UsersRepositiory  extends JpaRepository<Users, Integer>{
	public Users findByEmail(String email);

}
