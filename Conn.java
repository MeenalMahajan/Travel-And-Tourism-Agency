package travel_and_Tourism_Organisation_System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");                             // register the drive class
            c =DriverManager.getConnection("jdbc:mysql:///tms","root","tanu@1875"); // creating connection string  
            
            s =c.createStatement();                                           //creating the statement
            
           
        }catch(Exception e){                                                  //execute queries
        	                                                                  // close connection
            System.out.println(e);
        }  
    }  
}