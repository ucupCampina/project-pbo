package com.empat.kelasku.ui.view;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.empat.kelasku.Main;

import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KelasView extends JFrame {
	public KelasView() {
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
		);
		
		JLabel lblKelasKosongSaat = new JLabel("Kelas kosong saat ini");
		lblKelasKosongSaat.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_1_1 = new JPanel();
		
		JLabel lblE_1 = new JLabel("E1.1");
		lblE_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 112, Short.MAX_VALUE)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_1)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_1)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_1_1.setLayout(gl_panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		
		JLabel lblE_2 = new JLabel("E1.1");
		lblE_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GroupLayout gl_panel_1_2 = new GroupLayout(panel_1_2);
		gl_panel_1_2.setHorizontalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 112, Short.MAX_VALUE)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_2)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1_2.setVerticalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_2)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_1_2.setLayout(gl_panel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		
		JLabel lblE_3 = new JLabel("E1.1");
		lblE_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GroupLayout gl_panel_1_3 = new GroupLayout(panel_1_3);
		gl_panel_1_3.setHorizontalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 112, Short.MAX_VALUE)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_3)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1_3.setVerticalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_3)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_1_3.setLayout(gl_panel_1_3);
		
		JPanel panel_1_4 = new JPanel();
		
		JLabel lblE_4 = new JLabel("E1.1");
		lblE_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GroupLayout gl_panel_1_4 = new GroupLayout(panel_1_4);
		gl_panel_1_4.setHorizontalGroup(
			gl_panel_1_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 112, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_4)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1_4.setVerticalGroup(
			gl_panel_1_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_4)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_1_4.setLayout(gl_panel_1_4);
		
		JPanel panel_1_5 = new JPanel();
		
		JLabel lblE_5 = new JLabel("E1.1");
		lblE_5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GroupLayout gl_panel_1_5 = new GroupLayout(panel_1_5);
		gl_panel_1_5.setHorizontalGroup(
			gl_panel_1_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 112, Short.MAX_VALUE)
				.addGroup(gl_panel_1_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_5)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1_5.setVerticalGroup(
			gl_panel_1_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
				.addGroup(gl_panel_1_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE_5)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_1_5.setLayout(gl_panel_1_5);
		
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
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlKelas_1_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panel_1_2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblKelasKosongSaat)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(panel_1_3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panel_1_4, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panel_1_5, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
							.addComponent(pnlKelas_1_1_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(65)
					.addComponent(lblKelasKosongSaat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1_2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1_3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_5, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(pnlKelas_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(pnlKelas_1_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		
		JLabel lblE = new JLabel("E1.1");
		lblE.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblE)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
}
