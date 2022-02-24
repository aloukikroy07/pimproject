package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


public class FIInfo {
	@JacksonXmlProperty(localName = "UserVID")
	private UserVID userVID;
	@JacksonXmlProperty(localName = "FromDate")
	private String fromDate;
	@JacksonXmlProperty(localName = "ToDate")
	private String toDate;
	@JacksonXmlProperty(localName = "SettlementStatus")
	private String settlementStatus;
	@JacksonXmlProperty(localName = "TransactionStatus")
	private String transactionStatus;
	@JacksonXmlProperty(localName = "TransactionType")
	private String transactionType;
	@JacksonXmlProperty(localName = "RoutingNo")
	private String routingNo;
	@JacksonXmlProperty(localName = "PageNumber")
	private String pageNumber;
	@JacksonXmlProperty(localName = "PageSize")
	private String pageSize;
	public FIInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FIInfo(UserVID userVID, String fromDate, String toDate, String settlementStatus, String transactionStatus,
			String transactionType, String routingNo, String pageNumber, String pageSize) {
		super();
		this.userVID = userVID;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.settlementStatus = settlementStatus;
		this.transactionStatus = transactionStatus;
		this.transactionType = transactionType;
		this.routingNo = routingNo;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	public UserVID getUserVID() {
		return userVID;
	}
	public void setUserVID(UserVID userVID) {
		this.userVID = userVID;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getSettlementStatus() {
		return settlementStatus;
	}
	public void setSettlementStatus(String settlementStatus) {
		this.settlementStatus = settlementStatus;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getRoutingNo() {
		return routingNo;
	}
	public void setRoutingNo(String routingNo) {
		this.routingNo = routingNo;
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
	
	
}
