package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PAIN01300106.InitgPty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GrpHdr {
	@JacksonXmlProperty(localName = "MsgId")
	private String msgId;
	@JacksonXmlProperty(localName = "CreDtTm")
	private String creDtTm;
	@JacksonXmlProperty(localName = "NbOfTxs")
	private String nbOfTxs;
	@JacksonXmlProperty(localName = "CtrlSum")
	private String ctrlSum;
	@JacksonXmlProperty(localName = "TtlIntrBkSttlmAmt")
	private String ttlIntrBkSttlmAmt;
	@JacksonXmlProperty(localName = "IntrBkSttlmDt")
	private String intrBkSttlmDt;
	@JacksonXmlProperty(localName = "SttlmInf")
	private SttlmInf sttlmInf;
	@JacksonXmlProperty(localName = "InitgPty")
	private InitgPty initgPty;
	public GrpHdr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GrpHdr(String msgId, String creDtTm, String nbOfTxs, String ctrlSum, String ttlIntrBkSttlmAmt,
			String intrBkSttlmDt, SttlmInf sttlmInf, InitgPty initgPty) {
		super();
		this.msgId = msgId;
		this.creDtTm = creDtTm;
		this.nbOfTxs = nbOfTxs;
		this.ctrlSum = ctrlSum;
		this.ttlIntrBkSttlmAmt = ttlIntrBkSttlmAmt;
		this.intrBkSttlmDt = intrBkSttlmDt;
		this.sttlmInf = sttlmInf;
		this.initgPty = initgPty;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getCreDtTm() {
		return creDtTm;
	}
	public void setCreDtTm(String creDtTm) {
		this.creDtTm = creDtTm;
	}
	public String getNbOfTxs() {
		return nbOfTxs;
	}
	public void setNbOfTxs(String nbOfTxs) {
		this.nbOfTxs = nbOfTxs;
	}
	public String getCtrlSum() {
		return ctrlSum;
	}
	public void setCtrlSum(String ctrlSum) {
		this.ctrlSum = ctrlSum;
	}
	public String getTtlIntrBkSttlmAmt() {
		return ttlIntrBkSttlmAmt;
	}
	public void setTtlIntrBkSttlmAmt(String ttlIntrBkSttlmAmt) {
		this.ttlIntrBkSttlmAmt = ttlIntrBkSttlmAmt;
	}
	public String getIntrBkSttlmDt() {
		return intrBkSttlmDt;
	}
	public void setIntrBkSttlmDt(String intrBkSttlmDt) {
		this.intrBkSttlmDt = intrBkSttlmDt;
	}
	public SttlmInf getSttlmInf() {
		return sttlmInf;
	}
	public void setSttlmInf(SttlmInf sttlmInf) {
		this.sttlmInf = sttlmInf;
	}
	public InitgPty getInitgPty() {
		return initgPty;
	}
	public void setInitgPty(InitgPty initgPty) {
		this.initgPty = initgPty;
	}
	
}
