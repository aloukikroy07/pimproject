package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class OrgnlBizQry {
	@JacksonXmlProperty(localName = "MsgId")
	private String msgId;

	public OrgnlBizQry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrgnlBizQry(String msgId) {
		super();
		this.msgId = msgId;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	
}
