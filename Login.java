package travel_and_Tourism_Organisation_System;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
public class Login extends JFrame implements ActionListener {
	
	
	JButton b1, b2, b3;
	JTextField t1;
	JPasswordField t2;
	
	Login(){
		setSize(650,350);
		//setVisible(true);
		setLocation(300,200);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		
		JPanel p1= new JPanel();
		//p1.setBackground(new Color(255,204,204));
		p1.setBackground(Color.white);
		//p1.setBackground(new Color(255,230,230));
		p1.setBounds(0,0,290,370);
		add(p1);
		
		//p1.setLayout(null);
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/user-login.jpg"));
		Image i2 = i1.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
        l1.setBounds(100,700,200,300);
		l1.setLocation(100,700);
        p1.add(l1);
		
		JPanel p2 =new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(255,204,204));
		p2.setBounds(291,20,320,260);
		add(p2);
		
		JLabel l2=new JLabel("Username:");
		l2.setBounds(50,20,140,25);
		l2.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		p2.add(l2);
		
	    t1 = new JTextField();
		t1.setBounds(50,60,250,25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p2.add(t1);		
		
		JLabel l3=new JLabel("Password:");
		l3.setBounds(50,100,140,25);
		l3.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		p2.add(l3);
		
		 t2 = new JPasswordField();
		t2.setBounds(50,140,250,25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p2.add(t2);		
		
	    b1 = new JButton("Login");
	    b1.addActionListener(this);
		//b1.setBackground(new Color(255,204,204));
		//b1.setForeground(Color.black);
		b1.setForeground(Color.white);
		b1.setBackground(Color.BLACK);
		
		b1.setBorder(BorderFactory.createEmptyBorder());
		b1.setBounds(50,180,100,25);
		p2.add(b1);
		
	    b2 = new JButton("Signup");
	    b2.addActionListener(this);
		//b2.setBackground(new Color(255,204,204));
		b2.setForeground(Color.white);
		b2.setBackground(Color.BLACK);
		b2.setBorder(BorderFactory.createEmptyBorder());
		b2.setBounds(190,180,100,25);
		p2.add(b2);
		
		
	    b3 = new JButton("Forget Password");
	    b3.addActionListener(this);
		//b3.setBackground(new Color(255,204,204));
		//b3.setForeground(Color.black);
		b3.setForeground(Color.white);
		b3.setBackground(Color.BLACK);
		
		b3.setBorder(BorderFactory.createEmptyBorder());
		b3.setBounds(80,220,130,25);
		p2.add(b3);
		
		JLabel l4=new JLabel("Trouble in login...");
		l4.setForeground(Color.RED);
		l4.setBounds(220,220,140,25);
		l4.setFont(new Font("SAN_SERIF",Font.PLAIN,12));
		p2.add(l4);
	
		
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			try {
				String username = t1.getText();
				String password = t2.getText();
				
				if(t1.getText().equals(null) || t2.getText().equals(null)) {
					
					JOptionPane.showMessageDialog(null,"Incorrect username or password");
					System.exit(0);
				}
				
				String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
				Conn c= new Conn();
				ResultSet rs = c.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Loading(username).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Incorrect username or password");
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		else if(ae.getSource()==b2) {
			this.setVisible(false);
			new Signup().setVisible(true);
		}
		else if(ae.getSource()==b3) {
			this.setVisible(false);
			new ForgotPassword().setVisible(true);
	
		}
		
	}
	public static void main(String [] args) {
		new Login();
		
		
		
	}
	

}
