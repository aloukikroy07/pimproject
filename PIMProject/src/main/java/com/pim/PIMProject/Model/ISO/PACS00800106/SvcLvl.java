package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SvcLvl {
	@JacksonXmlProperty(localName = "Prtry")
	private String prtry;
	@JacksonXmlProperty(localName = "Cd")
	private String cd;
	
	public SvcLvl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SvcLvl(String prtry, String cd) {
		super();
		this.prtry = prtry;
		this.cd = cd;
	}

	public String getPrtry() {
		return prtry;
	}

	public void setPrtry(String prtry) {
		this.prtry = prtry;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	
}
