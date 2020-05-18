package com.empat.kelasku.ui.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
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
import java.awt.Component;

import javax.swing.JTextPane;
import javax.swing.border.SoftBevelBorder;

import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.ContentViewEnum;
import com.empat.kelasku.util.Constants;

import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;

public class LayoutView extends JFrame {
	private JPanel contentPanel;

	public LayoutView() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setUndecorated(true);
		setSize(900, 500);

		JPanel layoutBackgroundPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layoutBackgroundPanel, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layoutBackgroundPanel, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE));

		JPanel navigationPanel = new JPanel();
		navigationPanel.setBackground(Constants.accentColor);

		contentPanel = new JPanel();
		changePanelView(ContentViewEnum.JadwalView);

		GroupLayout gl_layoutBackgroundPanel = new GroupLayout(layoutBackgroundPanel);
		gl_layoutBackgroundPanel.setHorizontalGroup(gl_layoutBackgroundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layoutBackgroundPanel.createSequentialGroup()
						.addComponent(navigationPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)));
		gl_layoutBackgroundPanel.setVerticalGroup(gl_layoutBackgroundPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(navigationPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(contentPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE));
		contentPanel.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel titleKelasku = new JLabel("Kelasku");
		titleKelasku.setForeground(SystemColor.textHighlightText);
		titleKelasku.setFont(new Font("Segoe UI", Font.BOLD, 32));
		titleKelasku.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel navItemKelas = new JPanel();
		navItemKelas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanelView(ContentViewEnum.KelasView);
			}
		});
		navItemKelas.setBackground(Color.WHITE);

		JPanel navItemJadwal = new JPanel();
		navItemJadwal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanelView(ContentViewEnum.JadwalView);
			}
		});
		navItemJadwal.setForeground(new Color(0, 0, 0));
		navItemJadwal.setBackground(new Color(255, 255, 255));

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
		GroupLayout gl_navItemJadwal = new GroupLayout(navItemJadwal);
		gl_navItemJadwal
				.setHorizontalGroup(
						gl_navItemJadwal.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_navItemJadwal.createSequentialGroup().addContainerGap()
										.addComponent(txtpnJadwal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
										.addComponent(txtpnKelas_1_1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		gl_navItemJadwal.setVerticalGroup(gl_navItemJadwal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navItemJadwal.createSequentialGroup()
						.addGroup(gl_navItemJadwal.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnKelas_1_1, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
								.addComponent(txtpnJadwal, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
						.addGap(1)));
		navItemJadwal.setLayout(gl_navItemJadwal);

		JPanel navItemUser = new JPanel();
		navItemUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanelView(ContentViewEnum.UserView);
			}
		});
		navItemUser.setForeground(Color.BLACK);
		navItemUser.setBackground(Color.WHITE);

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
		GroupLayout gl_navItemUser = new GroupLayout(navItemUser);
		gl_navItemUser
				.setHorizontalGroup(
						gl_navItemUser.createParallelGroup(Alignment.TRAILING).addGap(0, 228, Short.MAX_VALUE)
								.addGroup(gl_navItemUser.createSequentialGroup().addContainerGap()
										.addComponent(txtpnUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
										.addComponent(txtpnKelas_1_1_1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		gl_navItemUser
				.setVerticalGroup(gl_navItemUser.createParallelGroup(Alignment.LEADING).addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_navItemUser.createSequentialGroup()
								.addComponent(txtpnKelas_1_1_1, GroupLayout.PREFERRED_SIZE, 32,
										GroupLayout.PREFERRED_SIZE)
								.addGap(11))
						.addGroup(gl_navItemUser.createSequentialGroup()
								.addComponent(txtpnUser, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addContainerGap()));
		navItemUser.setLayout(gl_navItemUser);

		JLabel lblX_1 = new JLabel("X");
		lblX_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_1.setForeground(Color.RED);
		lblX_1.setBackground(new Color(255, 0, 51));
		GroupLayout gl_navigationPanel = new GroupLayout(navigationPanel);
		gl_navigationPanel
				.setHorizontalGroup(gl_navigationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_navigationPanel.createSequentialGroup().addGap(80).addComponent(titleKelasku)
								.addContainerGap(80, Short.MAX_VALUE))
						.addGroup(gl_navigationPanel.createSequentialGroup().addGap(25)
								.addGroup(gl_navigationPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(navItemUser, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
										.addComponent(navItemKelas, GroupLayout.PREFERRED_SIZE, 228,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(navItemJadwal, GroupLayout.PREFERRED_SIZE, 228,
												GroupLayout.PREFERRED_SIZE))
								.addGap(33))
						.addGroup(gl_navigationPanel.createSequentialGroup()
								.addComponent(lblX_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(260, Short.MAX_VALUE)));
		gl_navigationPanel.setVerticalGroup(gl_navigationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navigationPanel.createSequentialGroup()
						.addComponent(lblX_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE).addGap(26)
						.addComponent(titleKelasku, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addGap(78)
						.addComponent(navItemKelas, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGap(29)
						.addComponent(navItemJadwal, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
						.addComponent(navItemUser, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGap(56)));

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
		GroupLayout gl_navItemKelas = new GroupLayout(navItemKelas);
		gl_navItemKelas.setHorizontalGroup(gl_navItemKelas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navItemKelas.createSequentialGroup().addContainerGap()
						.addComponent(txtpnJadwal_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGap(136)
						.addComponent(txtpnKelas_1_1_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_navItemKelas.setVerticalGroup(gl_navItemKelas.createParallelGroup(Alignment.LEADING).addGroup(gl_navItemKelas
				.createSequentialGroup()
				.addGroup(gl_navItemKelas.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnJadwal_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnKelas_1_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		navItemKelas.setLayout(gl_navItemKelas);
		navigationPanel.setLayout(gl_navigationPanel);
		layoutBackgroundPanel.setLayout(gl_layoutBackgroundPanel);
		getContentPane().setLayout(groupLayout);
	}

	public void changePanelView(ContentViewEnum view) {
//		LayoutController.removePanelComponents(contentPanel);
		Component[] componentList = contentPanel.getComponents();

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
		LayoutController.renderContent(contentPanel, view);
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public void setContentPanel(JPanel contentPanel) {
		this.contentPanel = contentPanel;
	}
}
