package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ChannelInfo {
	@JacksonXmlProperty(localName = "ChannelID")
	private String channelID;

	public ChannelInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChannelInfo(String channelID) {
		super();
		this.channelID = channelID;
	}

	public String getChannelID() {
		return channelID;
	}

	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}
}
