package com.example.backendf1store.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class USER {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long uId;

  @Column(name = "user_account", unique = true)
  private String uAccount;

  @Column(name = "user_password")
  private String uPWD;

  @Column(name = "user_name")
  private String uName;

  @Column(name = "user_gender")
  private String uGender;

  @Column(name = "user_Phone", unique = true)
  private String uPhone;

  @Column(name = "user_email", unique = true)
  private String uEmail;

  @Column(name = "user_createTime")
  private Timestamp createTime;

  @Column(name = "user_modifiedTime")
  private Timestamp modifiedTime;
}
