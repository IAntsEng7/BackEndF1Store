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
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "User")
@Getter
@Setter
public class User {

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

  @CreationTimestamp
  @Column(name = "user_createTime")
  private Timestamp createTime;

  @UpdateTimestamp
  @Column(name = "user_modifiedTime")
  private Timestamp modifiedTime;
}
