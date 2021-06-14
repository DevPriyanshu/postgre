package com.example.postgresdemo.controller;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.postgresdemo.model.Users;
import com.example.postgresdemo.repository.UserRepo;

@RestController
@RequestMapping("/api/v1")
public class UsersController {
	
	@Autowired
	private UserRepo userRepository;
	
	@GetMapping("user")
	public List<Users> getAllUser()
	{
		return this.userRepository.findAll();
	}
	
	@PostMapping("/employees")
    public Users createEmployee(@Valid @RequestBody Users user) {
        return userRepository.save(user);
    }
	
}
