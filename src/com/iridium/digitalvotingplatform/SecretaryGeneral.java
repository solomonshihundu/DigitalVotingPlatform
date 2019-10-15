package com.iridium.digitalvotingplatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SecretaryGeneral extends JPanel
{
	
	private static final long serialVersionUID = 8790660448479214877L;

	public SecretaryGeneral()
	{
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBackground(new Color(19,29,56));
		
		JButton backBtn = new JButton();
		backBtn.setIcon(new ImageIcon(getClass().getResource("/back.png")));
		backBtn.setBounds(500,330,130,40);
		backBtn.setBackground(new Color(19,29,56));
		backBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"deligate");
			}
		});
		add(backBtn);
		
		JButton proceedBtn = new JButton();
		proceedBtn.setBounds(640,330,130,40);
		proceedBtn.setIcon(new ImageIcon(getClass().getResource("/foward.png")));
		proceedBtn.setBackground(new Color(19,29,56));
		proceedBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"deligate");
			}
		});
		add(proceedBtn);
		
		JButton homeBtn = new JButton();
		homeBtn.setBounds(360,330,130,40);
		homeBtn.setIcon(new ImageIcon(getClass().getResource("/home.png")));
		homeBtn.setBackground(new Color(19,29,56));
		homeBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"start");
			}
		});
		add(homeBtn);
		
	
	}

}
