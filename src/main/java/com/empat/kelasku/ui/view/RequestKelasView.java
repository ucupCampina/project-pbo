package com.empat.kelasku.ui.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.empat.kelasku.Main;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RequestKelasView extends javax.swing.JFrame {
	
	private javax.swing.JComboBox comboBox;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JLabel lblRequestKelas;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField jTextField1;
	private JTextField jTextField1_1;
	private javax.swing.JTextField jTextField2;
	private JTextField jTextField2_1;
	private javax.swing.JButton btnAjukan;
	private javax.swing.JButton btnBatalkan;
	private javax.swing.JButton btnCek;
	private JButton btnCek_1;
	
	public RequestKelasView() {
		setType(Type.UTILITY);
		jPanel3			= new javax.swing.JPanel();
		comboBox 		= new javax.swing.JComboBox();
		lblRequestKelas	= new javax.swing.JLabel();
		jLabel3			= new javax.swing.JLabel();
		jLabel5			= new javax.swing.JLabel();
		jLabel6			= new javax.swing.JLabel();
		jLabel7			= new javax.swing.JLabel();
		jTextField1		= new javax.swing.JTextField();
		jTextField2		= new javax.swing.JTextField();
		btnCek			= new javax.swing.JButton();
		btnAjukan		= new javax.swing.JButton();
		btnBatalkan		= new javax.swing.JButton();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel lblRequestKelas = new JLabel("Request Kelas Yang Ingin Digunakan");
        lblRequestKelas.setHorizontalAlignment(SwingConstants.LEFT);
        lblRequestKelas.setForeground(Color.BLACK);
        lblRequestKelas.setFont(new Font("Tahoma", Font.BOLD, 17));
        
        JLabel jLabel7 = new JLabel("Nama");
        jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JLabel jLabel6 = new JLabel("NIP");
        jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JLabel jLabel5 = new JLabel("Request Kelas Yang Ingin Digunakan");
        jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JButton btnAjukan = new JButton("Ajukan");
        btnAjukan.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnAjukan.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				int choice = exitDialog("Mengajukan");
				if (choice == 0) {
					dispose();
				}
        	}
        });
        btnAjukan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAjukan.setBorderPainted(false);
        btnAjukan.setBackground(new Color(0, 255, 51));
        
        JButton btnBatalkan = new JButton("Batalkan");
        btnBatalkan.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				int choice = exitDialog("Membatalkan");
				if (choice == 0) {
					System.exit(0);
				}
        	}
        });
        btnBatalkan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBatalkan.setBorderPainted(false);
        btnBatalkan.setBackground(Color.RED);
        
        jTextField2_1 = new JTextField();
        jTextField2_1.setColumns(10);
        
        jTextField1_1 = new JTextField();
        jTextField1_1.setColumns(10);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.LIGHT_GRAY);
        
        JComboBox comboBox = new JComboBox();
        
        btnCek_1 = new JButton("Cek");
        panel3.setLayout(null);
        jLabel2			= new javax.swing.JLabel();
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setBounds(0, 0, 106, 106);
        panel3.add(jLabel2);
        
                jLabel2.setIcon(new javax.swing.ImageIcon(RequestKelasView.class.getResource("/images/icons8-male-user-100.png")));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(93)
        			.addComponent(panel3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        			.addGap(80)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(jLabel7)
        					.addGap(78)
        					.addComponent(jTextField1_1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addGap(93)
        					.addComponent(jTextField2_1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)))
        		.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
        			.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        				.addGap(73)
        				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        					.addGroup(groupLayout.createSequentialGroup()
        						.addGap(58)
        						.addComponent(btnAjukan, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        						.addGap(113)
        						.addComponent(btnBatalkan, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
        					.addComponent(lblRequestKelas, GroupLayout.PREFERRED_SIZE, 503, GroupLayout.PREFERRED_SIZE))
        				.addContainerGap(154, Short.MAX_VALUE))
        			.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        				.addGap(279)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        				.addGap(56)
        				.addComponent(btnCek_1)))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(52)
        			.addComponent(lblRequestKelas, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(37)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(panel3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel7)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(1)
        							.addComponent(jTextField1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(27)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel6)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(1)
        							.addComponent(jTextField2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(28)
        					.addComponent(jLabel5)))
        			.addGap(27)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(1)
        					.addComponent(btnCek_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
        			.addGap(42)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAjukan, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBatalkan, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(54))
        );
        getContentPane().setLayout(groupLayout);
        
        Main.isRequestKelasViewRendered = true;

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Main.isRequestKelasViewRendered = false;
			}
		});

        pack();
	}
	
	public int exitDialog(String opsi) {
		return JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin " + opsi + " Request?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
	}
	
}
