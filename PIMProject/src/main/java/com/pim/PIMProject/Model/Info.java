package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Info {
	private Integer idInfoKey;
	@JacksonXmlProperty(localName = "EntityType")
	private String EntityType;
	@JacksonXmlProperty(localName = "Name")
	private String Name;
	@JacksonXmlProperty(localName = "AddressLine1")
	private String AddressLine1;
	@JacksonXmlProperty(localName = "AddressLine2")
	private String AddressLine2;
	@JacksonXmlProperty(localName = "District")
	private String District;
	@JacksonXmlProperty(localName = "PostalCode")
	private String PostalCode;
	@JacksonXmlProperty(localName = "MobileNumber")
	private String MobileNumber;
	@JacksonXmlProperty(localName = "Email")
	private String Email;
	@JacksonXmlProperty(localName = "TypeOfOwnership")
	private String TypeOfOwnership;
	@JacksonXmlProperty(localName = "TypeOfBusiness")
	private String TypeOfBusiness;
	@JacksonXmlProperty(localName = "NameOfMinistry")
	private String NameOfMinistry;
	@JacksonXmlProperty(localName = "NameOfDivision")
	private String NameOfDivision;
	@JacksonXmlProperty(localName = "TypeOfFinancialInstitution")
	private String TypeOfFinancialInstitution;
	@JacksonXmlProperty(localName = "SwiftCode")
	private String SwiftCode;
	@JacksonXmlProperty(localName = "CBAccountNumber")
	private String CBAccountNumber;
	@JacksonXmlProperty(localName = "NID")
	private String NID;
	@JacksonXmlProperty(localName = "Head")
	private String TIN;
	@JacksonXmlProperty(localName = "BIN")
	private String BIN;
	@JacksonXmlProperty(localName = "IDTPKey")
	private String IDTPKey;
	@JacksonXmlProperty(localName = "DateOfBirth")
	private String DateOfBirth;
	@JacksonXmlProperty(localName = "CallBackURL")
	private String CallBackURL;
	@JacksonXmlProperty(localName = "Password")
	private String Password;
	
	public Info() {
		super();
	}

	public Info(Integer idInfoKey, String entityType, String name, String addressLine1, String addressLine2,
			String district, String postalCode, String mobileNumber, String email, String typeOfOwnership,
			String typeOfBusiness, String nameOfMinistry, String nameOfDivision, String typeOfFinancialInstitution,
			String swiftCode, String cBAccountNumber, String nID, String tIN, String bIN, String iDTPKey,
			String dateOfBirth, String callBackURL, String password) {
		super();
		this.idInfoKey = idInfoKey;
		EntityType = entityType;
		Name = name;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		District = district;
		PostalCode = postalCode;
		MobileNumber = mobileNumber;
		Email = email;
		TypeOfOwnership = typeOfOwnership;
		TypeOfBusiness = typeOfBusiness;
		NameOfMinistry = nameOfMinistry;
		NameOfDivision = nameOfDivision;
		TypeOfFinancialInstitution = typeOfFinancialInstitution;
		SwiftCode = swiftCode;
		CBAccountNumber = cBAccountNumber;
		NID = nID;
		TIN = tIN;
		BIN = bIN;
		IDTPKey = iDTPKey;
		DateOfBirth = dateOfBirth;
		CallBackURL = callBackURL;
		Password = password;
	}



	public Integer getIdInfoKey() {
		return idInfoKey;
	}

	public void setIdInfoKey(Integer idInfoKey) {
		this.idInfoKey = idInfoKey;
	}

	public String getEntityType() {
		return EntityType;
	}

	public void setEntityType(String entityType) {
		EntityType = entityType;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTypeOfOwnership() {
		return TypeOfOwnership;
	}

	public void setTypeOfOwnership(String typeOfOwnership) {
		TypeOfOwnership = typeOfOwnership;
	}

	public String getTypeOfBusiness() {
		return TypeOfBusiness;
	}

	public void setTypeOfBusiness(String typeOfBusiness) {
		TypeOfBusiness = typeOfBusiness;
	}

	public String getNameOfMinistry() {
		return NameOfMinistry;
	}

	public void setNameOfMinistry(String nameOfMinistry) {
		NameOfMinistry = nameOfMinistry;
	}

	public String getNameOfDivision() {
		return NameOfDivision;
	}

	public void setNameOfDivision(String nameOfDivision) {
		NameOfDivision = nameOfDivision;
	}

	public String getTypeOfFinancialInstitution() {
		return TypeOfFinancialInstitution;
	}

	public void setTypeOfFinancialInstitution(String typeOfFinancialInstitution) {
		TypeOfFinancialInstitution = typeOfFinancialInstitution;
	}

	public String getSwiftCode() {
		return SwiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		SwiftCode = swiftCode;
	}

	public String getCBAccountNumber() {
		return CBAccountNumber;
	}

	public void setCBAccountNumber(String cBAccountNumber) {
		CBAccountNumber = cBAccountNumber;
	}

	public String getNID() {
		return NID;
	}

	public void setNID(String nID) {
		NID = nID;
	}

	public String getTIN() {
		return TIN;
	}

	public void setTIN(String tIN) {
		TIN = tIN;
	}

	public String getBIN() {
		return BIN;
	}

	public void setBIN(String bIN) {
		BIN = bIN;
	}

	public String getIDTPKey() {
		return IDTPKey;
	}

	public void setIDTPKey(String iDTPKey) {
		IDTPKey = iDTPKey;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getCallBackURL() {
		return CallBackURL;
	}

	public void setCallBackURL(String callBackURL) {
		CallBackURL = callBackURL;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	

	
	
	
}
