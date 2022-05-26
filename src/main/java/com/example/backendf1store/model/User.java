package com.example.backendf1store.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "User")
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

  public long getuId() {
    return uId;
  }

  public void setuId(long uId) {
    this.uId = uId;
  }

  public String getuAccount() {
    return uAccount;
  }

  public void setuAccount(String uAccount) {
    this.uAccount = uAccount;
  }

  public String getuPWD() {
    return uPWD;
  }

  public void setuPWD(String uPWD) {
    this.uPWD = uPWD;
  }

  public String getuName() {
    return uName;
  }

  public void setuName(String uName) {
    this.uName = uName;
  }

  public String getuPhone() {
    return uPhone;
  }

  public void setuPhone(String uPhone) {
    this.uPhone = uPhone;
  }

  public String getuEmail() {
    return uEmail;
  }

  public void setuEmail(String uEmail) {
    this.uEmail = uEmail;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public Timestamp getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(Timestamp modifiedTime) {
    this.modifiedTime = modifiedTime;
  }
}
