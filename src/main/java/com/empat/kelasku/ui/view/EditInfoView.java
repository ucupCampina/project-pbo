package com.empat.kelasku.ui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import com.empat.kelasku.util.Constants;
import com.empat.kelasku.util.ImageResizer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EditInfoView extends javax.swing.JFrame {
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel lblEditInfoAkun;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JButton jButton4;
	private JButton jButton5;
	private javax.swing.JLabel jLabel3;
	private JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JTextField jTextField_3;
	private javax.swing.JTextField jTextField_2;
	private javax.swing.JTextField jTextField_1;
	private javax.swing.JTextField jTextField;
	private javax.swing.JButton btnAjukan;
	private javax.swing.JButton btnBatalkan;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EditInfoView() {

		jPanel1			= new javax.swing.JPanel();
		jPanel2			= new javax.swing.JPanel();
		jButton1		= new javax.swing.JButton();
		jButton2		= new javax.swing.JButton();
		jButton3		= new javax.swing.JButton();
		lblEditInfoAkun	= new javax.swing.JLabel();
		jLabel2			= new javax.swing.JLabel();
		jLabel1			= new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 175, 194));

        jPanel2.setBackground(new java.awt.Color(153, 175, 194));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kelasku");

        javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(gl_jPanel2);
        gl_jPanel2.setHorizontalGroup(
            gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_jPanel2.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_jPanel2.setVerticalGroup(
            gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Jadwal");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Kelas");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-male-user-100.png")));
        
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
        
        JButton btnAjukan = new JButton("Simpan");
        btnAjukan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAjukan.setBorderPainted(false);
        btnAjukan.setBackground(new Color(0, 255, 51));
        
        JButton btnBatalkan = new JButton("Cancel");
        btnBatalkan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBatalkan.setBorderPainted(false);
        btnBatalkan.setBackground(Color.RED);
        
        jTextField = new JTextField();
        jTextField.setColumns(10);
        
        jTextField_1 = new JTextField();
        jTextField_1.setColumns(10);
        
        jTextField_2 = new JTextField();
        jTextField_2.setColumns(10);
        
        jTextField_3 = new JTextField();
        jTextField_3.setColumns(10);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.LIGHT_GRAY);
        
        jButton4 = new JButton();
        jButton4.setText("Ganti Foto");
        jButton4.setBackground(Color.WHITE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(36)
        					.addComponent(lblEditInfoAkun, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
        					.addGap(22)
        					.addComponent(jLabel2))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(62)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(20)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(panel3, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        							.addGap(80)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel6)
        								.addComponent(jLabel7))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField_3, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField_2, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField_1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnAjukan, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        							.addGap(324)
        							.addComponent(btnBatalkan, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(52)
        					.addComponent(lblEditInfoAkun, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(129)
        					.addComponent(jLabel2)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(26)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7)
        						.addComponent(jTextField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(27)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel6)
        						.addComponent(jTextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(28)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(jTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(36)
        					.addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addGap(26)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addGap(105)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAjukan, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBatalkan, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(71))
        );
        panel3.setLayout(null);
        
        jLabel3 = new JLabel("");
        jLabel3.setBounds(0, 0, 106, 108);
        panel3.add(jLabel3);
        getContentPane().setLayout(layout);

        pack();
	}
}
