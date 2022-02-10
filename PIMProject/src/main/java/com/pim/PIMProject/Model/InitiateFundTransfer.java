package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class InitiateFundTransfer {
	@JacksonXmlProperty(localName = "xmlns:idtp", isAttribute = true)
	private String xmlns="http://example.com";
	@JacksonXmlProperty(localName = "Head")
	private Head head;
	@JacksonXmlProperty(localName = "Req")
	private Req req;
	@JacksonXmlProperty(localName = "ChannelInfo")
	private ChannelInfo channelInfo;
	@JacksonXmlProperty(localName = "TransactionInfo")
	private TransactionInfo transactionInfo;
	public InitiateFundTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InitiateFundTransfer(String xmlns, Head head, Req req, ChannelInfo channelInfo,
			TransactionInfo transactionInfo) {
		super();
		this.xmlns = xmlns;
		this.head = head;
		this.req = req;
		this.channelInfo = channelInfo;
		this.transactionInfo = transactionInfo;
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
	public ChannelInfo getChannelInfo() {
		return channelInfo;
	}
	public void setChannelInfo(ChannelInfo channelInfo) {
		this.channelInfo = channelInfo;
	}
	public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}
	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}
}
