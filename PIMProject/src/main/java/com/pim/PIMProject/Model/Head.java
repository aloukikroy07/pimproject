package com.pim.PIMProject.Model;

import java.sql.Timestamp;

public class Head {
	private String ver;
	private Timestamp ts;
	private String orgId;
	private String msgId;
	
	public Head() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Head(String ver, Timestamp ts, String orgId, String msgId) {
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
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
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
