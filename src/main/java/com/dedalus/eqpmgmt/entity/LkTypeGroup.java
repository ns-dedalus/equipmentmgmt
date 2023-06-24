package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LkTypeGroup")
public class LkTypeGroup {

    @Id
    @Column(name = "TypeGroupId" )
    private Integer typeGroupId;
    @Column(name = "TypeGroupName" )
    private String typeGroupName;
	public Integer getTypeGroupId() {
		return typeGroupId;
	}
	public void setTypeGroupId(Integer typeGroupId) {
		this.typeGroupId = typeGroupId;
	}
	public String getTypeGroupName() {
		return typeGroupName;
	}
	public void setTypeGroupName(String typeGroupName) {
		this.typeGroupName = typeGroupName;
	}
    
}