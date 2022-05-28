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

  public long getDId() {
    return dId;
  }

  public void setDId(long dId) {
    this.dId = dId;
  }

  public String getDriverNumber() {
    return driverNumber;
  }

  public void setDriverNumber(String driverNumber) {
    this.driverNumber = driverNumber;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getPodiums() {
    return podiums;
  }

  public void setPodiums(String podiums) {
    this.podiums = podiums;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }
}
