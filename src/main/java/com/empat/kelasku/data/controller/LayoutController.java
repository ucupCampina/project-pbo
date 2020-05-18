package com.empat.kelasku.data.controller;

import java.awt.Component;

import javax.swing.JPanel;

import com.empat.kelasku.data.model.ContentViewEnum;
import com.empat.kelasku.ui.view.JadwalView;
import com.empat.kelasku.ui.view.KelasView;
import com.empat.kelasku.ui.view.UserView;

public class LayoutController {
	
	public static void renderContent(JPanel contentPanel, ContentViewEnum view) {
		switch (view) {
		case KelasView:
			contentPanel.add(new KelasView());
			break;
		case JadwalView:
			contentPanel.add(new JadwalView());
			break;
		case UserView:
			contentPanel.add(new UserView());
			break;
			
		default:
			break;
		}
	}
	
	public static void removePanelComponents(JPanel panel) {
		Component[] componentList = panel.getComponents();
		
		if (componentList.length >= 0) {
			for(Component c : componentList){
				panel.remove(c);
				panel.revalidate();
				panel.repaint();
			}			
		}
	}
}
