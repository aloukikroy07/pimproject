package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SplmtryData {
	@JacksonXmlProperty(localName = "PlcAndNm")
	private String plcAndNm;
	@JacksonXmlProperty(localName = "Envlp")
	private Envlp envlp;
	public SplmtryData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SplmtryData(String plcAndNm, Envlp envlp) {
		super();
		this.plcAndNm = plcAndNm;
		this.envlp = envlp;
	}
	public String getPlcAndNm() {
		return plcAndNm;
	}
	public void setPlcAndNm(String plcAndNm) {
		this.plcAndNm = plcAndNm;
	}
	public Envlp getEnvlp() {
		return envlp;
	}
	public void setEnvlp(Envlp envlp) {
		this.envlp = envlp;
	}
	
}
