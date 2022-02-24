package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ValidateFIUser {
	@JacksonXmlProperty(localName = "xmlns:idtp", isAttribute = true)
	private String xmlns="http://example.com";
	@JacksonXmlProperty(localName = "Head")
	private Head head;
	@JacksonXmlProperty(localName = "Req")
	private Req req;
	@JacksonXmlProperty(localName = "UserInfo")
	private UserInfo userInfo;
	@JacksonXmlProperty(localName = "OtherInfo")
	private OtherInfo otherInfo;
	public ValidateFIUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ValidateFIUser(String xmlns, Head head, Req req, UserInfo userInfo, OtherInfo otherInfo) {
		super();
		this.xmlns = xmlns;
		this.head = head;
		this.req = req;
		this.userInfo = userInfo;
		this.otherInfo = otherInfo;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Req getReq() {
		return req;
	}
	public void setReq(Req req) {
		this.req = req;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public OtherInfo getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(OtherInfo otherInfo) {
		this.otherInfo = otherInfo;
	}
}
