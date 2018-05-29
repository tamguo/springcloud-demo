package com.reaps.system.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the reaps_sys_menu database table.
 * 
 */
@Entity
@Table(name="sys_menu")
@NamedQuery(name="SysMenuEntity.findAll", query="SELECT r FROM SysMenuEntity r")
public class SysMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	@Column(name="name")
	private String name;

	@Column(name="order_num")
	private int orderNum;

	@Column(name="parent_id")
	private String parentId;

	@Column(name="type")
	private String type;

	@Column(name="url")
	private String url;
	
	@Column(name="perms")
	private String perms;
	
	private List<SysMenuEntity> menuList;
	
	private String parentName;
	
	private Boolean open;

	public SysMenuEntity() {
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

	public int getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<SysMenuEntity> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<SysMenuEntity> menuList) {
		this.menuList = menuList;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public String getPerms() {
		return perms;
	}

	public void setPerms(String perms) {
		this.perms = perms;
	}

}