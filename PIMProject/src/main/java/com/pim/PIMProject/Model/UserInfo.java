package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class UserInfo {
	@JacksonXmlProperty(localName = "UserVID")
	private UserVID userVID;
	@JacksonXmlProperty(localName = "PageNumber")
	private String pageNumber;
	@JacksonXmlProperty(localName = "PageSize")
	private String pageSize;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(UserVID userVID, String pageNumber, String pageSize) {
		super();
		this.userVID = userVID;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
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
	
	
}
