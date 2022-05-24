package com.example.backendf1store.controller;

import com.example.backendf1store.model.User;
import com.example.backendf1store.repo.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

  @Autowired private UserRepo userRepo;

  // Get All User
  @GetMapping("/allUser")
  public List<User> getAllUser() {
    return userRepo.findAll();
  }
}
