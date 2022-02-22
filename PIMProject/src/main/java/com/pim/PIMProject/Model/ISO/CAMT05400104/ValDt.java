package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ValDt {
	@JacksonXmlProperty(localName = "Dt")
	private String dt;

	public ValDt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValDt(String dt) {
		super();
		this.dt = dt;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}
	
}
