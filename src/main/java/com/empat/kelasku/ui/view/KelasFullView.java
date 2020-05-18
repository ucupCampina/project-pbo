package com.empat.kelasku.ui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.empat.kelasku.data.controller.LayoutController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.util.stream.IntStream;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KelasFullView extends JFrame {

	private JPanel contentPane;

	public KelasFullView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel kelasKosongSaatLabel = new JLabel("Kelas Kosong Saat Ini");
		kelasKosongSaatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(kelasKosongSaatLabel, BorderLayout.NORTH);

		JPanel kelasKosongContainer = new JPanel();
		contentPane.add(kelasKosongContainer, BorderLayout.CENTER);
		kelasKosongContainer.setLayout(new GridLayout(0, 4, 0, 0));

		IntStream.range(0, 10).forEach(n -> {
			kelasKosongContainer.add(createKelasKosongItem("Kelas " + n));
		});
	}

	public JPanel createKelasKosongItem(String namaKelas) {
		JPanel kelasKosongItem = new JPanel();
		JLabel kelasKosongLabel = new JLabel(namaKelas);
		kelasKosongItem.add(kelasKosongLabel);
		return kelasKosongItem;
	}

}
