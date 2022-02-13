package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GetTransactionsbyFI {
	@JacksonXmlProperty(localName = "Head")
	private Head head;
	@JacksonXmlProperty(localName = "Req")
	private Req req;
	@JacksonXmlProperty(localName = "ChannelInfo")
	private ChannelInfo channelInfo;
	@JacksonXmlProperty(localName = "ReqInfo")
	private ReqInfo reqInfo;
	public GetTransactionsbyFI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetTransactionsbyFI(Head head, Req req, ChannelInfo channelInfo, ReqInfo reqInfo) {
		super();
		this.head = head;
		this.req = req;
		this.channelInfo = channelInfo;
		this.reqInfo = reqInfo;
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
	public ReqInfo getReqInfo() {
		return reqInfo;
	}
	public void setReqInfo(ReqInfo reqInfo) {
		this.reqInfo = reqInfo;
	}
	
}
