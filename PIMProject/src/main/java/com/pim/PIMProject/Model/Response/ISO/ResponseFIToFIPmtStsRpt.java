package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.ISO.Model.GrpHdr;

public class ResponseFIToFIPmtStsRpt {
	@JacksonXmlProperty(localName = "GrpHdr")
	private GrpHdr grpHdr;
}
