package com.example.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long>
{
	
}
