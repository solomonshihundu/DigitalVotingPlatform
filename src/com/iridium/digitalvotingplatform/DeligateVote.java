package com.iridium.digitalvotingplatform;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DeligateVote extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7864419404663495290L;
	private Font btnFont;
	
	public DeligateVote()
	{

		setLayout(null);
		setBackground(new Color(19,29,56));
		
		btnFont = new Font("Century Gothic",Font.BOLD,20);
		
		//sends user to vote for president 
		
		JButton chair = new JButton("PRESIDENT");
		chair.setFont(btnFont);
		chair.setBackground(new Color(48,57,135));
		chair.setBounds(8,30,250,155);
		chair.setIcon(new ImageIcon(getClass().getResource("/president.png")));
		chair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"chair");
			}
		});
		add(chair);
		
		//sends user to vote for secretary general
		
		JButton secGen = new JButton("SECRETARY\nGENERAL");
		secGen.setFont(btnFont);
		secGen.setBounds(271,30,250,155);
		secGen.setBackground(new Color(48,57,135));
		secGen.setIcon(new ImageIcon(getClass().getResource("/knight.png")));
		secGen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"secgen");
			}
		});
		add(secGen);
		
		
		/*
		 * 
		 * sends user to vote for the finance secretary
		 */
		
		JButton finance = new JButton("FINANCE\nSECRETARY");
		finance.setFont(btnFont);
		finance.setBounds(534,30,250,155);
		finance.setIcon(new ImageIcon(getClass().getResource("/finance.png")));
		finance.setBackground(new Color(48,57,135));
		finance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"finance");
			}
		});
		add(finance);
		
		/*
		 *
		 * sends user to vote for the academic secretary
		 */
		JButton academicSec = new JButton("ACADEMIC\nSECRETARY");
		academicSec.setFont(btnFont);
		academicSec.setBounds(8,188,250,155);
		academicSec.setIcon(new ImageIcon(getClass().getResource("/academic.png")));
		academicSec.setBackground(new Color(48,57,135));
		academicSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"academic");
			}
		});
		add(academicSec);
		
		/*
		 * 
		 * sends user to vote for the gender secretary
		 */
		JButton gender = new JButton("GENDER\nAFFAIRS");
		gender.setFont(btnFont);
		gender.setBounds(271,188,250,155);
		gender.setIcon(new ImageIcon(getClass().getResource("/gender.png")));
		gender.setBackground(new Color(48,57,135));
		gender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"gender");
			}
		});
		add(gender);
		
		/*
		 * 
		 * sends user to vote for the sports official
		 */
		JButton sportsEnt = new JButton("SPORTS,CULTURE&\nENTERTAINMENT");
		sportsEnt.setFont(btnFont);
		sportsEnt.setBounds(534,188,250,155);
		sportsEnt.setIcon(new ImageIcon(getClass().getResource("/sportsculture.png")));
		sportsEnt.setBackground(new Color(48,57,135));
		sportsEnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"sports");
			}
		});
		add(sportsEnt);
		
		
		/*
		 * switches from executive voting options back to
		 * the authentication panel
		 */
		JButton backBtn = new JButton();
		backBtn.setIcon(new ImageIcon(getClass().getResource("/back.png")));
		backBtn.setBounds(500,350,130,40);
		backBtn.setBackground(new Color(19,29,56));
		backBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"authentication");
			}
		});
		add(backBtn);
		
		/*
		 * allows the user to proceed to the next process 
		 */
		JButton proceedBtn = new JButton();
		proceedBtn.setBounds(640,350,130,40);
		proceedBtn.setIcon(new ImageIcon(getClass().getResource("/foward.png")));
		proceedBtn.setBackground(new Color(19,29,56));
		proceedBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"authentication");
			}
		});
		add(proceedBtn);
		
		/*
		 * 
		 * Return user back to home 
		 */
		JButton homeBtn = new JButton();
		homeBtn.setBounds(360,350,130,40);
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
