package com.pim.PIMProject.Model.Request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Head {
	
	@JacksonXmlProperty(isAttribute = true)
	private String ver;
	
	@JacksonXmlProperty(isAttribute = true)
	private String ts;
	
	@JacksonXmlProperty(isAttribute = true)
	private String orgId;
	
	@JacksonXmlProperty(isAttribute = true)
	private String msgId;
	
	public Head() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Head(String ver, String ts, String orgId, String msgId) {
		super();
		this.ver = ver;
		this.ts = ts;
		this.orgId = orgId;
		this.msgId = msgId;
	}



	public String getVer() {
		return ver;
	}



	public void setVer(String ver) {
		this.ver = ver;
	}



	public String getTs() {
		return ts;
	}



	public void setTs(String ts) {
		this.ts = ts;
	}



	public String getOrgId() {
		return orgId;
	}



	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}



	public String getMsgId() {
		return msgId;
	}



	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

}
