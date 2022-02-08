package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ReceiverInfo {
	@JacksonXmlProperty(localName = "ReceiverVID")
	private SenderVID receiverVID;

	public ReceiverInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiverInfo(SenderVID receiverVID) {
		super();
		this.receiverVID = receiverVID;
	}

	public SenderVID getReceiverVID() {
		return receiverVID;
	}

	public void setReceiverVID(SenderVID receiverVID) {
		this.receiverVID = receiverVID;
	}
}
