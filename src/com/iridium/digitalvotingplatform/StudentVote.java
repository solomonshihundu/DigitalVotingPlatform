package com.iridium.digitalvotingplatform;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StudentVote extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4493998019008909133L;
	
	private Font btnFont;
	
	public StudentVote()
	{
		
		setLayout(null);
		setBackground(new Color(19,29,56));
	
		
		btnFont = new Font("Century Gothic",Font.BOLD,20);
	
		
		JButton deligate = new JButton("DELIGATE");
		deligate.setFont(btnFont);
		deligate.setIcon(new ImageIcon(getClass().getResource("/rook.png")));
		deligate.setBackground(new Color(48,57,135));
		deligate.setForeground(new Color(180,184,220));
		deligate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"voteDeligate");
			}
		});
		deligate.setBounds(8,20,250,300);
		add(deligate);
		
		JButton schRep = new JButton("SCHOOL\nREPRESENTATIVE");
		schRep.setFont(btnFont);
		schRep.setIcon(new ImageIcon(getClass().getResource("/bishop.png")));
		schRep.setBounds(272,20,250,300);
		schRep.setBackground(new Color(48,57,135));
		schRep.setForeground(new Color(180,184,220));
		schRep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
	//			nextFrame(cardPanel,"schRep");
			}
		});
		add(schRep);
		
		JButton classRep = new JButton("CLASS REPRESENTATIVE");
		classRep.setFont(btnFont);
		classRep.setIcon(new ImageIcon(getClass().getResource("/pawn.png")));
		classRep.setBounds(538,20,250,300);
		classRep.setBackground(new Color(48,57,135));
		classRep.setForeground(new Color(180,184,220));
		classRep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"classRep");
			}
		});
		add(classRep);
		
		JButton backBtn = new JButton();
		backBtn.setIcon(new ImageIcon(getClass().getResource("/back.png")));
		backBtn.setBounds(500,350,130,30);
		backBtn.setBackground(new Color(19,29,56));
		backBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"authentication");
			}
		});
		add(backBtn);
		
		JButton proceedBtn = new JButton();
		proceedBtn.setBounds(640,350,130,30);
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
		
		JButton homeBtn = new JButton();
		homeBtn.setBounds(360,350,130,30);
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
