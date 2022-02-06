package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OtherInfo {
	private String Channel;

	public String getChannel() {
		return Channel;
	}
	
	public OtherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OtherInfo(String channel) {
		super();
		Channel = channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}
}
