package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SenderInfo {
	@JacksonXmlProperty(localName = "SenderVID")
	private SenderVID senderVID;

	public SenderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SenderInfo(SenderVID senderVID) {
		super();
		this.senderVID = senderVID;
	}

	public SenderVID getSenderVID() {
		return senderVID;
	}

	public void setSenderVID(SenderVID senderVID) {
		this.senderVID = senderVID;
	} 
	
}
