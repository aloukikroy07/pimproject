package com.pim.PIMProject.Model.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetTransactionsbyFIResponse {
	@JacksonXmlProperty(localName = "Code")
	private String code;
	@JacksonXmlProperty(localName = "Message")
	private String message;
	@JacksonXmlProperty(localName = "Transaction")
	private Transaction transaction; 
}
