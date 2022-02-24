package com.pim.PIMProject.Model.Request;

import java.sql.Timestamp;

public class CustomerAccounts {
	private int id;
	private int profileId;
	private String accountNo;
	private String accTitle;
	private int accountTypeId;
	private int branchId;
	private String regType;
	private String debitAllowed;
	private Timestamp activationDate;
	private int activatedBy;
	private String status;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp deletedAt;
	
	public CustomerAccounts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAccounts(int id, int profileId, String accountNo, String accTitle, int accountTypeId, int branchId,
			String regType, String debitAllowed, Timestamp activationDate, int activatedBy, String status,
			Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
		super();
		this.id = id;
		this.profileId = profileId;
		this.accountNo = accountNo;
		this.accTitle = accTitle;
		this.accountTypeId = accountTypeId;
		this.branchId = branchId;
		this.regType = regType;
		this.debitAllowed = debitAllowed;
		this.activationDate = activationDate;
		this.activatedBy = activatedBy;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccTitle() {
		return accTitle;
	}

	public void setAccTitle(String accTitle) {
		this.accTitle = accTitle;
	}

	public int getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getDebitAllowed() {
		return debitAllowed;
	}

	public void setDebitAllowed(String debitAllowed) {
		this.debitAllowed = debitAllowed;
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

	public Timestamp getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}
	
}
