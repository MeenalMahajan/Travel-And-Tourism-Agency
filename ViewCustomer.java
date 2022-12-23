package travel_and_Tourism_Organisation_System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class ViewCustomer extends JFrame implements ActionListener {
	JButton back;
      ViewCustomer(String username){
    	  setBounds(340,120,850, 550);
    	  getContentPane().setBackground(Color.cyan);
    	  setLayout(null);
    	  
    		JLabel lblName = new JLabel("VIEW CUSTOMER DETAILS");
    		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
    		lblName.setBounds(118,5, 300, 53);
    		add(lblName);
        
    	  
    	  JLabel lblusername= new JLabel("Username");
    	  lblusername.setBounds(30,50,150,25);
    	  add(lblusername);
    	  
    	  JLabel labelusername= new JLabel();
    	  labelusername.setBounds(220,50,150,25);
    	  add(labelusername);
    	  
    	  JLabel lblid= new JLabel("Id");
    	  lblid.setBounds(30,110,150,25);
    	  add(lblid);
    	  
    	  JLabel labelid= new JLabel();
    	  labelid.setBounds(220,110,150,25);
    	  add(labelid);
    	  
    	  JLabel lblnumber= new JLabel("Number");
    	  lblnumber.setBounds(30,170,150,25);
    	  add(lblnumber);
    	  
    	  JLabel labelnumber= new JLabel();
    	  labelnumber.setBounds(220,170,150,25);
    	  add(labelnumber);
    	  
    	  JLabel lblname= new JLabel("Name");
    	  lblname.setBounds(30,230,150,25);
    	  add(lblname);
    	  
    	  JLabel labelname= new JLabel();
    	  labelname.setBounds(220,230,150,25);
    	  add(labelname);
    	  
    	  JLabel lblgender= new JLabel("Gender");
    	  lblgender.setBounds(30,290,150,25);
    	  add(lblgender);
    	  
    	  JLabel labelgender= new JLabel();
    	  labelgender.setBounds(220,290,150,25);
    	  add(labelgender);
    	  
    	  JLabel lblcountry= new JLabel("Country");
    	  lblcountry.setBounds(500,50,150,25);
    	  add(lblcountry);
    	  
    	  JLabel labelcountry= new JLabel();
    	  labelcountry.setBounds(690,50,150,25);
    	  add(labelcountry);
    	  
    	  JLabel lbladdress= new JLabel("Address");
    	  lbladdress.setBounds(500,110,150,25);
    	  add(lbladdress);
    	  
    	  JLabel labeladdress= new JLabel();
    	  labeladdress.setBounds(690,110,150,25);
    	  add(labeladdress);
    	  
    	  JLabel lblphone= new JLabel("Phone");
    	  lblphone.setBounds(500,170,150,25);
    	  add(lblphone);
    	  
    	  JLabel labelphone= new JLabel();
    	  labelphone.setBounds(690,170,150,25);
    	  add(labelphone);
    	  
    	  JLabel lblemail= new JLabel("Email");
    	  lblemail.setBounds(500,230,150,25);
    	  add(lblemail);
    	  
    	  JLabel labelemail= new JLabel();
    	  labelemail.setBounds(690,230,150,25);
    	  add(labelemail);
    	  
    	  back = new JButton("Back");
  		  back.setBounds(350, 320, 100, 25);
          back.setBackground(Color.BLACK);
          back.setForeground(Color.WHITE);
  		  add(back);
  		  back.addActionListener(this);
  		
  		  ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/viewall.jpg"));
          Image i3 = i1.getImage().getScaledInstance(626,190,Image.SCALE_DEFAULT);
          ImageIcon i2 = new ImageIcon(i3);
          JLabel l1 = new JLabel(i2);
          l1.setBounds(0,350,626,201);
          add(l1);
          
          ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/viewall.jpg"));
          Image i5 = i4.getImage().getScaledInstance(626,190,Image.SCALE_DEFAULT);
          ImageIcon i6 = new ImageIcon(i5);
          JLabel l2 = new JLabel(i6);
          l2.setBounds(615,350,626,201);
          add(l2);
          
          try{
              Conn conn = new Conn();
                  String query = "select * from customer where username='"+username+"'";
                 ResultSet rs  =  conn.s.executeQuery(query);
                 while(rs.next()) {
                	 labelusername.setText(rs.getString("username"));
                	 labelid.setText(rs.getString("id"));
                	 labelnumber.setText(rs.getString("number"));
                	 labelname.setText(rs.getString("name"));
                	 labelgender.setText(rs.getString("gender"));
                	 labelcountry.setText(rs.getString("country"));
                	 labeladdress.setText(rs.getString("address"));
                	 labelphone.setText(rs.getString("phone"));
                	 labelemail.setText(rs.getString("email"));
                 }
          }
          catch(Exception e1){
                  e1.printStackTrace();
          }
	
    	  
    	  setVisible(true);
    	  
    	  
    	  
		
	}
      public void actionPerformed(ActionEvent ae) {
    	  setVisible(false);
      }



   public static void main(String[] args) {
	new ViewCustomer("username");
   }
}
