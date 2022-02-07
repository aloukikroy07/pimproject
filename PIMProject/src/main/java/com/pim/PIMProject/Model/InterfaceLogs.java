package com.pim.PIMProject.Model;

import java.sql.Timestamp;

public class InterfaceLogs {
	private int id;
	private int companyId;
	private int apiProvidersId;
	private int apiClassesId;
	private String requestId;
	private Timestamp requestTime;
	private String requestName;
	private String requestParams;
	private String response;
	private Timestamp responseTime;
	private String responseResult;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public InterfaceLogs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterfaceLogs(int id, int companyId, int apiProvidersId, int apiClassesId, String requestId,
			Timestamp requestTime, String requestName, String requestParams, String response, Timestamp responseTime,
			String responseResult, Timestamp createdAt, Timestamp updatedAt) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.apiProvidersId = apiProvidersId;
		this.apiClassesId = apiClassesId;
		this.requestId = requestId;
		this.requestTime = requestTime;
		this.requestName = requestName;
		this.requestParams = requestParams;
		this.response = response;
		this.responseTime = responseTime;
		this.responseResult = responseResult;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getApiProvidersId() {
		return apiProvidersId;
	}

	public void setApiProvidersId(int apiProvidersId) {
		this.apiProvidersId = apiProvidersId;
	}

	public int getApiClassesId() {
		return apiClassesId;
	}

	public void setApiClassesId(int apiClassesId) {
		this.apiClassesId = apiClassesId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Timestamp getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Timestamp getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Timestamp responseTime) {
		this.responseTime = responseTime;
	}

	public String getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(String responseResult) {
		this.responseResult = responseResult;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
