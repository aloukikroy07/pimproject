package com.pim.PIMProject.Model;

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
	
	@JacksonXmlProperty(localName = "AccountingNumber")
	private String accountingNumber;
	
	public FinancialInstitutionInfo() {
		super();
	}

	public FinancialInstitutionInfo(Integer idFinancialInstitutionKey, String financialInstitution, String branchName,
			String routingNumber, String accountingNumber) {
		super();
		this.idFinancialInstitutionKey = idFinancialInstitutionKey;
		this.financialInstitution = financialInstitution;
		this.branchName = branchName;
		this.routingNumber = routingNumber;
		this.accountingNumber = accountingNumber;
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

	public String getAccountingNumber() {
		return accountingNumber;
	}

	public void setAccountingNumber(String accountingNumber) {
		this.accountingNumber = accountingNumber;
	}

	
	
	
}
