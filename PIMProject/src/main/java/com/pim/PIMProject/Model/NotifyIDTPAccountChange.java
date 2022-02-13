package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class NotifyIDTPAccountChange {
	@JacksonXmlProperty(localName = "Head")
	private Head head;
	@JacksonXmlProperty(localName = "Req")
	private Req req;
	@JacksonXmlProperty(localName = "ChannelInfo")
	private ChannelInfo channelInfo;
	@JacksonXmlProperty(localName = "DeviceInfo")
	private DeviceInfo deviceInfo;
	@JacksonXmlProperty(localName = "UserInfo")
	private UserInfo userInfo;
	public NotifyIDTPAccountChange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NotifyIDTPAccountChange(Head head, Req req, ChannelInfo channelInfo, DeviceInfo deviceInfo,
			UserInfo userInfo) {
		super();
		this.head = head;
		this.req = req;
		this.channelInfo = channelInfo;
		this.deviceInfo = deviceInfo;
		this.userInfo = userInfo;
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
	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	
}
