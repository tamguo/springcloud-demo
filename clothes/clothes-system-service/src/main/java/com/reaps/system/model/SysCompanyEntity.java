package com.reaps.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * The persistent class for the cc_sys_company database table.
 * 
 */
@Entity
@Table(name="sys_company")
@NamedQuery(name="SysCompanyEntity.findAll", query="SELECT c FROM SysCompanyEntity c")
public class SysCompanyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	@Column(name="address")
	private String address;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="check_time")
	private Date checkTime;

	@Column(name="check_user")
	private String checkUser;

	@Column(name="city")
	private String city;

	@Column(name="company_name")
	private String companyName;

	@Column(name="company_type")
	private String companyType;

	@Column(name="corporation")
	private String corporation;

	@Column(name="county")
	private String county;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="create_user")
	private String createUser;

	@Column(name="delete_flag")
	private String deleteFlag;

	@Column(name="holiday_tel")
	private String holidayTel;

	@Column(name="industry")
	private String industry;

	@Temporal(TemporalType.DATE)
	@Column(name="join_date")
	@JSONField(format="yyyy-MM-dd")
	private Date joinDate;

	@Column(name="level")
	private int level;

	@Column(name="mobile")
	private String mobile;

	@Column(name="office_tel")
	private String officeTel;

	@Temporal(TemporalType.DATE)
	@Column(name="out_date")
	private Date outDate;

	@Column(name="postcode")
	private String postcode;

	@Column(name="province")
	private String province;

	@Column(name="register_no")
	private String registerNo;

	@Column(name="responsible_user")
	private String responsibleUser;

	@Column(name="simple_name")
	private String simpleName;

	@Column(name="status")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	@Column(name="update_user")
	private String updateUser;

	@Column(name="weixin_enterprise_id")
	private String weixinEnterpriseId;

	@Column(name="weixin_enterprise_name")
	private String weixinEnterpriseName;

	@Column(name="weixin_public_id")
	private String weixinPublicId;

	@Column(name="weixin_public_name")
	private String weixinPublicName;

	public SysCompanyEntity() {
	}

	

	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
	}



	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckUser() {
		return this.checkUser;
	}

	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getHolidayTel() {
		return this.holidayTel;
	}

	public void setHolidayTel(String holidayTel) {
		this.holidayTel = holidayTel;
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOfficeTel() {
		return this.officeTel;
	}

	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}

	public Date getOutDate() {
		return this.outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getRegisterNo() {
		return this.registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getResponsibleUser() {
		return this.responsibleUser;
	}

	public void setResponsibleUser(String responsibleUser) {
		this.responsibleUser = responsibleUser;
	}

	public String getSimpleName() {
		return this.simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	

	public String getWeixinEnterpriseName() {
		return this.weixinEnterpriseName;
	}

	public void setWeixinEnterpriseName(String weixinEnterpriseName) {
		this.weixinEnterpriseName = weixinEnterpriseName;
	}

	public String getWeixinPublicName() {
		return this.weixinPublicName;
	}

	public void setWeixinPublicName(String weixinPublicName) {
		this.weixinPublicName = weixinPublicName;
	}

	public String getWeixinEnterpriseId() {
		return weixinEnterpriseId;
	}

	public void setWeixinEnterpriseId(String weixinEnterpriseId) {
		this.weixinEnterpriseId = weixinEnterpriseId;
	}

	public String getWeixinPublicId() {
		return weixinPublicId;
	}

	public void setWeixinPublicId(String weixinPublicId) {
		this.weixinPublicId = weixinPublicId;
	}
	
	

}