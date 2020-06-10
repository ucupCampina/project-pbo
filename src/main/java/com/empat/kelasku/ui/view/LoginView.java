package com.empat.kelasku.ui.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.controller.AuthController;
import com.empat.kelasku.util.Constants;
import com.empat.kelasku.util.ImageResizer;

public class LoginView extends javax.swing.JFrame {
	private javax.swing.JButton signinButton;
	private javax.swing.JLabel anchor;
	private javax.swing.JLabel formTitle;
	private javax.swing.JLabel idLabel;
	private javax.swing.JLabel passwordLabel;
	private javax.swing.JLabel logoIconLabel;
	private javax.swing.JLabel logoTitle;
	private javax.swing.JLabel moreIconLabel;
	private javax.swing.JLabel logoDesc;
	private javax.swing.JPanel loginBackgroundPanel;
	private javax.swing.JPanel loginFormPanel;
	private javax.swing.JPasswordField passwordField;
	private javax.swing.JSeparator idSeparator;
	private javax.swing.JSeparator passwordSeparator;
	private javax.swing.JTextField idField;
	private javax.swing.JPanel panelOverlay;

	public LoginView() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		loginBackgroundPanel = new javax.swing.JPanel();
		loginFormPanel = new javax.swing.JPanel();
		anchor = new javax.swing.JLabel();
		formTitle = new javax.swing.JLabel();
		idField = new javax.swing.JTextField();
		idLabel = new javax.swing.JLabel();
		idSeparator = new javax.swing.JSeparator();
		passwordLabel = new javax.swing.JLabel();
		passwordField = new javax.swing.JPasswordField();
		passwordSeparator = new javax.swing.JSeparator();
		signinButton = new javax.swing.JButton();
		signinButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = idField.getText();
				String password = String.valueOf(passwordField.getPassword());

				boolean success = AuthController.loginUser(id, password);
				if (success) {
					dispose();
					Main.mainPage();
				}

			}
		});
		panelOverlay = new javax.swing.JPanel();
		logoIconLabel = new javax.swing.JLabel();
		logoIconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoTitle = new javax.swing.JLabel();
		logoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		moreIconLabel = new javax.swing.JLabel();
		moreIconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoDesc = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setUndecorated(true);

		loginBackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		loginFormPanel.setBackground(Constants.accentColor);
		loginFormPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				jPanel2MouseDragged(evt);
			}
		});
		loginFormPanel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jPanel2MousePressed(evt);
			}
		});

		formTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		formTitle.setForeground(new java.awt.Color(255, 255, 255));
		formTitle.setText("Mohon isi dengan data yang sesuai");

		idField.setBackground(Constants.accentColor);
		idField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		idField.setForeground(new java.awt.Color(255, 255, 255));
		idField.setBorder(null);
		idField.setCaretColor(new java.awt.Color(255, 255, 255));

		idLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		idLabel.setForeground(new java.awt.Color(255, 255, 255));
		idLabel.setText("NIS/NIP");

		passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
		passwordLabel.setText("Password");

		passwordField.setBackground(Constants.accentColor);
		passwordField.setForeground(new java.awt.Color(255, 255, 255));
		passwordField.setText("");
		passwordField.setBorder(null);
		passwordField.setCaretColor(new java.awt.Color(255, 255, 255));

		signinButton.setBackground(new java.awt.Color(57, 137, 186));
		signinButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		signinButton.setForeground(new java.awt.Color(255, 255, 255));
		signinButton.setText("Masuk");
		signinButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
		signinButton.setContentAreaFilled(false);
		signinButton.setFocusPainted(false);

		exit_1 = new JLabel();
		exit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exit_1.setText("X");
		exit_1.setHorizontalAlignment(SwingConstants.CENTER);
		exit_1.setForeground(new Color(231, 73, 134));
		exit_1.setFont(new Font("Dialog", Font.BOLD, 14));
		exit_1.setBackground(new Color(231, 73, 134));

		javax.swing.GroupLayout gl_loginFormPanel = new javax.swing.GroupLayout(loginFormPanel);
		gl_loginFormPanel.setHorizontalGroup(gl_loginFormPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginFormPanel.createSequentialGroup().addGroup(gl_loginFormPanel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginFormPanel.createSequentialGroup().addGap(35).addGroup(gl_loginFormPanel
								.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_loginFormPanel.createSequentialGroup().addComponent(anchor).addGap(317))
								.addGroup(gl_loginFormPanel.createSequentialGroup()
										.addGroup(gl_loginFormPanel.createParallelGroup(Alignment.TRAILING)
												.addComponent(passwordField, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
												.addComponent(idLabel, Alignment.LEADING)
												.addComponent(idField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 321,
														Short.MAX_VALUE)
												.addComponent(signinButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														321, Short.MAX_VALUE)
												.addComponent(passwordLabel, Alignment.LEADING)
												.addComponent(passwordSeparator, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 321, Short.MAX_VALUE)
												.addComponent(idSeparator, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 321, Short.MAX_VALUE)
												.addComponent(formTitle, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(37))))
						.addComponent(exit_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		gl_loginFormPanel.setVerticalGroup(gl_loginFormPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginFormPanel.createSequentialGroup()
						.addComponent(exit_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE).addGap(41)
						.addComponent(anchor).addPreferredGap(ComponentPlacement.RELATED).addComponent(formTitle)
						.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE).addComponent(idLabel)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(idField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(5).addComponent(idSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(passwordLabel).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(passwordSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
						.addGap(61)
						.addComponent(signinButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(83)));
		loginFormPanel.setLayout(gl_loginFormPanel);

		loginBackgroundPanel.add(loginFormPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 510));

		panelOverlay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				pnl_overlayMouseDragged(evt);
			}
		});
		panelOverlay.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				pnl_overlayMousePressed(evt);
			}
		});

		logoIconLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		logoIconLabel.setForeground(new java.awt.Color(255, 255, 255));
		ImageIcon logoIcon = ImageResizer
				.resizeIcon(LoginView.class.getResource("/images/a.png"), 200, 200);
		logoIconLabel.setIcon(logoIcon); // NOI18N

		logoTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		logoTitle.setForeground(new java.awt.Color(102, 102, 102));
		logoTitle.setText("Kuat ma'rifat");

		moreIconLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		moreIconLabel.setForeground(new java.awt.Color(102, 102, 102));
		ImageIcon moreIcon = ImageResizer.resizeIcon(
				LoginView.class.getResource("/images/more_20px_1.png"), 20, 20);
		moreIconLabel.setIcon(moreIcon); // NOI18N

		logoDesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		logoDesc.setForeground(new java.awt.Color(102, 102, 102));
		logoDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		logoDesc.setText("<html>\n<br>Tingkatkan iman dan takwa!</br>\n<br>&emsp;Hilangkan kebodohan!!!</br>\n</html>");

		javax.swing.GroupLayout gl_panelOverlay = new javax.swing.GroupLayout(panelOverlay);
		gl_panelOverlay.setHorizontalGroup(gl_panelOverlay.createParallelGroup(Alignment.LEADING).addGroup(
				gl_panelOverlay.createSequentialGroup().addContainerGap(128, Short.MAX_VALUE).addGroup(gl_panelOverlay
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelOverlay.createSequentialGroup().addComponent(logoIconLabel).addGap(137))
						.addGroup(gl_panelOverlay.createSequentialGroup().addComponent(moreIconLabel).addGap(221))
						.addGroup(
								gl_panelOverlay.createSequentialGroup()
										.addComponent(logoDesc, GroupLayout.PREFERRED_SIZE, 252,
												GroupLayout.PREFERRED_SIZE)
										.addGap(110))
						.addGroup(gl_panelOverlay.createSequentialGroup().addComponent(logoTitle).addGap(188)))));
		gl_panelOverlay.setVerticalGroup(gl_panelOverlay.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOverlay.createSequentialGroup().addGap(78).addComponent(logoIconLabel)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(logoTitle, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(logoDesc, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE).addGap(41)
						.addComponent(moreIconLabel).addContainerGap(308, Short.MAX_VALUE)));
		panelOverlay.setLayout(gl_panelOverlay);

		loginBackgroundPanel.add(panelOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 490, 510));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(loginBackgroundPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(loginBackgroundPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public int getXy() {
		return xy;
	}

	public void setXy(int xy) {
		this.xy = xy;
	}

	public int getXx() {
		return xx;
	}

	public void setXx(int xx) {
		this.xx = xx;
	}

	public javax.swing.JButton getjButton2() {
		return signinButton;
	}

	public void setjButton2(javax.swing.JButton jButton2) {
		this.signinButton = jButton2;
	}

	public javax.swing.JLabel getjLabel1() {
		return anchor;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.anchor = jLabel1;
	}

	public javax.swing.JLabel getjLabel2() {
		return formTitle;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.formTitle = jLabel2;
	}

	public javax.swing.JLabel getjLabel3() {
		return idLabel;
	}

	public void setjLabel3(javax.swing.JLabel jLabel3) {
		this.idLabel = jLabel3;
	}

	public javax.swing.JLabel getjLabel5() {
		return passwordLabel;
	}

	public void setjLabel5(javax.swing.JLabel jLabel5) {
		this.passwordLabel = jLabel5;
	}

	public javax.swing.JLabel getjLabel6() {
		return logoIconLabel;
	}

	public void setjLabel6(javax.swing.JLabel jLabel6) {
		this.logoIconLabel = jLabel6;
	}

	public javax.swing.JLabel getjLabel7() {
		return logoTitle;
	}

	public void setjLabel7(javax.swing.JLabel jLabel7) {
		this.logoTitle = jLabel7;
	}

	public javax.swing.JLabel getjLabel8() {
		return moreIconLabel;
	}

	public void setjLabel8(javax.swing.JLabel jLabel8) {
		this.moreIconLabel = jLabel8;
	}

	public javax.swing.JLabel getjLabel9() {
		return logoDesc;
	}

	public void setjLabel9(javax.swing.JLabel jLabel9) {
		this.logoDesc = jLabel9;
	}

	public javax.swing.JPanel getjPanel1() {
		return loginBackgroundPanel;
	}

	public void setjPanel1(javax.swing.JPanel jPanel1) {
		this.loginBackgroundPanel = jPanel1;
	}

	public javax.swing.JPanel getjPanel2() {
		return loginFormPanel;
	}

	public void setjPanel2(javax.swing.JPanel jPanel2) {
		this.loginFormPanel = jPanel2;
	}

	public javax.swing.JPasswordField getjPasswordField1() {
		return passwordField;
	}

	public void setjPasswordField1(javax.swing.JPasswordField jPasswordField1) {
		this.passwordField = jPasswordField1;
	}

	public javax.swing.JSeparator getjSeparator1() {
		return idSeparator;
	}

	public void setjSeparator1(javax.swing.JSeparator jSeparator1) {
		this.idSeparator = jSeparator1;
	}

	public javax.swing.JSeparator getjSeparator3() {
		return passwordSeparator;
	}

	public void setjSeparator3(javax.swing.JSeparator jSeparator3) {
		this.passwordSeparator = jSeparator3;
	}

	public javax.swing.JTextField getjTextField1() {
		return idField;
	}

	public void setjTextField1(javax.swing.JTextField jTextField1) {
		this.idField = jTextField1;
	}

	public javax.swing.JPanel getPnl_overlay() {
		return panelOverlay;
	}

	public void setPnl_overlay(javax.swing.JPanel pnl_overlay) {
		this.panelOverlay = pnl_overlay;
	}

	int xy;
	int xx;
	private JLabel exit_1;

	private void pnl_overlayMouseDragged(java.awt.event.MouseEvent evt) {
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xx, y - xy);
	}

	private void pnl_overlayMousePressed(java.awt.event.MouseEvent evt) {
		xx = evt.getX();
		xy = evt.getY();
	}

	private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {

		xx = evt.getX();
		xy = evt.getY();
	}

	private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xx, y - xy);
	}
}
