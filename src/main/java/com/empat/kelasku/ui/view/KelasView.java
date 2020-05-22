package com.empat.kelasku.ui.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.ui.view.components.CustomCardComponent;

public class KelasView extends JFrame {
	private JPanel kelasKosongContainer;
	public KelasView() {
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
		);
		
		JLabel lblKelasKosongSaat = new JLabel("Kelas kosong saat ini");
		lblKelasKosongSaat.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JPanel pnlKelas_1_1 = new JPanel();
		pnlKelas_1_1.setForeground(Color.BLACK);
		pnlKelas_1_1.setBackground(Color.WHITE);
		
		JTextPane txtpnLebihLengkap = new JTextPane();
		txtpnLebihLengkap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Main.kelasFullView == null) {
					Main.kelasFullView = new KelasFullView();
					Main.kelasFullView.setVisible(true);
				}
				Main.kelasFullView.setVisible(true);
			}
		});
		txtpnLebihLengkap.setText("Lebih Lengkap");
		txtpnLebihLengkap.setForeground(Color.BLACK);
		txtpnLebihLengkap.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtpnLebihLengkap.setBackground(Color.WHITE);
		
		JTextPane txtpnKelas_1_1_1 = new JTextPane();
		txtpnKelas_1_1_1.setText("\u203A");
		txtpnKelas_1_1_1.setForeground(Color.BLACK);
		txtpnKelas_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnKelas_1_1_1.setBackground(Color.WHITE);
		GroupLayout gl_pnlKelas_1_1 = new GroupLayout(pnlKelas_1_1);
		gl_pnlKelas_1_1.setHorizontalGroup(
			gl_pnlKelas_1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pnlKelas_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnLebihLengkap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(txtpnKelas_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pnlKelas_1_1.setVerticalGroup(
			gl_pnlKelas_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlKelas_1_1.createSequentialGroup()
					.addGroup(gl_pnlKelas_1_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtpnKelas_1_1_1, 0, 0, Short.MAX_VALUE)
						.addComponent(txtpnLebihLengkap))
					.addContainerGap(5, Short.MAX_VALUE))
		);
		pnlKelas_1_1.setLayout(gl_pnlKelas_1_1);
		
		JPanel pnlKelas_1_1_1 = new JPanel();
		pnlKelas_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestKelasView requestKelasView =  new RequestKelasView();
				requestKelasView.setVisible(true);
			}
		});
		pnlKelas_1_1_1.setForeground(Color.BLACK);
		pnlKelas_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnLebihLengkap_1 = new JTextPane();
		txtpnLebihLengkap_1.setText("Request Kelas");
		txtpnLebihLengkap_1.setForeground(Color.BLACK);
		txtpnLebihLengkap_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtpnLebihLengkap_1.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnKelas_1_1_1_1 = new JTextPane();
		txtpnKelas_1_1_1_1.setText("\u203A");
		txtpnKelas_1_1_1_1.setForeground(Color.WHITE);
		txtpnKelas_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnKelas_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_pnlKelas_1_1_1 = new GroupLayout(pnlKelas_1_1_1);
		gl_pnlKelas_1_1_1.setHorizontalGroup(
			gl_pnlKelas_1_1_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 141, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, gl_pnlKelas_1_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnLebihLengkap_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(txtpnKelas_1_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pnlKelas_1_1_1.setVerticalGroup(
			gl_pnlKelas_1_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 27, Short.MAX_VALUE)
				.addGroup(gl_pnlKelas_1_1_1.createSequentialGroup()
					.addGroup(gl_pnlKelas_1_1_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtpnKelas_1_1_1_1, 0, 0, Short.MAX_VALUE)
						.addComponent(txtpnLebihLengkap_1))
					.addContainerGap(5, Short.MAX_VALUE))
		);
		pnlKelas_1_1_1.setLayout(gl_pnlKelas_1_1_1);
		
		kelasKosongContainer = new JPanel();
		kelasKosongContainer.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(kelasKosongContainer, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(pnlKelas_1_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblKelasKosongSaat)
									.addComponent(pnlKelas_1_1_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addGap(236))))
					.addContainerGap(2, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(65)
					.addComponent(lblKelasKosongSaat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(kelasKosongContainer, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pnlKelas_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(pnlKelas_1_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
		if (Main.kelasSocket != null) {
			createKelasKosong(Main.kelasSocket);
		}
	}
	
	private GridBagConstraints makeGbc(int x, int y) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.weightx = 0;
        gbc.weighty = 0;
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
		int counter = 0;
		int col = 0;
		int row = 0;
		for(String namaKelas : kelasKosong) {
			counter++;
			
			GridBagConstraints gbc = makeGbc(col, row);
			kelasKosongContainer.add(createKelasKosongItem(namaKelas), gbc);
			kelasKosongContainer.revalidate();
			kelasKosongContainer.repaint();
			
			col++;
			if (col == 4) {
				col = 0;
				row++;
			}
			if (counter == 6) {
				break;
			}
		}
	}

	public Container createKelasKosongItem(String namaKelas) {
		Container kelasKosongItem = new CustomCardComponent(namaKelas);
		kelasKosongItem.setPreferredSize(new Dimension(120, 120));
		return kelasKosongItem;
	}
	public JPanel getKelasKosongContainer() {
		return kelasKosongContainer;
	}
}
