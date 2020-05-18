package com.empat.kelasku.ui.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class PanelView extends JFrame {
	public PanelView() {
		setUndecorated(true);
		
		JPanel JPanel1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(JPanel1, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(JPanel1, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
		);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		GroupLayout gl_JPanel1 = new GroupLayout(JPanel1);
		gl_JPanel1.setHorizontalGroup(
			gl_JPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPanel1.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_JPanel1.setVerticalGroup(
			gl_JPanel1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		
		JLabel lblKelasku = new JLabel("Kelasku");
		lblKelasku.setForeground(SystemColor.textHighlightText);
		lblKelasku.setFont(new Font("Segoe UI", Font.BOLD, 32));
		lblKelasku.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlKelas = new JPanel();
		pnlKelas.setBackground(Color.WHITE);
		
		JPanel pnlKelas_1 = new JPanel();
		pnlKelas_1.setForeground(new Color(0, 0, 0));
		pnlKelas_1.setBackground(new Color(255, 255, 255));
		
		JTextPane txtpnJadwal = new JTextPane();
		txtpnJadwal.setText("Jadwal");
		txtpnJadwal.setForeground(new Color(0, 0, 0));
		txtpnJadwal.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtpnJadwal.setBackground(new Color(255, 255, 255));
		
		JTextPane txtpnKelas_1_1 = new JTextPane();
		txtpnKelas_1_1.setText("\u203A");
		txtpnKelas_1_1.setForeground(new Color(0, 0, 0));
		txtpnKelas_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnKelas_1_1.setBackground(new Color(255, 255, 255));
		GroupLayout gl_pnlKelas_1 = new GroupLayout(pnlKelas_1);
		gl_pnlKelas_1.setHorizontalGroup(
			gl_pnlKelas_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pnlKelas_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnJadwal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
					.addComponent(txtpnKelas_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pnlKelas_1.setVerticalGroup(
			gl_pnlKelas_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlKelas_1.createSequentialGroup()
					.addGroup(gl_pnlKelas_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnKelas_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnJadwal, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
					.addContainerGap())
		);
		pnlKelas_1.setLayout(gl_pnlKelas_1);
		
		JPanel pnlKelas_1_1 = new JPanel();
		pnlKelas_1_1.setForeground(Color.BLACK);
		pnlKelas_1_1.setBackground(Color.WHITE);
		
		JTextPane txtpnUser = new JTextPane();
		txtpnUser.setText("User");
		txtpnUser.setForeground(Color.BLACK);
		txtpnUser.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtpnUser.setBackground(Color.WHITE);
		
		JTextPane txtpnKelas_1_1_1 = new JTextPane();
		txtpnKelas_1_1_1.setText("\u203A");
		txtpnKelas_1_1_1.setForeground(Color.BLACK);
		txtpnKelas_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnKelas_1_1_1.setBackground(Color.WHITE);
		GroupLayout gl_pnlKelas_1_1 = new GroupLayout(pnlKelas_1_1);
		gl_pnlKelas_1_1.setHorizontalGroup(
			gl_pnlKelas_1_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 228, Short.MAX_VALUE)
				.addGroup(gl_pnlKelas_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
					.addComponent(txtpnKelas_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pnlKelas_1_1.setVerticalGroup(
			gl_pnlKelas_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 33, Short.MAX_VALUE)
				.addGroup(gl_pnlKelas_1_1.createSequentialGroup()
					.addComponent(txtpnKelas_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
				.addGroup(gl_pnlKelas_1_1.createSequentialGroup()
					.addComponent(txtpnUser, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addContainerGap())
		);
		pnlKelas_1_1.setLayout(gl_pnlKelas_1_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(80)
					.addComponent(lblKelasku)
					.addContainerGap(80, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlKelas, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlKelas_1_1, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlKelas_1, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(54)
					.addComponent(lblKelasku, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(76)
					.addComponent(pnlKelas, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(pnlKelas_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(171)
					.addComponent(pnlKelas_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		
		JTextPane txtpnJadwal_1 = new JTextPane();
		txtpnJadwal_1.setText("Kelas");
		txtpnJadwal_1.setForeground(Color.BLACK);
		txtpnJadwal_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtpnJadwal_1.setBackground(Color.WHITE);
		
		JTextPane txtpnKelas_1_1_2 = new JTextPane();
		txtpnKelas_1_1_2.setText("\u203A");
		txtpnKelas_1_1_2.setForeground(Color.BLACK);
		txtpnKelas_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnKelas_1_1_2.setBackground(Color.WHITE);
		GroupLayout gl_pnlKelas = new GroupLayout(pnlKelas);
		gl_pnlKelas.setHorizontalGroup(
			gl_pnlKelas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlKelas.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnJadwal_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(136)
					.addComponent(txtpnKelas_1_1_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pnlKelas.setVerticalGroup(
			gl_pnlKelas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlKelas.createSequentialGroup()
					.addGroup(gl_pnlKelas.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnJadwal_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnKelas_1_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlKelas.setLayout(gl_pnlKelas);
		panel.setLayout(gl_panel);
		JPanel1.setLayout(gl_JPanel1);
		getContentPane().setLayout(groupLayout);
	}
}
