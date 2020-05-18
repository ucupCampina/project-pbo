package com.empat.kelasku.ui.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JadwalView extends JPanel {

	/**
	 * Create the panel.
	 */
	public JadwalView() {
		
		JLabel lblNewLabel = new JLabel("Hello Dari JadwalView");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		add(lblNewLabel);

	}

}
