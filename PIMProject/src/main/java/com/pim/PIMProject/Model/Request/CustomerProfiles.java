package com.pim.PIMProject.Model.Request;

import java.sql.Timestamp;

public class CustomerProfiles {
	private int id;
	private int applicationId;
	private String entityType;
	private String mobileNo;
	private String email;
	private int branchId;
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String gender;
	private int postCode;
	private String nId;
	private String tinNo;
	private String password;
	private String idtpPin;
	private String appPassword;
	private String finName;
	private String primaryAccountNo;
	private Timestamp birthDate;
	private Timestamp registrationDate;
	private Timestamp activationDate;
	private int activatedBy;
	private String remarks;
	private int transCount;
	private int todayTransAmt;
	private int ticketSize;
	private String dailyLimit;
	private String status;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public CustomerProfiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerProfiles(int id, int applicationId, String entityType, String mobileNo, String email, int branchId,
			int customerId, String customerName, String customerAddress, String gender, int postCode, String nId,
			String tinNo, String password, String idtpPin, String appPassword, String finName, String primaryAccountNo,
			Timestamp birthDate, Timestamp registrationDate, Timestamp activationDate, int activatedBy, String remarks,
			int transCount, int todayTransAmt, int ticketSize, String dailyLimit, String status, Timestamp createdAt,
			Timestamp updatedAt) {
		super();
		this.id = id;
		this.applicationId = applicationId;
		this.entityType = entityType;
		this.mobileNo = mobileNo;
		this.email = email;
		this.branchId = branchId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.gender = gender;
		this.postCode = postCode;
		this.nId = nId;
		this.tinNo = tinNo;
		this.password = password;
		this.idtpPin = idtpPin;
		this.appPassword = appPassword;
		this.finName = finName;
		this.primaryAccountNo = primaryAccountNo;
		this.birthDate = birthDate;
		this.registrationDate = registrationDate;
		this.activationDate = activationDate;
		this.activatedBy = activatedBy;
		this.remarks = remarks;
		this.transCount = transCount;
		this.todayTransAmt = todayTransAmt;
		this.ticketSize = ticketSize;
		this.dailyLimit = dailyLimit;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getnId() {
		return nId;
	}

	public void setnId(String nId) {
		this.nId = nId;
	}

	public String getTinNo() {
		return tinNo;
	}

	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdtpPin() {
		return idtpPin;
	}

	public void setIdtpPin(String idtpPin) {
		this.idtpPin = idtpPin;
	}

	public String getAppPassword() {
		return appPassword;
	}

	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}

	public String getFinName() {
		return finName;
	}

	public void setFinName(String finName) {
		this.finName = finName;
	}

	public String getPrimaryAccountNo() {
		return primaryAccountNo;
	}

	public void setPrimaryAccountNo(String primaryAccountNo) {
		this.primaryAccountNo = primaryAccountNo;
	}

	public Timestamp getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public Timestamp getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Timestamp getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Timestamp activationDate) {
		this.activationDate = activationDate;
	}

	public int getActivatedBy() {
		return activatedBy;
	}

	public void setActivatedBy(int activatedBy) {
		this.activatedBy = activatedBy;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getTransCount() {
		return transCount;
	}

	public void setTransCount(int transCount) {
		this.transCount = transCount;
	}

	public int getTodayTransAmt() {
		return todayTransAmt;
	}

	public void setTodayTransAmt(int todayTransAmt) {
		this.todayTransAmt = todayTransAmt;
	}

	public int getTicketSize() {
		return ticketSize;
	}

	public void setTicketSize(int ticketSize) {
		this.ticketSize = ticketSize;
	}

	public String getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(String dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
