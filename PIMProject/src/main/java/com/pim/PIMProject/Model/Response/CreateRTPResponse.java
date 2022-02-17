package com.pim.PIMProject.Model.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CreateRTPResponse {
	@JacksonXmlProperty(localName = "Code")
	private String code;
	@JacksonXmlProperty(localName = "Message")
	private String message;
	@JacksonXmlProperty(localName = "ReqId")
	private String reqId;
	public CreateRTPResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateRTPResponse(String code, String message, String reqId) {
		super();
		this.code = code;
		this.message = message;
		this.reqId = reqId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
}
