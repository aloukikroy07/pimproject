package com.pim.PIMProject.Model.Request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class FinancialInstitutionInfo {
	private Integer idFinancialInstitutionKey;
	
	@JacksonXmlProperty(localName = "FinancialInstitution")
	private String financialInstitution;
	
	@JacksonXmlProperty(localName = "BranchName")
	private String branchName;
	
	@JacksonXmlProperty(localName = "RoutingNumber")
	private String routingNumber;
	
	@JacksonXmlProperty(localName = "AccountNumber")
	private String accountNumber;

	public FinancialInstitutionInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinancialInstitutionInfo(Integer idFinancialInstitutionKey, String financialInstitution, String branchName,
			String routingNumber, String accountNumber) {
		super();
		this.idFinancialInstitutionKey = idFinancialInstitutionKey;
		this.financialInstitution = financialInstitution;
		this.branchName = branchName;
		this.routingNumber = routingNumber;
		this.accountNumber = accountNumber;
	}

	public Integer getIdFinancialInstitutionKey() {
		return idFinancialInstitutionKey;
	}

	public void setIdFinancialInstitutionKey(Integer idFinancialInstitutionKey) {
		this.idFinancialInstitutionKey = idFinancialInstitutionKey;
	}

	public String getFinancialInstitution() {
		return financialInstitution;
	}

	public void setFinancialInstitution(String financialInstitution) {
		this.financialInstitution = financialInstitution;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
