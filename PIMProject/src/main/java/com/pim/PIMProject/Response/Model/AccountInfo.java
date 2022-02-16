package com.pim.PIMProject.Response.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AccountInfo {
	@JacksonXmlProperty(isAttribute = true)
	private String seqNum;
	@JacksonXmlProperty(localName = "AccountNo")
	private String accountNo;
	public AccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountInfo(String seqNum, String accountNo) {
		super();
		this.seqNum = seqNum;
		this.accountNo = accountNo;
	}
	public String getSeqNum() {
		return seqNum;
	}
	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
}
