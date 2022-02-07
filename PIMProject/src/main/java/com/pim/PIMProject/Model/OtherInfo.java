package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class OtherInfo {
	@JacksonXmlProperty(localName = "Channel")
	private String Channel;

	public OtherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}
	
}
