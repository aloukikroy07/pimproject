package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RTPInfo {
	@JacksonXmlProperty(localName = "RTPID")
	private String rtpid;

	public RTPInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RTPInfo(String rtpid) {
		super();
		this.rtpid = rtpid;
	}

	public String getRtpid() {
		return rtpid;
	}

	public void setRtpid(String rtpid) {
		this.rtpid = rtpid;
	}
	
}
