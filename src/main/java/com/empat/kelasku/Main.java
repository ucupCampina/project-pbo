package com.empat.kelasku;

import com.empat.kelasku.data.api.jastis.JastisApi;
import com.empat.kelasku.data.api.jastis.JastisApiInterface;
import com.empat.kelasku.data.api.jastis.JastisSocket;
import com.empat.kelasku.data.api.jastis.KelasSocketCallback;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.ui.view.KelasFullView;
import com.empat.kelasku.ui.view.LayoutView;
import com.empat.kelasku.ui.view.LoginView;
import com.empat.kelasku.util.CallbackInterface;

import java.awt.Component;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
		} catch (URISyntaxException e) {
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
