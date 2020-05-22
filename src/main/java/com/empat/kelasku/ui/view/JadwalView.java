package com.empat.kelasku.ui.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.empat.kelasku.data.api.jastis.JastisApi;
import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.ui.view.components.CustomCardComponent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class JadwalView extends JFrame {

	public static String tingkat = "11", jurusan = "RPL", rombel = "1";

	public String[] semuaKelas = new String[] { "11-RPL-1", "11-RPL-2", "11-RPL-3", };

	private JComboBox<String> kelasDropdown;
	private JPanel jadwalHariIniContainer;

	public JadwalView() {
		getContentPane().setBackground(Color.WHITE);

		setUndecorated(true);

		JPanel jadwalHeader = new JPanel();
		jadwalHeader.setLayout(new GridLayout(1, 2, 0, 0));

		JLabel jadwalHariIniLabel = new JLabel("Jadwal Hari Ini");
		jadwalHariIniLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jadwalHeader.add(jadwalHariIniLabel);

		kelasDropdown = new JComboBox<String>();
		kelasDropdown.setModel(new DefaultComboBoxModel(semuaKelas));
		jadwalHeader.add(kelasDropdown);

		kelasDropdown.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {
					String selected = ((String) kelasDropdown.getSelectedItem());
					String[] splitted = selected.split("-");

					tingkat = splitted[0];
					jurusan = splitted[1];
					rombel = splitted[2];

					JastisApi.getJadwal(tingkat, jurusan, rombel);

				}
			}
		});

		jadwalHariIniContainer = new JPanel();
		jadwalHariIniContainer.setBackground(Color.WHITE);
		jadwalHariIniContainer.setLayout(new GridLayout(1, 1, 4, 4));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(29).addComponent(jadwalHeader,
										GroupLayout.PREFERRED_SIZE, 491, GroupLayout.PREFERRED_SIZE))
								.addComponent(jadwalHariIniContainer, GroupLayout.PREFERRED_SIZE, 544,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(129, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(23)
				.addComponent(jadwalHeader, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(jadwalHariIniContainer, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(56, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);

		JLabel lblLoading = new JLabel("Loading...");
		lblLoading.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoading.setFont(new Font("Dialog", Font.BOLD, 20));
//		jadwalHariIniContainer.add(lblLoading);
	}

	public void createJadwalHariIni(ArrayList<JadwalModel> listJadwal) {
		LayoutController.removePanelComponents(jadwalHariIniContainer);
		jadwalHariIniContainer.setLayout(new GridLayout(0, 3, 4, 4));
		System.out.println(jadwalHariIniContainer.getComponents() + " " + listJadwal.size());
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

	public JComboBox getKelasDropdown() {
		return kelasDropdown;
	}
}
