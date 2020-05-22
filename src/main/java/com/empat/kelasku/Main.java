package com.empat.kelasku;

import java.awt.Component;
import java.util.ArrayList;

import com.empat.kelasku.data.api.jastis.JastisSocket;
import com.empat.kelasku.data.api.jastis.KelasSocketCallback;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.ui.view.KelasFullView;
import com.empat.kelasku.ui.view.LayoutView;
import com.empat.kelasku.ui.view.LoginView;

public class Main {

	public static JastisSocket jastisSocket;
	public static KelasSocketModel kelasSocket;
	
	public static KelasFullView kelasFullView;
	public static ArrayList<JadwalModel> listJadwal;
	
	public static Component activeContentPanelView;
	public static boolean isKelasFullViewRendered = false;

	public static void main(String[] args) {
		startKelasSocket();
		loginPage();
	}

	public static void startKelasSocket() {
		jastisSocket = JastisSocket.getInstance();
		try {
			jastisSocket.connect();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		KelasSocketCallback kelasSocketCallback = new KelasSocketCallback();
		jastisSocket.listenForEmptyClass(kelasSocketCallback);
	}

	public static void loginPage() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginView().setVisible(true);
			}
		});
	}

	public static void mainPage() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LayoutView().setVisible(true);
			}
		});
	}


}
