package travel_and_Tourism_Organisation_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class background extends JFrame{

	JLabel l10;
	public background(){
		
		//  setBounds(280,20, 900, 650);
	
		    setExtendedState(JFrame.MAXIMIZED_BOTH);
		    setLayout(null);
		
		    getContentPane().setBackground(new Color(220, 250, 250));
	       // setUndecorated(true);
		    ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/home.jpg"));
	        Image i26 = i25.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
	        ImageIcon i27 = new ImageIcon(i26);
	        l10 = new JLabel(i27);
	        l10.setBounds(0, 0, 1300, 700);
	        add(l10);
	       // l10.setVisible(false);
	        JLabel text = new JLabel("Travel and Tourism Organisation System");
			text.setBounds(300,70,1200,70);
			text.setForeground(Color.WHITE);
			text.setFont(new Font("Raleway", Font.PLAIN,40));
			l10.add(text);
			
	        


	}
	public static void main(String[] args) {
		
		 new background().setVisible(true);
		 new SplashFrame().setVisible(true);

	}

}
