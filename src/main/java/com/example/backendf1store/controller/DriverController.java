package com.example.backendf1store.controller;

import com.example.backendf1store.model.Driver;
import com.example.backendf1store.repo.DriverRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class DriverController {

  @Autowired private DriverRepo driverRepo;

  // Driver List
  @GetMapping("/driverList")
  public List<Driver> getAllDriver(){
    return driverRepo.findAll();
  }

  // Create a new driver
  @PostMapping("/createNewDriver")
  public Driver createDriver(Driver driver){
    return driverRepo.save(driver);
  }

  // Search single driver

  // Update driver info

  // delete driver info

}
