package com.empat.kelasku.data.model;

import com.google.gson.annotations.SerializedName;

public class LoginModel {

	@SerializedName("email")
	private String id;
	private String password;
	
	public LoginModel(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}


	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
