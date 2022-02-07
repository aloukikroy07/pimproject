package com.pim.PIMProject.Model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Creds {
	@JacksonXmlProperty(localName = "Cred")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Cred> creds= new ArrayList<>();

	public List<Cred> getCreds() {
		return creds;
	}

	public void setCreds(List<Cred> creds) {
		this.creds = creds;
	}
}
