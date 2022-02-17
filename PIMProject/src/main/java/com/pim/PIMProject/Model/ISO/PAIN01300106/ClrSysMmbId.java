package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ClrSysMmbId {
	@JacksonXmlProperty(localName = "MmbId")
	private String mmbId;

	public ClrSysMmbId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClrSysMmbId(String mmbId) {
		super();
		this.mmbId = mmbId;
	}

	public String getMmbId() {
		return mmbId;
	}

	public void setMmbId(String mmbId) {
		this.mmbId = mmbId;
	}
	
}
