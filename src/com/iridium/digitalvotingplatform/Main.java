package com.iridium.digitalvotingplatform;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame
{
	
	/*
	 * Local variable declarations
	 * 
	 * 
	 */
	private static final long serialVersionUID = 8416918689457323819L;

	
	private JPanel cardPanel;
	private JPanel startUpPanel;
	private JPanel authenPanel;
	private JPanel deligatePnl;
	private JPanel studentPnl;
	
	private JPanel chairPnl;
	private JPanel secgenPnl;
	private JPanel financePnl;
	private JPanel acadPnl;
	private JPanel genderPnl;
	private JPanel sportsPnl;
	
	private JPanel schRepPnl;
	private JPanel voteDeligatePnl;
	private JPanel classRepPnl;
	
	private Font titleFont;
	private Font subtitleFont;
	private Font mainFont;
	private Font textFont;
	private Font btnFont;
	
	private JButton startBtn;
	
	private CardLayout myLayout;
	private STATE state = STATE.start;
	
//	private JScrollPane deligateScroll = new JScrollPane(voteDeligatePnl,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	private JScrollPane deligateScroll = new JScrollPane();
	
	public Main() 
	{
		/*
		 * JFrame initializations
		 */
		super("DigitalVoter");
		setBounds(100, 100, 800, 400);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setResizable(false);
		
		/*
		 * Font initializations
		 */
		mainFont = new Font("algerian",Font.BOLD,30);
		titleFont = new Font("castellar",Font.PLAIN,22);
		subtitleFont = new Font("Times New Roman",Font.PLAIN,18);
		textFont = new Font("Serif",Font.BOLD,14);
		btnFont = new Font("Century Gothic",Font.BOLD,20);
		
		/*
		 * Main flow panel initializations
		 */
		
		startUpPanel = new JPanel();
		authenPanel = new JPanel();
		deligatePnl = new JPanel();
		studentPnl = new JPanel();
				
	/*
	 * layout initializations, set to card layout to allow movement in between activities
	 */
		myLayout = new CardLayout();
		
		cardPanel = new JPanel();
		cardPanel.setLayout(myLayout);
		cardPanel.setVisible(true);
	
		
		/*
		 * population of the card layout 
		 * this is done based on hierarchy
		 */
		
	
		cardPanel.add("start",new StartUp());
		cardPanel.add("sports", new SportsAndEntertainment());	
		cardPanel.add("student", new StudentVote());
		cardPanel.add("deligate",new DeligateVote());	
		cardPanel.add("authentication",new Authentication());
		cardPanel.add("chair", new Chairperson());
		cardPanel.add("secgen", new SecretaryGeneral());
		cardPanel.add("finance", new FinanceSecretary());
		cardPanel.add("academic", new AcademicSecretary());
		cardPanel.add("gender", new Gender());
		cardPanel.add("schRep", new SchoolRep());
		cardPanel.add("voteDeligate", new Deligate());
		cardPanel.add("classRep", new ClassRep());
		
		/*
		 * ExitButton 
		 */
		
    	add(cardPanel,BorderLayout.CENTER);
	
		setVisible(true);	
	}
	
	
	/*
	 * flow control methods 
	 */
	private void nextFrame(Container c,String name)
	{
		myLayout.show(c, name);
	}
	
	public static void main(String[] args) 
	{
		new Main();
	}
	
	

}
