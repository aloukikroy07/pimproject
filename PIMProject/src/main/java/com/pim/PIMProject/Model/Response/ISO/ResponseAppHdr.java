package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.ISO.Model.Fr;
import com.pim.PIMProject.ISO.Model.To;

public class ResponseAppHdr {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn:iso:std:iso:20022:tech:xsd:head.001.001.01";
	@JacksonXmlProperty(localName = "Fr")
	private Fr fr;
	@JacksonXmlProperty(localName = "To")
	private To to;
	@JacksonXmlProperty(localName = "BizMsgIdr")
	private String bizMsgIdr;
	@JacksonXmlProperty(localName = "MsgDefIdr")
	private String msgDefIdr;
	@JacksonXmlProperty(localName = "BizSvc")
	private String bizSvc;
	@JacksonXmlProperty(localName = "CreDt")
	private String creDt;
	public ResponseAppHdr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseAppHdr(String xmlns, Fr fr, To to, String bizMsgIdr, String msgDefIdr, String bizSvc, String creDt) {
		super();
		this.xmlns = xmlns;
		this.fr = fr;
		this.to = to;
		this.bizMsgIdr = bizMsgIdr;
		this.msgDefIdr = msgDefIdr;
		this.bizSvc = bizSvc;
		this.creDt = creDt;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public Fr getFr() {
		return fr;
	}
	public void setFr(Fr fr) {
		this.fr = fr;
	}
	public To getTo() {
		return to;
	}
	public void setTo(To to) {
		this.to = to;
	}
	public String getBizMsgIdr() {
		return bizMsgIdr;
	}
	public void setBizMsgIdr(String bizMsgIdr) {
		this.bizMsgIdr = bizMsgIdr;
	}
	public String getMsgDefIdr() {
		return msgDefIdr;
	}
	public void setMsgDefIdr(String msgDefIdr) {
		this.msgDefIdr = msgDefIdr;
	}
	public String getBizSvc() {
		return bizSvc;
	}
	public void setBizSvc(String bizSvc) {
		this.bizSvc = bizSvc;
	}
	public String getCreDt() {
		return creDt;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
}
