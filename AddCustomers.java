package travel_and_Tourism_Organisation_System;
import java.awt.*;


import javax.swing.border.EmptyBorder;

import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class AddCustomers extends JFrame implements ActionListener {

	
	
	private JPanel contentPane;
	JLabel labelusername, labelname;
	
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8;
        JComboBox comboBox;
        JRadioButton r1,r2;
        JButton add, back;
        Choice c1;
      static  String username;

        public AddCustomers(String username){

        	this.username = username;
        	setBounds(340,120,850,550);
        	setLayout(null);
        	
        	getContentPane().setBackground(Color.cyan);
        	
        	JLabel lblName = new JLabel("ADD CUSTOMER DETAILS");
    		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
    		lblName.setBounds(118, 11, 300, 53);
    		add(lblName);
        
        	
        	
        	JLabel lblusername = new JLabel("Username :");
        	lblusername.setBounds(35, 70, 200, 14);
    		add(lblusername);
            
    		labelusername = new JLabel();
    		labelusername.setBounds(271, 70, 150, 20);
    		add(labelusername);
    		
    		
    		JLabel lblid = new JLabel("Id :");
    		lblid.setBounds(35, 110, 200, 14);
    		add(lblid);
    		
        	comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
    	    comboBox.setBounds(271, 110, 150, 20);
    	    comboBox.setBackground(Color.cyan);
         	add(comboBox);
         	
         	JLabel l2 = new JLabel("Number :");
     		l2.setBounds(35, 150, 200, 14);
     		add(l2);
     		
     		t1 = new JTextField();
    		t1.setBounds(271, 150, 150, 20);
    		add(t1);
    		t1.setColumns(10);
    		
    		
    		JLabel lblName_1 = new JLabel("Name :");
    		lblName_1.setBounds(35, 190, 200, 14);
    		add(lblName_1);
    		
    		/*t2 = new JTextField();
    		t2.setBounds(271, 190, 150, 20);
    		add(t2);
    		t2.setColumns(10);
*/
    		labelname = new JLabel();             
    		labelname.setBounds(271, 190, 150, 20);
    		add(labelname);
    		
    		
    		JLabel lblGender = new JLabel("Gender :");
    		lblGender.setBounds(35, 230, 200, 14);
    		add(lblGender);
                    
            r1 = new JRadioButton("Male");
            r1.setFont(new Font("Raleway", Font.BOLD, 14));
            r1.setBackground(Color.cyan);
            r1.setBounds(271, 230, 80, 12);
            add(r1);
                    
            r2 = new JRadioButton("Female");
            r2.setFont(new Font("Raleway", Font.BOLD, 14));
            r2.setBackground(Color.cyan);
            r2.setBounds(350, 230, 100, 12);
    		add(r2);
    		        
    		 ButtonGroup bg = new ButtonGroup();
             bg.add(r1);
    		 bg.add(r2);
    		 
    		    JLabel lblCountry = new JLabel("Country :");
    			lblCountry.setBounds(35, 270, 200, 14);
    			add(lblCountry);
    	                
    	        t3 = new JTextField();
    			t3.setBounds(271, 270, 150, 20);
    			add(t3);
    			t3.setColumns(10);
    			
    			JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
    			lblReserveRoomNumber.setBounds(35, 310, 200, 14);
    			add(lblReserveRoomNumber);
    	                
    	        t5 = new JTextField();
    			t5.setBounds(271, 310, 150, 20);
    			add(t5);
    			t5.setColumns(10);
    	        
    			
    			JLabel lblphone= new JLabel("Phone :");
    			lblphone.setBounds(35, 350, 200, 14);
    			add(lblphone);
    	                
    	        t6 = new JTextField();
    			t6.setBounds(271, 350, 150, 20);
    			add(t6);
    			t6.setColumns(10);
    			
    			JLabel lblemail = new JLabel("Email :");
    			lblemail.setBounds(35, 390, 200, 14);
    			add(lblemail);
    			
    			t8 = new JTextField();
    			t8.setBounds(271, 390, 150, 20);
    			add(t8);
    			t8.setColumns(10);
    			
    		add = new JButton("Add");
    		add.setBackground(Color.BLACK);
    		add.setForeground(Color.white);
    		add.setBounds(100, 430, 120, 30);
    		add.addActionListener(this);
    		add(add);
            
    		back = new JButton("Back");
    		back.setBackground(Color.BLACK);
    		back.setForeground(Color.white);
    		back.setBounds(260, 430, 120, 30);
    		back.addActionListener(this);
            add(back);
            
    		
    		 ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/newcustomer.jpg"));
    	     Image i3 = i1.getImage().getScaledInstance(350, 490,Image.SCALE_DEFAULT);
    	     ImageIcon i2 = new ImageIcon(i3);
             JLabel l1 = new JLabel(i2);
             l1.setBounds(420,55,410,420);
    	     add(l1);
    	     
    	     try {
    	    	 
    	    	 Conn c = new Conn();
    	    	ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
    	    	
    	    	while(rs.next()) {
    	    		labelusername.setText(rs.getString("username"));
    	    		labelname.setText(rs.getString("name"));
    	    	}
    	    	 
    	     } catch(Exception e) {
    	    	 
    	    	 e.printStackTrace();    	     }
    			
            
    		setVisible(true);
            
        }
        
        public void actionPerformed(ActionEvent ae) {
        	if(ae.getSource()== add) {
        		
        		
        		if(labelusername.getText().equals("") || t1.getText().equals("") || t3.getText().equals("") || t5.getText().equals("") || t6.getText().equals("") || t8.getText().equals("")) {
        			
        			
        			JOptionPane.showMessageDialog(null, "Please enter valid input!");
        			
        		}else {
        		String username = labelusername.getText();
        		String id = (String)comboBox.getSelectedItem();
        		String number =t1.getText();
        		String name = labelname.getText();
        		String gender = null;
        		if(r1.isSelected()) {
        			gender = "Male";
        		}
        		else {
        			gender = "Female";
        			
        		}
        		String country = t3.getText();
        		String address= t5.getText();
        		String phone = t6.getText();
        		String email = t8.getText();
        		
        		try {
        			Conn c = new Conn();
        			String query = "insert into customer values('"+username+"', '"+id+"', '"+number+"' , '"+name+"', '"+gender+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"')";
        			// String query = "insert into customer(username,id,number, name,gender,country,address,phone,email) values('"+username+"', '"+id+"','"+number+"' , '"+name+"', '"+gender+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"')";
        			c.s.executeUpdate(query);
        			
        			JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
        			setVisible(false);
        		}catch(Exception e) {
        			e.printStackTrace();
        		}
        		
        		
        		
        		
        		
        		
        	}
        		}
        	else {
        		setVisible(false);
        	}
        }
        
	public static void main(String[] args) {
		new AddCustomers(username);

	}

}
