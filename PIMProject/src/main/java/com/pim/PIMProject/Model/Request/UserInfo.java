package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserInfo {
	@JacksonXmlProperty(localName = "UserVID")
	private UserVID userVID;
	@JacksonXmlProperty(localName = "PageNumber")
	private String pageNumber;
	@JacksonXmlProperty(localName = "PageSize")
	private String pageSize;
	@JacksonXmlProperty(localName = "UserType")
	private String userType;
	@JacksonXmlProperty(localName = "NID")
	private String nID;
	@JacksonXmlProperty(localName = "BIN")
	private String bIN;
	@JacksonXmlProperty(localName = "DOB")
	private String dob;
	@JacksonXmlProperty(localName = "DateOfIncorporation")
	private String dateOfIncorporation;
	@JacksonXmlProperty(localName = "MobileNo")
	private String mobileNo;
	@JacksonXmlProperty(localName = "AccountNo")
	private String accountNo;
	@JacksonXmlProperty(localName = "NewVID")
	private String newVID;
	@JacksonXmlProperty(localName = "OldVID")
	private String oldVID;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(UserVID userVID, String pageNumber, String pageSize, String userType, String nID, String bIN,
			String dob, String dateOfIncorporation, String mobileNo, String accountNo, String newVID, String oldVID) {
		super();
		this.userVID = userVID;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.userType = userType;
		this.nID = nID;
		this.bIN = bIN;
		this.dob = dob;
		this.dateOfIncorporation = dateOfIncorporation;
		this.mobileNo = mobileNo;
		this.accountNo = accountNo;
		this.newVID = newVID;
		this.oldVID = oldVID;
	}
	public UserVID getUserVID() {
		return userVID;
	}
	public void setUserVID(UserVID userVID) {
		this.userVID = userVID;
	}
	public String getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getnID() {
		return nID;
	}
	public void setnID(String nID) {
		this.nID = nID;
	}
	public String getbIN() {
		return bIN;
	}
	public void setbIN(String bIN) {
		this.bIN = bIN;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDateOfIncorporation() {
		return dateOfIncorporation;
	}
	public void setDateOfIncorporation(String dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getNewVID() {
		return newVID;
	}
	public void setNewVID(String newVID) {
		this.newVID = newVID;
	}
	public String getOldVID() {
		return oldVID;
	}
	public void setOldVID(String oldVID) {
		this.oldVID = oldVID;
	}
	
}
