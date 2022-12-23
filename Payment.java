package travel_and_Tourism_Organisation_System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Payment extends JFrame implements ActionListener{
	JButton pay,back;
    public Payment(){
        
        setLayout(null);
        setBounds(340, 80, 800, 600);
        
        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/paytm.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 150, 800, 600);
        add(l4);
        
        pay = new JButton("Pay");
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Paytm().setVisible(true);
            }
        });
        pay.setBounds(420, 20, 80, 40);
        add(pay);
    
        back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(510, 20, 80, 40);
        add(back);
        
        getContentPane().setBackground(Color.cyan);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource() == pay) {
    		setVisible(false);
    		new Paytm();
    		
    	}else {
    		setVisible(false);
    	}
    }

    public static void main(String[] args){
        new Payment().setVisible(true);
    }
    
}