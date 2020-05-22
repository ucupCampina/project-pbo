package com.empat.kelasku.ui.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.ui.view.components.CustomCardComponent;

public class KelasFullView extends JFrame {

	private JPanel contentPane;
	private JPanel kelasKosongContainer;
	public GridBagConstraints gbc;

	public KelasFullView() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(800, 600));
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
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

		kelasKosongContainer = new JPanel(new GridBagLayout());
		kelasKosongContainer.setBackground(Color.WHITE);
		contentPane.add(kelasKosongContainer, BorderLayout.CENTER);

		JScrollPane scrollPanel = new JScrollPane(kelasKosongContainer);
		contentPane.add(scrollPanel, BorderLayout.CENTER);

		if (Main.kelasSocket != null) {
			createKelasKosong(Main.kelasSocket);
		}
		Main.isKelasFullViewRendered = true;

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Main.isKelasFullViewRendered = false;
			}
		});

	}

	private GridBagConstraints makeGbc(int x, int y) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2, 2, 2, 2);
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		return gbc;
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
		int col = 0;
		int row = 0;
		for (String namaKelas : kelasKosong) {

			GridBagConstraints gbc = makeGbc(col, row);
			System.out.println(namaKelas);
			kelasKosongContainer.add(createKelasKosongItem(namaKelas), gbc);
			kelasKosongContainer.revalidate();
			kelasKosongContainer.repaint();

			col++;
			if (col == 4) {
				col = 0;
				row++;
			}
		}
	}

	public Container createKelasKosongItem(String namaKelas) {
		Container kelasKosongItem = new CustomCardComponent(namaKelas);
		kelasKosongItem.setPreferredSize(new Dimension(150, 150));
		return kelasKosongItem;
	}

	public JPanel getKelasKosongContainer() {
		return kelasKosongContainer;
	}
}
