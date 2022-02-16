package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SttlmInf {
	@JacksonXmlProperty(localName = "SttlmMtd")
	private String sttlmMtd;

	public SttlmInf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SttlmInf(String sttlmMtd) {
		super();
		this.sttlmMtd = sttlmMtd;
	}

	public String getSttlmMtd() {
		return sttlmMtd;
	}

	public void setSttlmMtd(String sttlmMtd) {
		this.sttlmMtd = sttlmMtd;
	}
	
}
