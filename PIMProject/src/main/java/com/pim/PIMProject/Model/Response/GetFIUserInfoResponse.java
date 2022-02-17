package com.pim.PIMProject.Model.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetFIUserInfoResponse {
	@JacksonXmlProperty(localName = "Code")
	private String code;
	@JacksonXmlProperty(localName = "Message")
	private String message;
	@JacksonXmlProperty(localName = "NID")
	private String nid;
	@JacksonXmlProperty(localName = "BIN")
	private String bin;
	@JacksonXmlProperty(localName = "DateOfBirth")
	private String dateOfBirth;
	@JacksonXmlProperty(localName = "DateOfIncorporation")
	private String dateOfIncorporation;
	@JacksonXmlProperty(localName = "MobileNo")
	private String mobileNo;
	@JacksonXmlProperty(localName = "AccountInfo")
	private AccountInfo accountInfo;
	public GetFIUserInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetFIUserInfoResponse(String code, String message, String nid, String bin, String dateOfBirth,
			String dateOfIncorporation, String mobileNo, AccountInfo accountInfo) {
		super();
		this.code = code;
		this.message = message;
		this.nid = nid;
		this.bin = bin;
		this.dateOfBirth = dateOfBirth;
		this.dateOfIncorporation = dateOfIncorporation;
		this.mobileNo = mobileNo;
		this.accountInfo = accountInfo;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public AccountInfo getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}
	
}
