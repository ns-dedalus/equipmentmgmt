package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ApplicationRole")
public class ApplicationRole {
	
	@Id
	@Column(name = "ApplicationRoleId" )
	private int applicationRoleId;
	
	@Column(name = "ApplicationRoleName", nullable = false, length = 50, unique = true)
	private String applicationRoleName;
	
	public ApplicationRole() {
		super();
	}
	
	public ApplicationRole(int applicationRoleId, String applicationRoleName) {
		super();
		this.applicationRoleId = applicationRoleId;
		this.applicationRoleName = applicationRoleName;
	}

	public int getApplicationRoleId() {
		return applicationRoleId;
	}

	public void setApplicationRoleId(int applicationRoleId) {
		this.applicationRoleId = applicationRoleId;
	}

	public String getApplicationRoleName() {
		return applicationRoleName;
	}

	public void setApplicationRoleName(String applicationRoleName) {
		this.applicationRoleName = applicationRoleName;
	}
	
	
	
	
}
