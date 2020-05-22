package com.empat.kelasku.ui.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import com.empat.kelasku.data.controller.LayoutController;
import com.empat.kelasku.data.model.ContentViewEnum;
import com.empat.kelasku.util.Constants;
import java.awt.GridBagLayout;

public class LayoutView extends JFrame {
	private JPanel contentPanel;

	public LayoutView() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setSize(900, 500);

		JPanel layoutBackgroundPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layoutBackgroundPanel, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layoutBackgroundPanel, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE));

		JPanel navigationPanel = new JPanel();
		navigationPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setMousePosition(e);
			}
		});
		navigationPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				changeWindowPosition(e);
			}
		});
		navigationPanel.setBackground(Constants.accentColor);

		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				changeWindowPosition(e);
			}
		});
		contentPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setMousePosition(e);
			}
		});
		changePanelView(ContentViewEnum.KelasView);

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
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0};
		gbl_contentPanel.rowHeights = new int[]{0};
		gbl_contentPanel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);

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

		JLabel txtpnJadwal = new JLabel();
		txtpnJadwal.setText("Jadwal");
		txtpnJadwal.setForeground(new Color(0, 0, 0));
		txtpnJadwal.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtpnJadwal.setBackground(new Color(255, 255, 255));

		JLabel txtpnKelas_1_1 = new JLabel();
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

		JLabel txtpnUser = new JLabel();
		txtpnUser.setText("User");
		txtpnUser.setForeground(Color.BLACK);
		txtpnUser.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtpnUser.setBackground(Color.WHITE);

		JLabel txtpnKelas_1_1_1 = new JLabel();
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
				int choice = exitDialog();
				if (choice == 0) {
					System.exit(0);
				}
			}
		});
		lblX_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_1.setForeground(Color.RED);
		lblX_1.setBackground(new Color(255, 0, 51));
		GroupLayout gl_navigationPanel = new GroupLayout(navigationPanel);
		gl_navigationPanel.setHorizontalGroup(
			gl_navigationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navigationPanel.createSequentialGroup()
					.addGap(80)
					.addComponent(titleKelasku)
					.addContainerGap(80, Short.MAX_VALUE))
				.addGroup(gl_navigationPanel.createSequentialGroup()
					.addComponent(lblX_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(277, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_navigationPanel.createSequentialGroup()
					.addContainerGap(42, Short.MAX_VALUE)
					.addGroup(gl_navigationPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(navItemUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(navItemKelas, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 228, Short.MAX_VALUE)
						.addComponent(navItemJadwal, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
					.addGap(33))
		);
		gl_navigationPanel.setVerticalGroup(
			gl_navigationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navigationPanel.createSequentialGroup()
					.addComponent(lblX_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(titleKelasku, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(78)
					.addComponent(navItemKelas, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(navItemJadwal, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(140)
					.addComponent(navItemUser, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);

		JLabel txtpnJadwal_1 = new JLabel();
		txtpnJadwal_1.setText("Kelas");
		txtpnJadwal_1.setForeground(Color.BLACK);
		txtpnJadwal_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtpnJadwal_1.setBackground(Color.WHITE);

		JLabel txtpnKelas_1_1_2 = new JLabel();
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
		
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				Main.isKelasFullViewRendered = false;
//				exitDialog();
//			}
//		});

	}
	

    int xy;
    int xx;
	
	private void setMousePosition(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:

        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

	
	private void changeWindowPosition(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }
	
	public int exitDialog() {
		return JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin Keluar Dari Aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
	}

	public void changePanelView(ContentViewEnum view) {
		LayoutController.removePanelComponents(contentPanel);
		LayoutController.renderContent(contentPanel, view);
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public void setContentPanel(JPanel contentPanel) {
		this.contentPanel = contentPanel;
	}
}
