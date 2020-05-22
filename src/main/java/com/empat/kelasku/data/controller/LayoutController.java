package com.empat.kelasku.data.controller;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.api.jastis.JastisApi;
import com.empat.kelasku.data.model.ContentViewEnum;
import com.empat.kelasku.ui.view.JadwalView;
import com.empat.kelasku.ui.view.KelasView;
import com.empat.kelasku.ui.view.ProfileView;

public class LayoutController {
	

	public static void renderContent(JPanel contentPanel, ContentViewEnum view) {
		switch (view) {
		case KelasView:
			Main.activeContentPanelView = new KelasView();
			contentPanel.add(((KelasView) Main.activeContentPanelView).getContentPane());
			break;
		case JadwalView:
			Main.activeContentPanelView = new JadwalView();
			contentPanel.add(((JadwalView) Main.activeContentPanelView).getContentPane());
			if (Main.listJadwal == null) {
				JastisApi.getJadwal(JadwalView.tingkat, JadwalView.jurusan, JadwalView.rombel);
			}
			if (Main.listJadwal != null) {
				((JadwalView) Main.activeContentPanelView).createJadwalHariIni(Main.listJadwal);				
			}
			break;
		case UserView:
			Main.activeContentPanelView = new ProfileView();
			contentPanel.add(((ProfileView) Main.activeContentPanelView).getContentPane());
			break;
			
		default:
			break;
		}
	}
	
	public static void removePanelComponents(JPanel panel) {
		Component[] componentList = panel.getComponents();
		
		if (componentList.length >= 1) {
			for(Component c : componentList){
				panel.remove(c);
			}
			panel.revalidate();
			panel.repaint();
		}

		
	}

}
