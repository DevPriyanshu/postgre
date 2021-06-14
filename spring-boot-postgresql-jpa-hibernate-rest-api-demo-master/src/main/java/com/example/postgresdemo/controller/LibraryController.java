package com.example.postgresdemo.controller;

import com.example.postgresdemo.exception.ResourceNotFoundException;
import com.example.postgresdemo.model.Library;
import com.example.postgresdemo.repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

@RestController
public class LibraryController {

    @Autowired
    private LibraryRepo libRepository;

    @GetMapping("/library")
    public List<Library> getAllBooks() {
        return libRepository.findAll();
    }
    
    @PostMapping("/library")
    public Library createEmployee(@Valid @RequestBody Library lib) {
        return libRepository.save(lib);
    }
    
    @DeleteMapping("/library/{Isbn}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "Isbn") Long Isbn) throws ResourceNotFoundException 
    {
        Library library = libRepository.findById(Isbn).orElseThrow(() -> new ResourceNotFoundException("Book is not found by this Isbn: " + Isbn));

		libRepository.delete(library);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
