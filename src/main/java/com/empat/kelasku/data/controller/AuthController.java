package com.empat.kelasku.data.controller;

import java.util.concurrent.BlockingQueue;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.api.jastis.JastisApi;
import com.empat.kelasku.data.model.LoginModel;
import com.empat.kelasku.data.model.ResponseModel;

public class AuthController {

	public static boolean belumAdaDataUser = true;

	public static boolean loginUser(String id, String password) {
		if (belumAdaDataUser) {
			if (id.equals(password)) {
				return true;
			}
			return false;
		}
		BlockingQueue<ResponseModel> blockingQ = JastisApi.loginUser(new LoginModel(id, password));
		ResponseModel response = null;
		try {
			response = blockingQ.take();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		if (response != null) {

			if (response.getStatus().equals("success")) {
				return true;

			}
		}
		return false;
	}

	public static void logoutUser() {
		java.awt.Window win[] = java.awt.Window.getWindows();
		for (int i = 0; i < win.length; i++) {
			win[i].dispose();
		}
		Main.loginPage();
	}

}
