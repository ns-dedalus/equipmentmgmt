package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LkStatusType")
public class LkStatusType {

    @Id
    @Column(name = "StatusTypeId" )
    private Integer statusTypeId;
    @Column(name = "StatusTypeName" )
    private String statusTypeName;
	public Integer getStatusTypeId() {
		return statusTypeId;
	}
	public void setStatusTypeId(Integer statusTypeId) {
		this.statusTypeId = statusTypeId;
	}
	public String getStatusTypeName() {
		return statusTypeName;
	}
	public void setStatusTypeName(String statusTypeName) {
		this.statusTypeName = statusTypeName;
	}
}