package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ApplicationUser")
public class ApplicationUser {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name = "UserId" )
	private int userId;
	@Column(name = "UserName", nullable = false, length = 50, unique = true)
	private String userName;
	@Column(name = "UserPassword", nullable = false, length = 512)
	private String userPassword;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
