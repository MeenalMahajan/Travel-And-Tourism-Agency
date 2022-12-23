package travel_and_Tourism_Organisation_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
public class Dashboard extends JFrame implements ActionListener  {
    
	static String username;
	JButton addPersonalDetails,updatePersonalDetails, viewPersonalDetails , deletePersonalDetails,checkPackages, bookPackage,viewpackage,viewhotels, bookhotel,viewBookedHotel,destinations, payments,calculators,notepad,about;
	public Dashboard(String username){
		this.username =username;
		//setBounds(0,0,1620,1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1600,65);
		add(p1);
		
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/capy.png"));
      Image i2 = i1.getImage().getScaledInstance(65,65,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel icon = new JLabel(i3);
      icon.setBounds(5,0,65, 65);
      p1.add(icon);
      
      
      JLabel heading= new JLabel("Dashboard");
      heading.setBounds(80,10,300,40);
      heading.setForeground(Color.WHITE);
      heading.setFont(new Font("Tahoma",Font.BOLD,30));
      p1.add(heading);
      

		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0,65,300,900);
		add(p2);
		
		addPersonalDetails = new JButton("Add Personal Details");
		addPersonalDetails.setBounds(0,0,300,40);
		addPersonalDetails.setBackground(new Color(0,0,102));
		addPersonalDetails.setForeground(Color.WHITE);
		addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		addPersonalDetails.setMargin(new Insets(0,0,0,60));
		addPersonalDetails.addActionListener(this);
		p2.add(addPersonalDetails);
		
		

		updatePersonalDetails = new JButton("Update Personal Details");
		updatePersonalDetails.setBounds(0,40,300,40);
		updatePersonalDetails.setBackground(new Color(0,0,102));
		updatePersonalDetails.setForeground(Color.WHITE);
		updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		updatePersonalDetails.setMargin(new Insets(0,0,0,30));
		updatePersonalDetails.addActionListener(this);
		p2.add(updatePersonalDetails);
		
		
	    
		viewPersonalDetails = new JButton("View Details");
		viewPersonalDetails.setBounds(0,80,300,40);
		viewPersonalDetails.setBackground(new Color(0,0,102));
		viewPersonalDetails.setForeground(Color.WHITE);
		viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewPersonalDetails.setMargin(new Insets(0,0,0,130));
		viewPersonalDetails.addActionListener(this);
		p2.add(viewPersonalDetails);
		
	
	    deletePersonalDetails = new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,120,300,40);
		deletePersonalDetails.setBackground(new Color(0,0,102));
		deletePersonalDetails.setForeground(Color.WHITE);
		deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		deletePersonalDetails.setMargin(new Insets(0,0,0,40));
		deletePersonalDetails.addActionListener(this);
		p2.add(deletePersonalDetails);
		
		
	
	    checkPackages = new JButton("View Packages");
		checkPackages.setBounds(0,160,300,40);
		checkPackages.setBackground(new Color(0,0,102));
		checkPackages.setForeground(Color.WHITE);
		checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		checkPackages.setMargin(new Insets(0,0,0,110));
		checkPackages.addActionListener(this);
		p2.add(checkPackages);
		
		
	    bookPackage = new JButton("Book Package");
		bookPackage.setBounds(0,200,300,40);
		bookPackage.setBackground(new Color(0,0,102));
		bookPackage.setForeground(Color.WHITE);
		bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookPackage.setMargin(new Insets(0,0,0,120));
		bookPackage.addActionListener(this);
		p2.add(bookPackage);
		
	
		viewpackage = new JButton("View Booked Package");
		viewpackage.setBounds(0,240,300,40);
		viewpackage.setBackground(new Color(0,0,102));
		viewpackage.setForeground(Color.WHITE);
		viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewpackage.setMargin(new Insets(0,0,0,60));
		viewpackage.addActionListener(this);
		p2.add(viewpackage);
		
	
	    viewhotels = new JButton("View Hotels");
		viewhotels.setBounds(0,280,300,40);
		viewhotels.setBackground(new Color(0,0,102));
		viewhotels.setForeground(Color.WHITE);
		viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewhotels.setMargin(new Insets(0,0,0,135));
		viewhotels.addActionListener(this);
		p2.add(viewhotels);
	
	    bookhotel = new JButton("Book Hotel");
		bookhotel.setBounds(0,320,300,40);
		bookhotel.setBackground(new Color(0,0,102));
		bookhotel.setForeground(Color.WHITE);
		bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookhotel.setMargin(new Insets(0,0,0,140));
		bookhotel.addActionListener(this);
		p2.add(bookhotel);
	
		
		viewBookedHotel = new JButton("View Booked Hotel");
		viewBookedHotel.setBounds(0,360,300,40);
		viewBookedHotel.setBackground(new Color(0,0,102));
		viewBookedHotel.setForeground(Color.WHITE);
		viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewBookedHotel.setMargin(new Insets(0,0,0,70));
		viewBookedHotel.addActionListener(this);
		p2.add(viewBookedHotel);
	
		
		destinations = new JButton("Destinations");
		destinations.setBounds(0,400,300,40);
		destinations.setBackground(new Color(0,0,102));
		destinations.setForeground(Color.WHITE);
		destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
		destinations.setMargin(new Insets(0,0,0,125));
		destinations.addActionListener(this);
		p2.add(destinations);
	
	    payments = new JButton("Payments");
		payments.setBounds(0,440,300,40);
		payments.setBackground(new Color(0,0,102));
		payments.setForeground(Color.WHITE);
		payments.setFont(new Font("Tahoma",Font.PLAIN,20));
		payments.setMargin(new Insets(0,0,0,155));
		payments.addActionListener(this);
		p2.add(payments);
		
	    calculators = new JButton("Calculators");
		calculators.setBounds(0,480,300,40);
		calculators.setBackground(new Color(0,0,102));
		calculators.setForeground(Color.WHITE);
		calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
		calculators.setMargin(new Insets(0,0,0,145));
		calculators.addActionListener(this);
		p2.add(calculators);
	
	    notepad= new JButton("Notepad");
		notepad.setBounds(0,520,300,40);
		notepad.setBackground(new Color(0,0,102));
		notepad.setForeground(Color.WHITE);
	    notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
		notepad.setMargin(new Insets(0,0,0,155));
		notepad.addActionListener(this);
		p2.add(notepad);
		
		about = new JButton("About");
		about.setBounds(0,560,300,32);
		about.setBackground(new Color(0,0,102));
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Tahoma",Font.PLAIN,20));
		about.setMargin(new Insets(0,0,0,175));
		about.addActionListener(this);
		p2.add(about);
	
	
		 ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel_and_Tourism_Organisation_System/icons/home.jpg"));
	     Image i5 = i4.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
	     ImageIcon i6 = new ImageIcon(i5);
	     JLabel image = new JLabel(i6);
	     image.setBounds(0,0,1500, 800);
	     add(image);
	     
		
		
		JLabel text = new JLabel("Travel and Tourism Organisation System");
		text.setBounds(400,70,1200,70);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Raleway", Font.PLAIN,40));
		image.add(text);
		
	
		
	
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== addPersonalDetails) {
			new AddCustomers(username);
		}else if(ae.getSource()== viewPersonalDetails) {
			new ViewCustomer(username);
		}else  if(ae.getSource()== deletePersonalDetails) {
				
				try {
					new DeleteCustomer().setVisible(true);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
		}else if(ae.getSource()== updatePersonalDetails) {
			new UpdateCustomer(username);
		}else if(ae.getSource()==  checkPackages) {
			new CheckPackage();
		}else if(ae.getSource()== bookPackage) {
			new BookPackage(username);
		}else if(ae.getSource()== viewpackage) {
			new ViewPackage(username).setVisible(true);
		}else if(ae.getSource()== viewhotels){
			new CheckHotels().setVisible(true);
		}else if(ae.getSource()== destinations){
			new Destination().setVisible(true);
		}else if(ae.getSource()== bookhotel){
			new BookHotel(username).setVisible(true);
		}else if(ae.getSource()== viewBookedHotel){
			new ViewBookedHotel(username).setVisible(true);
		}else if(ae.getSource()== payments){
			new Payment();
		}else if(ae.getSource()== calculators){
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource()== notepad){
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource()== about) {
			new About();
		}
			
		}
	
	public static void main(String[] args) {
		
          new Dashboard(username); 
	}

}
