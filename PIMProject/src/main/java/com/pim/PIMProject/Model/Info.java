package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Info {
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer idInfoKey;
	@JacksonXmlProperty(localName = "EntityType")
	private String entityType;
	@JacksonXmlProperty(localName = "Name")
	private String name;
	@JacksonXmlProperty(localName = "AddressLine1")
	private String addressLine1;
	@JacksonXmlProperty(localName = "AddressLine2")
	private String addressLine2;
	@JacksonXmlProperty(localName = "District")
	private String district;
	@JacksonXmlProperty(localName = "PostalCode")
	private String postalCode;
	@JacksonXmlProperty(localName = "MobileNumber")
	private String mobileNumber;
	@JacksonXmlProperty(localName = "Email")
	private String email;
	@JacksonXmlProperty(localName = "TypeOfOwnership")
	private String typeOfOwnership;
	@JacksonXmlProperty(localName = "TypeOfBusiness")
	private String typeOfBusiness;
	@JacksonXmlProperty(localName = "NameOfMinistry")
	private String nameOfMinistry;
	@JacksonXmlProperty(localName = "NameOfDivision")
	private String nameOfDivision;
	@JacksonXmlProperty(localName = "TypeOfFinancialInstitution")
	private String typeOfFinancialInstitution;
	@JacksonXmlProperty(localName = "SwiftCode")
	private String swiftCode;
	@JacksonXmlProperty(localName = "CBAccountNumber")
	private String cBAccountNumber;
	@JacksonXmlProperty(localName = "NID")
	private String nID;
	@JacksonXmlProperty(localName = "TIN")
	private String tIN;
	@JacksonXmlProperty(localName = "BIN")
	private String bIN;
	@JacksonXmlProperty(localName = "IDTPKey")
	private String iDTPKey;
	@JacksonXmlProperty(localName = "DateOfBirth")
	private String dateOfBirth;
	@JacksonXmlProperty(localName = "CallBackURL")
	private String callBackURL;
	@JacksonXmlProperty(localName = "Password")
	private String password;
	
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Info(Integer idInfoKey, String entityType, String name, String addressLine1, String addressLine2,
			String district, String postalCode, String mobileNumber, String email, String typeOfOwnership,
			String typeOfBusiness, String nameOfMinistry, String nameOfDivision, String typeOfFinancialInstitution,
			String swiftCode, String cBAccountNumber, String nID, String tIN, String bIN, String iDTPKey,
			String dateOfBirth, String callBackURL, String password) {
		super();
		this.idInfoKey = idInfoKey;
		this.entityType = entityType;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.postalCode = postalCode;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.typeOfOwnership = typeOfOwnership;
		this.typeOfBusiness = typeOfBusiness;
		this.nameOfMinistry = nameOfMinistry;
		this.nameOfDivision = nameOfDivision;
		this.typeOfFinancialInstitution = typeOfFinancialInstitution;
		this.swiftCode = swiftCode;
		this.cBAccountNumber = cBAccountNumber;
		this.nID = nID;
		this.tIN = tIN;
		this.bIN = bIN;
		this.iDTPKey = iDTPKey;
		this.dateOfBirth = dateOfBirth;
		this.callBackURL = callBackURL;
		this.password = password;
	}

	public Integer getIdInfoKey() {
		return idInfoKey;
	}

	public void setIdInfoKey(Integer idInfoKey) {
		this.idInfoKey = idInfoKey;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeOfOwnership() {
		return typeOfOwnership;
	}

	public void setTypeOfOwnership(String typeOfOwnership) {
		this.typeOfOwnership = typeOfOwnership;
	}

	public String getTypeOfBusiness() {
		return typeOfBusiness;
	}

	public void setTypeOfBusiness(String typeOfBusiness) {
		this.typeOfBusiness = typeOfBusiness;
	}

	public String getNameOfMinistry() {
		return nameOfMinistry;
	}

	public void setNameOfMinistry(String nameOfMinistry) {
		this.nameOfMinistry = nameOfMinistry;
	}

	public String getNameOfDivision() {
		return nameOfDivision;
	}

	public void setNameOfDivision(String nameOfDivision) {
		this.nameOfDivision = nameOfDivision;
	}

	public String getTypeOfFinancialInstitution() {
		return typeOfFinancialInstitution;
	}

	public void setTypeOfFinancialInstitution(String typeOfFinancialInstitution) {
		this.typeOfFinancialInstitution = typeOfFinancialInstitution;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getcBAccountNumber() {
		return cBAccountNumber;
	}

	public void setcBAccountNumber(String cBAccountNumber) {
		this.cBAccountNumber = cBAccountNumber;
	}

	public String getnID() {
		return nID;
	}

	public void setnID(String nID) {
		this.nID = nID;
	}

	public String gettIN() {
		return tIN;
	}

	public void settIN(String tIN) {
		this.tIN = tIN;
	}

	public String getbIN() {
		return bIN;
	}

	public void setbIN(String bIN) {
		this.bIN = bIN;
	}

	public String getiDTPKey() {
		return iDTPKey;
	}

	public void setiDTPKey(String iDTPKey) {
		this.iDTPKey = iDTPKey;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCallBackURL() {
		return callBackURL;
	}

	public void setCallBackURL(String callBackURL) {
		this.callBackURL = callBackURL;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
