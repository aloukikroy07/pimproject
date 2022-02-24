package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GetFIUserInfo {
	@JacksonXmlProperty(localName = "Head")
	private Head head;
	@JacksonXmlProperty(localName = "Req")
	private Req req;
	@JacksonXmlProperty(localName = "ChannelInfo")
	private ChannelInfo channelInfo;
	@JacksonXmlProperty(localName = "UserInfo")
	private UserInfo userInfo;
	@JacksonXmlProperty(localName = "OtherInfo")
	private OtherInfo otherInfo;
	public GetFIUserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetFIUserInfo(Head head, Req req, ChannelInfo channelInfo, UserInfo userInfo, OtherInfo otherInfo) {
		super();
		this.head = head;
		this.req = req;
		this.channelInfo = channelInfo;
		this.userInfo = userInfo;
		this.otherInfo = otherInfo;
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
	public ChannelInfo getChannelInfo() {
		return channelInfo;
	}
	public void setChannelInfo(ChannelInfo channelInfo) {
		this.channelInfo = channelInfo;
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
