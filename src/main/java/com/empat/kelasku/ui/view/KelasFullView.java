package com.empat.kelasku.ui.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.ui.view.components.CustomCardComponent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KelasFullView extends JFrame {

	private JPanel contentPane;
	private JPanel kelasKosongContainer;

	public KelasFullView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel kelasKosongSaatIniLabel = new JLabel("Kelas Kosong Saat Ini");
		kelasKosongSaatIniLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createKelasKosong(Main.kelasSocket);
			}
		});
		kelasKosongSaatIniLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(kelasKosongSaatIniLabel, BorderLayout.NORTH);

		kelasKosongContainer = new JPanel();
		contentPane.add(kelasKosongContainer, BorderLayout.CENTER);
		kelasKosongContainer.setLayout(new GridLayout(0, 4, 0, 0));
		
		if (Main.kelasSocket != null) {
			createKelasKosong(Main.kelasSocket);
		}
		Main.isKelasFullViewRendered = true;
	}
	
	public void createKelasKosong(KelasSocketModel kelasSocket) {
		LayoutController.removePanelComponents(kelasKosongContainer);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<String> kelasKosong = kelasSocket.getKelasKosong();
		System.out.println(kelasKosong.size());
		kelasKosong.forEach(n -> {
			kelasKosongContainer.add(createKelasKosongItem(n));
			kelasKosongContainer.revalidate();
			kelasKosongContainer.repaint();
		});
	}

	public Container createKelasKosongItem(String namaKelas) {
		Container kelasKosongItem = new CustomCardComponent(namaKelas).getContentPane();
		return kelasKosongItem;
	}

	public JPanel getKelasKosongContainer() {
		return kelasKosongContainer;
	}
}
