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

public class Authentication extends JPanel
{
	
	
	private static final long serialVersionUID = 4646777104097027602L;
	
	private Font subtitleFont;
	private Font textFont;

	
	public Authentication()
	{

		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(new Color(19,29,56));
		setLayout(null);
		
	
		subtitleFont = new Font("Times New Roman",Font.PLAIN,18);
		textFont = new Font("Serif",Font.BOLD,14);
		
		
		/*
		 * on click sends user to student type voting panel 
		 * can vote class representatives,school representatives or delegates
		 */
		JButton stdBtn = new JButton("Student");
		stdBtn.setBackground(new Color(48,57,135));
		stdBtn.setForeground(new Color(255,178,127));
		stdBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
		//		nextFrame(cardPanel,"student");
			}
		});
		stdBtn.setBounds(510,35,130,40);
		add(stdBtn);
		
		/*
		 * 	On click send user to delegate voting type where , the delegate
		 * 	can vote executives
		 */
		JButton deligateBtn = new JButton("Deligate");
		deligateBtn.setBackground(new Color(48,57,135));
		deligateBtn.setForeground(new Color(255,178,127));
		deligateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			//	nextFrame(cardPanel,"deligate");
			}
		});
		
		deligateBtn.setBounds(650,35, 130,40);
		
		add(deligateBtn);
		
		
		
		/*
		 * User details display 
		 * 
		 */
		
		JPanel detailsPanel = new JPanel();
		detailsPanel.setBackground(new Color(48,57,135));
		detailsPanel.setBounds(5,90,500,300);
		detailsPanel.setLayout(null);
		
	
		
		JLabel name =new JLabel("Name");
		name.setFont(textFont);
		name.setForeground(Color.white);
		name.setBounds(20,20,200,50);
		detailsPanel.add(name);
		
		JLabel course =new JLabel("Course");
		course.setBounds(20,60,200,50);
		course.setFont(textFont);
		course.setForeground(Color.white);
		detailsPanel.add(course);
		
		JLabel school =new JLabel("School");
		school.setBounds(20,100,200,50);
		school.setFont(textFont);
		school.setForeground(Color.white);
		detailsPanel.add(school);
		
		JLabel department =new JLabel("Department");
		department.setBounds(20,140,200,50);
		department.setFont(textFont);
		department.setForeground(Color.white);
		detailsPanel.add(department);
		
		JLabel nationalID =new JLabel("National ID");
		nationalID.setBounds(20,180,200,50);
		nationalID.setFont(textFont);
		nationalID.setForeground(Color.white);
		detailsPanel.add(nationalID);
		
		JLabel schoolID =new JLabel("School ID");
		schoolID.setBounds(20,220,200,50);
		schoolID.setFont(textFont);
		schoolID.setForeground(Color.white);
		detailsPanel.add(schoolID);
		
		
		JLabel stdName =new JLabel(":");
		stdName.setFont(textFont);
		stdName.setForeground(new Color(255,178,127));
		stdName.setBounds(100,20,300,50);
		detailsPanel.add(stdName);
		
		JLabel stdCourse =new JLabel(":");
		stdCourse.setBounds(100,60,300,50);
		stdCourse.setFont(textFont);
		stdCourse.setForeground(new Color(255,178,127));
		detailsPanel.add(stdCourse);
		
		JLabel stdSch =new JLabel(":");
		stdSch.setBounds(100,100,300,50);
		stdSch.setFont(textFont);
		stdSch.setForeground(new Color(255,178,127));
		detailsPanel.add(stdSch);
		
		JLabel stdDep =new JLabel(":");
		stdDep.setBounds(100,140,300,50);
		stdDep.setFont(textFont);
		stdDep.setForeground(new Color(255,178,127));
		detailsPanel.add(stdDep);
		
		JLabel stdNatID =new JLabel(":");
		stdNatID.setBounds(100,180,300,50);
		stdNatID.setFont(textFont);
		stdNatID.setForeground(new Color(255,178,127));
		detailsPanel.add(stdNatID);
		
		JLabel stdSchID =new JLabel(":");
		stdSchID.setBounds(100,220,300,50);
		stdSchID.setFont(textFont);
		stdSchID.setForeground(new Color(255,178,127));
		detailsPanel.add(stdSchID);
		
		JPanel imagePanel = new JPanel();
		imagePanel.setBounds(510,90,285,250);
		imagePanel.setBackground(new Color(65,68,83));
		JLabel imageLbl = new JLabel(new ImageIcon(getClass().getResource("/profile.png")));
		imageLbl.setBounds(0, 0, 285,250);
		imagePanel.add(imageLbl);
		add(imagePanel);
	
		
		JLabel instructions =  new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		instructions.setBounds(10,10,750,50);
		instructions.setFont(subtitleFont);
		instructions.setForeground(new Color(255,178,127));;
		add(instructions);
		
		add(detailsPanel);
		
		
		/*
		 * 
		 * Return user back to home 
		 */
		JButton homeBtn = new JButton();
		homeBtn.setBounds(665,350,130,40);
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
		
	
		
	
	}
}
