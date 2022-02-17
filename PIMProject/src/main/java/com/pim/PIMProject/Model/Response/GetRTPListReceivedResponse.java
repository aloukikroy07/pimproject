package com.pim.PIMProject.Model.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetRTPListReceivedResponse {
	@JacksonXmlProperty(localName = "Code")
	private String code;
	@JacksonXmlProperty(localName = "Message")
	private String message;
	@JacksonXmlProperty(localName = "RTP")
	private RTP rtp;
	public GetRTPListReceivedResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetRTPListReceivedResponse(String code, String message, RTP rtp) {
		super();
		this.code = code;
		this.message = message;
		this.rtp = rtp;
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
	public RTP getRtp() {
		return rtp;
	}
	public void setRtp(RTP rtp) {
		this.rtp = rtp;
	}
	
}
