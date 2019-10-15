package com.iridium.digitalvotingplatform;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class StartUp extends JPanel
{
	
	
	private static final long serialVersionUID = -70324430976373791L;
	
	private Font titleFont;
	private Font subtitleFont;
	private Font mainFont;

	
	public StartUp()
	{
		setBounds(100, 100, 800, 400);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBackground(new Color(19,29,56));
		
		mainFont = new Font("algerian",Font.BOLD,30);
		titleFont = new Font("castellar",Font.PLAIN,22);
		subtitleFont = new Font("Times New Roman",Font.PLAIN,18);
		
		
		JLabel titleLbl = new JLabel("UNIVERSITY DIGITAL VOTING PLATFORM");
		titleLbl.setFont(mainFont);
		titleLbl.setForeground(new Color(180,184,220));
		titleLbl.setBounds(80, 50, 800, 40);
		add(titleLbl);
	
		
		/*
		 * on click sends you to authentication activity
		 */
		JButton startBtn = new JButton();
		startBtn.setBackground(new Color(53,56,63));
		startBtn.setForeground(new Color(180,184,220));
		startBtn.setBorderPainted(true);
		startBtn.setText("Lets Start");
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"authentication");
			}
		});
		
		startBtn.setFont(titleFont);
		startBtn.setBounds(250, 300, 300, 50);
		add(startBtn);
		
		/*
		 * CopyWrite information 
		 */
		JLabel lblNewLabel_2 = new JLabel("C: 2019 ");
		lblNewLabel_2.setFont(subtitleFont);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(32, 475, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Powered by Iridium.inc");
		lblNewLabel_3.setFont(subtitleFont);
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(105, 475, 167, 14);
		add(lblNewLabel_3);
		
		JButton exitBtn = new JButton();
		exitBtn.setBounds(775,3,20,20);
		exitBtn.setIcon(new ImageIcon(getClass().getResource("/exit.png")));
		exitBtn.setBackground(new Color(19,29,56));
		exitBtn.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
				});
		add(exitBtn);
		
	}

}
