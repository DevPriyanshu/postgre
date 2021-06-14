package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Long> {

	
}
