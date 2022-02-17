package com.pim.PIMProject.Model.ISO.PACS00200105;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Rsn {
	@JacksonXmlProperty(localName = "Cd")
	private String cd;
	@JacksonXmlProperty(localName = "Prtry")
	private String prtry;
	@JacksonXmlProperty(localName = "AddtlInf")
	private String addtlInf;

	public Rsn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rsn(String cd, String prtry, String addtlInf) {
		super();
		this.cd = cd;
		this.prtry = prtry;
		this.addtlInf = addtlInf;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getPrtry() {
		return prtry;
	}

	public void setPrtry(String prtry) {
		this.prtry = prtry;
	}

	public String getAddtlInf() {
		return addtlInf;
	}

	public void setAddtlInf(String addtlInf) {
		this.addtlInf = addtlInf;
	}
}
