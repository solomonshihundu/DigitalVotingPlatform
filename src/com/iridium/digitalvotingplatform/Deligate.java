package com.iridium.digitalvotingplatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Deligate extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2358605626709235332L;

	public Deligate()
	{

		setBackground(new Color(19,29,56));
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		JButton backBtn = new JButton();
		backBtn.setIcon(new ImageIcon(getClass().getResource("/back.png")));
		backBtn.setBounds(500,330,130,40);
		backBtn.setBackground(new Color(19,29,56));
		backBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"student");
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
		//		nextFrame(cardPanel,"student");
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
			//	nextFrame(cardPanel,"start");
			}
		});
		add(homeBtn);
		
		//buttons for the individual candidates
		/*
		 * 
		 * 
		 * 
		 */
		JButton cand1 = new JButton();
		cand1.setBounds(15, 15, 200, 200);
		cand1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		add(cand1);
		
		JPanel cand1Pnl = new JPanel();
		cand1Pnl.setBounds(230,15,550,250);
		cand1Pnl.setBackground(new Color(19,29,56));
		add(cand1Pnl);
		
		/*
		 * 
		 * 
		 * Test 
		 */
		
		
		
		JButton cand2 = new JButton();
		cand2.setBounds(15, 500, 200, 200);
		cand2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		add(cand2);
		
		JPanel cand2Pnl = new JPanel();
		cand2Pnl.setBounds(230,500,550,250);
		add(cand2Pnl);
		
	 
	
		
	}

}
