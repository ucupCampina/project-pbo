package com.empat.kelasku.data.model;

public class ResponseModel {
	private String status;
	private String message;
	private Object data;

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
