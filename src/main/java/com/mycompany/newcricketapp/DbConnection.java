/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newcricketapp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chuti
 */
public class DbConnection {

    public static Connection connection() {
            String url="jdbc:mysql://localhost:3306/javatest";
            String user="root";
            String password="";
            Connection myCon = null;
            try {
             myCon = DriverManager.getConnection(url,user,password);
            
        } catch (Exception e) {
        }
        return myCon;
        
        
    }
       
}
