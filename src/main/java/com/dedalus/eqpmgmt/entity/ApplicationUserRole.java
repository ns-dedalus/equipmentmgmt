package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ApplicationUserRole")
public class ApplicationUserRole {
	@Id
	@Column(name = "ApplicationUserRoleId" )
	private int applicationUserRoleId;
	@Column(name = "ApplicationUserId" )
	private int applicationUserId;
	@Column(name = "ApplicationRoleId" )
	
	private int applicationRoleId;
	public int getApplicationUserRoleId() {
		return applicationUserRoleId;
	}
	public void setApplicationUserRoleId(int applicationUserRoleId) {
		this.applicationUserRoleId = applicationUserRoleId;
	}
	public int getApplicationUserId() {
		return applicationUserId;
	}
	public void setApplicationUserId(int applicationUserId) {
		this.applicationUserId = applicationUserId;
	}
	public int getApplicationRoleId() {
		return applicationRoleId;
	}
	public void setApplicationRoleId(int applicationRoleId) {
		this.applicationRoleId = applicationRoleId;
	}
	
	
}
