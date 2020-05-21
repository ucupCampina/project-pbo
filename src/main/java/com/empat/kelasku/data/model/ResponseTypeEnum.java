package com.empat.kelasku.data.model;

public enum ResponseTypeEnum {
	Success("success"),
	Error("error");

	private String status;
	
	ResponseTypeEnum(String status) {
		this.status = status;
	}
}
