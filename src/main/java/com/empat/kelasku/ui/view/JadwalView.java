package com.empat.kelasku.ui.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.ui.view.components.CustomCardComponent;

public class JadwalView extends JPanel {
	
	public static String tingkat = "11", jurusan = "RPL", rombel = "1";
	
	private JPanel jadwalHariIniContainer;

	public JadwalView() {
		setLayout(new BorderLayout(0, 0));

		JLabel jadwalHariIniLabel = new JLabel("Jadwal Hari Ini");
		jadwalHariIniLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(jadwalHariIniLabel, BorderLayout.NORTH);

		jadwalHariIniContainer = new JPanel();
		jadwalHariIniContainer.setBackground(Color.WHITE);
		add(jadwalHariIniContainer, BorderLayout.CENTER);
		GridLayout gridLayout = new GridLayout(0, 3, 4, 4);
		jadwalHariIniContainer.setLayout(gridLayout);
	}

	public void createJadwalHariIni(ArrayList<JadwalModel> listJadwal) {
		LayoutController.removePanelComponents(jadwalHariIniContainer);
		listJadwal.forEach(n -> {
			if (n != null) {
				jadwalHariIniContainer.add(createJadwalHariIniItem(n.getPelajaran()));
				jadwalHariIniContainer.revalidate();
				jadwalHariIniContainer.repaint();
			}
		});
	}

	public Container createJadwalHariIniItem(String namaKelas) {
		Container jadwalItem = new CustomCardComponent(namaKelas);
		return jadwalItem;
	}

	public JPanel getJadwalHariIniContainer() {
		return jadwalHariIniContainer;
	}
}
