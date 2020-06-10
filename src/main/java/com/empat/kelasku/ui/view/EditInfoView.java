package com.empat.kelasku.ui.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

public class EditInfoView extends javax.swing.JFrame {
	private javax.swing.JLabel lblEditInfoAkun;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JButton jButton4;
	private JButton jButton4_1;
	private JButton jButton5;
	private javax.swing.JLabel jLabel3;
	private JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JTextField jTextField_3;
	private JTextField jTextField_3_1;
	private javax.swing.JTextField jTextField_2;
	private JTextField jTextField_2_1;
	private javax.swing.JTextField jTextField_1;
	private JTextField jTextField_1_1;
	private javax.swing.JTextField jTextField;
	private JTextField jTextField_4;
	private javax.swing.JButton btnAjukan;
	private javax.swing.JButton btnBatalkan;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EditInfoView() {
		setType(Type.UTILITY);
		lblEditInfoAkun	= new javax.swing.JLabel();
		jButton4		= new javax.swing.JButton();
		jLabel3			= new javax.swing.JLabel();
		jLabel4			= new javax.swing.JLabel();
		jLabel5			= new javax.swing.JLabel();
		jLabel6			= new javax.swing.JLabel();
		jLabel7			= new javax.swing.JLabel();
		jTextField_3	= new javax.swing.JTextField();
		jTextField_2	= new javax.swing.JTextField();
		jTextField_1	= new javax.swing.JTextField();
		jTextField		= new javax.swing.JTextField();
		btnAjukan		= new javax.swing.JButton();
		btnBatalkan		= new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        
        JLabel lblEditInfoAkun = new JLabel("Edit Info Akun");
        lblEditInfoAkun.setHorizontalAlignment(SwingConstants.LEFT);
        lblEditInfoAkun.setForeground(Color.BLACK);
        lblEditInfoAkun.setFont(new Font("Tahoma", Font.BOLD, 17));
        
        JLabel jLabel7 = new JLabel("Nama");
        jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JLabel jLabel6 = new JLabel("NIP");
        jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JLabel jLabel5 = new JLabel("Password");
        jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JLabel jLabel4 = new JLabel("New Password");
        jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnSimpan.setBorderPainted(false);
        btnSimpan.setBackground(new Color(0, 255, 51));
        btnSimpan.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				int choice = exitDialog("Menyimpan");
				if (choice == 0) {
					dispose();
				}
        	}
        });
        
        JButton btnBatal = new JButton("Batal");
        btnBatal.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBatal.setBorderPainted(false);
        btnBatal.setBackground(Color.RED);
        btnBatal.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				int choice = exitDialog("Membatalkan");
				if (choice == 0) {
					dispose();
				}
        	}
        });
        
        jTextField_4 = new JTextField();
        jTextField_4.setColumns(10);
        
        jTextField_1_1 = new JTextField();
        jTextField_1_1.setColumns(10);
        
        jTextField_2_1 = new JTextField();
        jTextField_2_1.setColumns(10);
        
        jTextField_3_1 = new JTextField();
        jTextField_3_1.setColumns(10);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.LIGHT_GRAY);
        
        jButton4_1 = new JButton();
        jButton4_1.setText("Ganti Foto");
        jButton4_1.setBackground(Color.WHITE);
        panel3.setLayout(null);
        
        jLabel3 = new JLabel("");
        jLabel3.setBounds(0, 0, 106, 108);
        panel3.add(jLabel3);
        jLabel2			= new javax.swing.JLabel();
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setBounds(0, 0, 106, 108);
        panel3.add(jLabel2);
        
                jLabel2.setIcon(new javax.swing.ImageIcon(EditInfoView.class.getResource("/images/icons8-male-user-100.png")));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(63)
        			.addComponent(lblEditInfoAkun, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(63)
        			.addComponent(panel3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        			.addGap(80)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel7)
        				.addComponent(jLabel6)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
        			.addGap(46)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField_3_1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField_2_1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField_1_1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(63)
        			.addComponent(jButton4_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        			.addGap(80)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jTextField_4, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(92)
        			.addComponent(btnSimpan, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
        			.addComponent(btnBatal, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        			.addGap(125))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(45)
        			.addComponent(lblEditInfoAkun, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(panel3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(jLabel7)
        					.addGap(29)
        					.addComponent(jLabel6)
        					.addGap(30)
        					.addComponent(jLabel5))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(1)
        					.addComponent(jTextField_3_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(28)
        					.addComponent(jTextField_2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(29)
        					.addComponent(jTextField_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(26)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(5)
        					.addComponent(jLabel4))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(6)
        					.addComponent(jTextField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(40)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSimpan, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBatal, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(54))
        );
        getContentPane().setLayout(groupLayout);

        pack();
	}
	
	public int exitDialog(String opsi) {
		return JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin " + opsi + " Pengeditan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
	}
	
}
