package travel_and_Tourism_Organisation_System;



import java.awt.*;

import javax.swing.border.EmptyBorder;

import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BookPackage extends JFrame implements ActionListener{
	
        JTextField t1,t2;
        JLabel l1,l2,l3,l4,l5;
        Choice c1,c2,c3;
	    JButton b1,b2,b3;
	   static String username;
        
	public BookPackage(String username) {
		
		       this.username = username;
		        setBounds(320, 150, 910, 480);
		
		
		       
                getContentPane().setBackground(Color.cyan);
                setLayout(null);
        
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/bookpackage.jpg"));
                Image i3 = i1.getImage().getScaledInstance(400, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(485,50,400,300);
                add(la1);
		
		JLabel lblName = new JLabel("BOOK PACKAGE");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		add(lblName);
                
        JLabel lbluser = new JLabel("Username :");
        lbluser.setBounds(35, 70, 200, 14);
		add(lbluser);
                
        l1 = new JLabel(username);
		l1.setBounds(271, 70, 200, 14);
		add(l1);
                
        JLabel lblId = new JLabel("Select Package :");
		lblId.setBounds(35, 110, 200, 14);
		add(lblId);
                
                c1 = new Choice();
                c1.add("Gold Package");
                c1.add("Silver Package");
                c1.add("Bronze Package");
                c1.setBounds(271, 110, 150, 30);
                add(c1);
                
        JLabel la3 = new JLabel("Total Persons");
		la3.setBounds(35, 150, 200, 14);
		add(la3);
                
        t1 = new JTextField();
        t1.setText("0");
		t1.setBounds(271, 150, 150, 20);
		add(t1);
		t1.setColumns(10);
                
		JLabel lbl1 = new JLabel("ID :");
		lbl1.setBounds(35, 190, 200, 14);
		add(lbl1);
                
        l2 = new JLabel();
		l2.setBounds(271, 190, 200, 14);
		add(l2);
		
		JLabel lbl2 = new JLabel("Number :");
		lbl2.setBounds(35, 230, 200, 14);
		add(lbl2);
                
        l3 = new JLabel();
		l3.setBounds(271, 230, 200, 14);
		add(l3);
           	
		JLabel lbl3 = new JLabel("Phone :");
		lbl3.setBounds(35, 270, 200, 14);
		add(lbl3);
                
        l4 = new JLabel();
		l4.setBounds(271, 270, 200, 14);
		add(l4);

		
		JLabel lblDeposite = new JLabel("Total Price :");
		lblDeposite.setBounds(35, 310, 200, 14);
		add(lblDeposite);
		
	    l5 = new JLabel("Rs 0");
		l5.setBounds(271, 310, 200, 14);
        l5.setForeground(Color.RED);
		add(l5);
		
		
		
		 b1 = new JButton("Check Price");
		 b1.addActionListener(this);
		 b1.setBounds(50, 380, 120, 30);
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
	     add(b1);
	     
	     b2 = new JButton("Book Package");
		 b2.addActionListener(this);
		 b2.setBounds(200, 380, 120, 30);
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
	     add(b2);
	
	     b3 = new JButton("Back");
		 b3.addActionListener(this);
		 b3.setBounds(350, 380, 120, 30);
         b3.setBackground(Color.BLACK);
         b3.setForeground(Color.WHITE);
	     add(b3);
	
	     
	
		
		setVisible(true);      
		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        l2.setText(rs.getString("id"));
                        l3.setText(rs.getString("number"));
                        l4.setText(rs.getString("phone"));
                        
                    }

                    rs.close();
                }catch(SQLException e){
                	
                	e.printStackTrace();
                }
                
                
	}
	
                public void actionPerformed(ActionEvent e) {
                	
                	if(e.getSource() == b1) {
                		
                		    
                            String pack = c1.getSelectedItem();
                            
                            int cost = 0;
                            if(pack.equals("Gold Package")) {
                                cost += 12000;
                            }else if(pack.equals("Silver Package")){
                                cost += 25000;
                            }else{
                                cost += 32000;
                            }
                            
                            cost *= Integer.parseInt(t1.getText());
                            if(cost>0) {
                           // cost *= Integer.parseInt(t1.getText());
                            l5.setText("Rs "+cost);
                            }else {
                            	JOptionPane.showMessageDialog(null, "Please enter valid details!");
                            }
                	}
		 
                	else if(e.getSource() == b2) {
                	
                           
                          
                            try{
                            	Conn c = new Conn();
	    			            String s1 = c1.getSelectedItem(); 
                                
	    			            if(l5.getText().equals("Rs 0")) {
	    			            	
	    			            	 JOptionPane.showMessageDialog(null, "Sorry! Can't Book");
	    			            }else {
                               String q1 = "insert into bookPackage values( '" +l1.getText()+"','"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                               c.s.executeUpdate(q1);
                                
	    			           JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                               setVisible(false);}
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
                	}
                	else {
                		setVisible(false);
                	}
                            
			}
		
		                  		
		 
		
	
public static void main(String[] args) {
	new BookPackage(username);
}

}
