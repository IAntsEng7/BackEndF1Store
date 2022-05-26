package com.example.backendf1store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver")
public class Driver {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long dId;

  @Column(name = "driver_number")
  private String driverNumber;

  @Column(name = "team")
  private String team;

  @Column(name = "podiums")
  private String podiums;

  @Column(name = "driver_name")
  private String driverName;

  @Column(name = "country")
  private String country;

  @Column(name = "picture_URL")
  private String picUrl;

  @Column(name="describe")
  private String describe;
}
