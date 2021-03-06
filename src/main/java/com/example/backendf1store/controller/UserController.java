package com.example.backendf1store.controller;

import com.example.backendf1store.model.User;
import com.example.backendf1store.repo.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class UserController {

  @Autowired private UserRepo userRepo;

  // Get All User
  @GetMapping("/allUser")
  public List<User> getAllUser() {
    return userRepo.findAll();
  }

  // Register
  @PostMapping("/register")
  public User createUser(@RequestBody User user) {
    return userRepo.save(user);
  }
}
