package com.empat.kelasku.ui.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.ContentViewEnum;
import com.empat.kelasku.util.Constants;

public class ProfileView extends JFrame {

	public ProfileView() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setUndecorated(true);
		setSize(900, 500);

		JPanel layoutBackgroundPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addComponent(layoutBackgroundPanel, GroupLayout.PREFERRED_SIZE, 841, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layoutBackgroundPanel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
		);
		changePanelView(ContentViewEnum.KelasView);
		
		JPanel panel = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ProfileView.class.getResource("/images/icons8-male-user-100.png")));
		
		JLabel lblNewLabel = new JLabel("Info Profile");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel lblNip = new JLabel("NIP");
		
		JLabel lblNama = new JLabel("Nama");
		
		JLabel label = new JLabel("12345");
		
		JLabel lblXxxxx = new JLabel("XXXXX");
		
		JPanel navItemEditAccount = new JPanel();
		navItemEditAccount.setForeground(Color.BLACK);
		navItemEditAccount.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnEditAccount = new JTextPane();
		txtpnEditAccount.setText("Edit Account");
		txtpnEditAccount.setForeground(Color.BLACK);
		txtpnEditAccount.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtpnEditAccount.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnKelas_1_1_3 = new JTextPane();
		txtpnKelas_1_1_3.setText("›");
		txtpnKelas_1_1_3.setForeground(Color.BLACK);
		txtpnKelas_1_1_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnKelas_1_1_3.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_navItemEditAccount = new GroupLayout(navItemEditAccount);
		gl_navItemEditAccount.setHorizontalGroup(
			gl_navItemEditAccount.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_navItemEditAccount.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnEditAccount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
					.addComponent(txtpnKelas_1_1_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_navItemEditAccount.setVerticalGroup(
			gl_navItemEditAccount.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_navItemEditAccount.createSequentialGroup()
					.addComponent(txtpnKelas_1_1_3, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
					.addGap(1))
				.addGroup(gl_navItemEditAccount.createSequentialGroup()
					.addGap(1)
					.addComponent(txtpnEditAccount, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
		);
		navItemEditAccount.setLayout(gl_navItemEditAccount);
		
		JPanel navItemJadwal_1 = new JPanel();
		navItemJadwal_1.setForeground(Color.BLACK);
		navItemJadwal_1.setBackground(Color.RED);
		
		JTextPane txtpnLogoutAccount = new JTextPane();
		txtpnLogoutAccount.setText("Logout Account");
		txtpnLogoutAccount.setForeground(Color.WHITE);
		txtpnLogoutAccount.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtpnLogoutAccount.setBackground(Color.RED);
		
		JTextPane txtpnKelas_1_1_4 = new JTextPane();
		txtpnKelas_1_1_4.setText("›");
		txtpnKelas_1_1_4.setForeground(Color.BLACK);
		txtpnKelas_1_1_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnKelas_1_1_4.setBackground(Color.RED);
		GroupLayout gl_navItemJadwal_1 = new GroupLayout(navItemJadwal_1);
		gl_navItemJadwal_1.setHorizontalGroup(
			gl_navItemJadwal_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 228, Short.MAX_VALUE)
				.addGroup(gl_navItemJadwal_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnLogoutAccount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
					.addComponent(txtpnKelas_1_1_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_navItemJadwal_1.setVerticalGroup(
			gl_navItemJadwal_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 33, Short.MAX_VALUE)
				.addGroup(gl_navItemJadwal_1.createSequentialGroup()
					.addGroup(gl_navItemJadwal_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnKelas_1_1_4, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
						.addComponent(txtpnLogoutAccount, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
					.addGap(1))
		);
		navItemJadwal_1.setLayout(gl_navItemJadwal_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(77)
					.addComponent(navItemJadwal_1, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(512, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(328, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addGap(377))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(298)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNip)
						.addComponent(lblNama, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(101)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(lblXxxxx))
					.addContainerGap(320, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(281)
					.addComponent(navItemEditAccount, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(308, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(lblNip))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblXxxxx)
						.addComponent(lblNama))
					.addGap(37)
					.addComponent(navItemEditAccount, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(navItemJadwal_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		panel.setLayout(gl_panel);

		GroupLayout gl_layoutBackgroundPanel = new GroupLayout(layoutBackgroundPanel);
		gl_layoutBackgroundPanel.setHorizontalGroup(
			gl_layoutBackgroundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layoutBackgroundPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_layoutBackgroundPanel.setVerticalGroup(
			gl_layoutBackgroundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layoutBackgroundPanel.createSequentialGroup()
					.addGap(34)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		layoutBackgroundPanel.setLayout(gl_layoutBackgroundPanel);
		getContentPane().setLayout(groupLayout);
	}

	public void changePanelView(ContentViewEnum view) {

		if (componentList.length >= 1) {
			for (Component c : componentList) {
				contentPanel.remove(c);
			}
			contentPanel.revalidate();
			contentPanel.repaint();
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public void setContentPanel(JPanel contentPanel) {
		this.contentPanel = contentPanel;
	}
}
