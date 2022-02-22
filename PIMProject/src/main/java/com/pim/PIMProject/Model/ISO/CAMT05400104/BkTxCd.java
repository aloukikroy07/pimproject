package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BkTxCd {
	@JacksonXmlProperty(localName = "Prtry")
	private Prtry prtry;

	public BkTxCd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BkTxCd(Prtry prtry) {
		super();
		this.prtry = prtry;
	}

	public Prtry getPrtry() {
		return prtry;
	}

	public void setPrtry(Prtry prtry) {
		this.prtry = prtry;
	}
	
}
