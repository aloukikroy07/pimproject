package com.pim.db.mapping.model;

import java.util.Date;

public class Transactions {
	private String transId;
	private Integer transCode;
	private Integer profileId;
	private Date transDate;
	private String senderAccount;
	private String receiverIdtpVid;
	private float transAmt;
	private float chargeAmt;
	private float taxAmt;
	private String description;
	private String purpose;
	private String trStatus;
	private String reason;
	private String cbsRef;
	private String reconciled;
	private String apiSuccess;
	private Integer userId;
	
	public Transactions() {
		super();
	}

	public Transactions(String transId, Integer transCode, Integer profileId, Date transDate, String senderAccount,
			String receiverIdtpVid, float transAmt, float chargeAmt, float taxAmt, String description, String purpose,
			String trStatus, String reason, String cbsRef, String reconciled, String apiSuccess, Integer userId) {
		super();
		this.transId = transId;
		this.transCode = transCode;
		this.profileId = profileId;
		this.transDate = transDate;
		this.senderAccount = senderAccount;
		this.receiverIdtpVid = receiverIdtpVid;
		this.transAmt = transAmt;
		this.chargeAmt = chargeAmt;
		this.taxAmt = taxAmt;
		this.description = description;
		this.purpose = purpose;
		this.trStatus = trStatus;
		this.reason = reason;
		this.cbsRef = cbsRef;
		this.reconciled = reconciled;
		this.apiSuccess = apiSuccess;
		this.userId = userId;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public Integer getTransCode() {
		return transCode;
	}

	public void setTransCode(Integer transCode) {
		this.transCode = transCode;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getSenderAccount() {
		return senderAccount;
	}

	public void setSenderAccount(String senderAccount) {
		this.senderAccount = senderAccount;
	}

	public String getReceiverIdtpVid() {
		return receiverIdtpVid;
	}

	public void setReceiverIdtpVid(String receiverIdtpVid) {
		this.receiverIdtpVid = receiverIdtpVid;
	}

	public float getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(float transAmt) {
		this.transAmt = transAmt;
	}

	public float getChargeAmt() {
		return chargeAmt;
	}

	public void setChargeAmt(float chargeAmt) {
		this.chargeAmt = chargeAmt;
	}

	public float getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(float taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTrStatus() {
		return trStatus;
	}

	public void setTrStatus(String trStatus) {
		this.trStatus = trStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCbsRef() {
		return cbsRef;
	}

	public void setCbsRef(String cbsRef) {
		this.cbsRef = cbsRef;
	}

	public String getReconciled() {
		return reconciled;
	}

	public void setReconciled(String reconciled) {
		this.reconciled = reconciled;
	}

	public String getApiSuccess() {
		return apiSuccess;
	}

	public void setApiSuccess(String apiSuccess) {
		this.apiSuccess = apiSuccess;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
