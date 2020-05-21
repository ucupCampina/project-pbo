package com.empat.kelasku.ui.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.data.model.KelasSocketModel;

import java.awt.GridLayout;

public class JadwalView extends JPanel {
	private JPanel jadwalHariIniContainer;

	public JadwalView() {
		setLayout(new BorderLayout(0, 0));

		JLabel jadwalHariIniLabel = new JLabel("Jadwal Hari Ini");
		jadwalHariIniLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(jadwalHariIniLabel, BorderLayout.NORTH);

		jadwalHariIniContainer = new JPanel();
		add(jadwalHariIniContainer, BorderLayout.CENTER);
		jadwalHariIniContainer.setLayout(new GridLayout(0, 3, 0, 0));
	}

	public void createJadwalHariIni(ArrayList<JadwalModel> listJadwal) {
		LayoutController.removePanelComponents(jadwalHariIniContainer);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		listJadwal.forEach(n -> {
			if (n != null) {
				jadwalHariIniContainer.add(createJadwalHariIniItem(n.getPelajaran()));
				jadwalHariIniContainer.revalidate();
				jadwalHariIniContainer.repaint();
			}
		});
	}

	public JPanel createJadwalHariIniItem(String namaKelas) {
		JPanel jadwalItem = new JPanel();
		JLabel jadwalLabel = new JLabel(namaKelas);
		jadwalItem.add(jadwalLabel);
		return jadwalItem;
	}

	public JPanel getJadwalHariIniContainer() {
		return jadwalHariIniContainer;
	}
}
