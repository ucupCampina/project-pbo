package com.empat.kelasku;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
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
	public static boolean isRequestKelasViewRendered = false;
	public static boolean isEditInfoViewRendered = false;

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
				LoginView loginView = new LoginView();
				loginView.setVisible(true);
			}
		});
	}

	public static void mainPage() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				LayoutView layoutView = new LayoutView();
//				layoutView.setLocationRelativeTo(null);
				layoutView.setVisible(true);
			}
		});
	}
	
	public static void centeredFrame(javax.swing.JFrame objFrame){
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY); 
    } 


}
