package com.iridium.digitalvotingplatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ClassRep extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5921751614718282746L;

	public ClassRep()
	{

		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBackground(new Color(19,29,56));
		
		JButton backBtn = new JButton();
		backBtn.setIcon(new ImageIcon(getClass().getResource("/back.png")));
		backBtn.setBounds(500,330,130,30);
		backBtn.setBackground(new Color(19,29,56));
		backBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"student");
			}
		});
		add(backBtn);
		
		JButton proceedBtn = new JButton();
		proceedBtn.setBounds(640,330,130,30);
		proceedBtn.setIcon(new ImageIcon(getClass().getResource("/foward.png")));
		proceedBtn.setBackground(new Color(19,29,56));
		proceedBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"student");
			}
		});
		add(proceedBtn);
		
		JButton homeBtn = new JButton();
		homeBtn.setBounds(360,330,130,30);
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
