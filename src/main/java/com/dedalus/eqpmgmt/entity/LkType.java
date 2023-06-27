package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LkType")
public class LkType {

    @Id
    @Column(name = "TypeId" )
    private Integer typeId;
    @Column(name = "TypeGroupId" )
    private Integer typeGroupId;
    @Column(name = "TypeName" )
    private String typeName;
    @Column(name = "TypeDisplayName" )
    private String typeDisplayName;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeDisplayName() {
		return typeDisplayName;
	}

	public void setTypeDisplayName(String typeDisplayName) {
		this.typeDisplayName = typeDisplayName;
	}
	
    @ManyToOne
    @JoinColumn(name = "TypeGroupId", insertable = false, updatable = false)
    private LkTypeGroup typeGroup;

	public LkTypeGroup getTypeGroup() {
		return typeGroup;
	}

	public void setTypeGroup(LkTypeGroup typeGroup) {
		this.typeGroup = typeGroup;
	}

}