package com.reaps.system.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the sys_base_info database table.
 * 
 */
@Entity
@Table(name="sys_base_info")
@NamedQuery(name="SysBaseInfoEntity.findAll", query="SELECT s FROM SysBaseInfoEntity s")
public class SysBaseInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String uid;
	
	@Column(name="name")
	private String name;

	@Column(name="parent_id")
	private String parentId;
	
	@Column(name="type")
	private String type;
	
	
	private List<SysBaseInfoEntity> baseInfoList;
	
	private Boolean open;
	
	private String isExists;
	
	


	public String getIsExists() {
		return isExists;
	}

	public void setIsExists(String isExists) {
		this.isExists = isExists;
	}

	public List<SysBaseInfoEntity> getBaseInfoList() {
		return baseInfoList;
	}

	public void setBaseInfoList(List<SysBaseInfoEntity> baseInfoList) {
		this.baseInfoList = baseInfoList;
	}


	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public SysBaseInfoEntity() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}