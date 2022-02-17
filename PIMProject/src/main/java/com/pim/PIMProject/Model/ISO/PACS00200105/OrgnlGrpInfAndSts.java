package com.pim.PIMProject.Model.ISO.PACS00200105;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrgnlGrpInfAndSts {
	@JacksonXmlProperty(localName = "OrgnlMsgId")
	private String orgnlMsgId;
	@JacksonXmlProperty(localName = "OrgnlMsgNmId")
	private String orgnlMsgNmId;
	@JacksonXmlProperty(localName = "OrgnlCreDtTm")
	private String orgnlCreDtTm;
	@JacksonXmlProperty(localName = "GrpSts")
	private String grpSts;
	@JacksonXmlProperty(localName = "StsRsnInf")
	private StsRsnInf stsRsnInf;
	@JacksonXmlProperty(localName = "OrgnlNbOfTxs")
	private String orgnlNbOfTxs;
	public OrgnlGrpInfAndSts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrgnlGrpInfAndSts(String orgnlMsgId, String orgnlMsgNmId, String orgnlCreDtTm, String grpSts,
			StsRsnInf stsRsnInf, String orgnlNbOfTxs) {
		super();
		this.orgnlMsgId = orgnlMsgId;
		this.orgnlMsgNmId = orgnlMsgNmId;
		this.orgnlCreDtTm = orgnlCreDtTm;
		this.grpSts = grpSts;
		this.stsRsnInf = stsRsnInf;
		this.orgnlNbOfTxs = orgnlNbOfTxs;
	}
	public String getOrgnlMsgId() {
		return orgnlMsgId;
	}
	public void setOrgnlMsgId(String orgnlMsgId) {
		this.orgnlMsgId = orgnlMsgId;
	}
	public String getOrgnlMsgNmId() {
		return orgnlMsgNmId;
	}
	public void setOrgnlMsgNmId(String orgnlMsgNmId) {
		this.orgnlMsgNmId = orgnlMsgNmId;
	}
	public String getOrgnlCreDtTm() {
		return orgnlCreDtTm;
	}
	public void setOrgnlCreDtTm(String orgnlCreDtTm) {
		this.orgnlCreDtTm = orgnlCreDtTm;
	}
	public String getGrpSts() {
		return grpSts;
	}
	public void setGrpSts(String grpSts) {
		this.grpSts = grpSts;
	}
	public StsRsnInf getStsRsnInf() {
		return stsRsnInf;
	}
	public void setStsRsnInf(StsRsnInf stsRsnInf) {
		this.stsRsnInf = stsRsnInf;
	}
	public String getOrgnlNbOfTxs() {
		return orgnlNbOfTxs;
	}
	public void setOrgnlNbOfTxs(String orgnlNbOfTxs) {
		this.orgnlNbOfTxs = orgnlNbOfTxs;
	}
	
}
