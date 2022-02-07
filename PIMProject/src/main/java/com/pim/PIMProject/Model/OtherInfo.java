package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

//@XmlRootElement
public class OtherInfo {
	@JacksonXmlProperty(localName = "Channel")
	private String channel;

	public OtherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OtherInfo(String channel) {
		super();
		this.channel = channel;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
}
