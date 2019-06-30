/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newcricketapp;
import com.mycompany.newcricketapp.UI.MainFrame;
import java.awt.Component;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
;

/**
 *
 * @author chuti
 */
public class Database {
    public static int search ;
    public static int inn;

    public Database(String search,int inn) {
        this.search =Integer.valueOf(search);
        this.inn = inn;
        
    }
    
    
    public Object initial() {
        
         Data data = new Data();
         
        
       // System.out.println(inn+search);
         //comment
        
         List<Data> array = new ArrayList<>();
         MainFrame mainFrame = new MainFrame();
         Object dataSummary = null;
         
         switch(inn){
             case 0:
                dataSummary  = summary(Integer.valueOf(search),data);
                 break;
             case 1:
                 dataSummary = innOne(Integer.valueOf(search),inn,data);
                 break;
             case 2:
                 dataSummary = innTwo(Integer.valueOf(search),inn,data);
                 break;
             default:
                 break;
         }
         
          return dataSummary;
    }

    private Data summary(int search,Data data) {
  
        
         String countryOne= "";
        String countryTwo = "";
        
        String won = "";
        int innOne;
        int innTwo;
        int innOneWicket;
        int innTwoWicket;
        
                

        try{
            
            Connection myCon = DbConnection.connection(); 
            Statement myStmt = myCon.createStatement();
            String sql = "select * from summary where id="+search;
            ResultSet rs = myStmt.executeQuery(sql);
           
             
                    if (!rs.isBeforeFirst() ) {    
                         JOptionPane.showMessageDialog(null, "Invalid Match Id");
                    } 
            
               //countryOne = rs.getString("countryOne") ;
               //countryTwo =rs.getString("countryTwo");
               //won = rs.getString("won");
             
               while(rs.next()){
                     data.setCountryOne(rs.getString("countryOne"));
                     data.setCountryTwo(rs.getString("countryTwo"));
               }
               
              
               
               



            String sql2 = "select * from score where id="+search;
            ResultSet rs2 = myStmt.executeQuery(sql2);
            while(rs2.next()){
                     data.setInnOne(rs2.getInt("innOne"));
                     data.setInnTwo(rs2.getInt("innTwo"));
                     data.setInnOneWicket(rs2.getInt("innOneWicket"));
                     data.setInnTwoWicket(rs2.getInt("innTwoWicket"));
               }
                //innOne = rs2.getInt("innOne");
                //innTwo = rs2.getInt("innTwo");
//                innOneWicket = rs2.getInt("innOneWicket");
//                innTwoWicket = rs2.getInt("innTwoWicket");



                if (data.getInnOne() > data.getInnTwo()){
                    won = data.getCountryOne();
               }else {
                    won = data.getCountryTwo();
                }
                
                data.setWon(won);
                    
                 
              int wonBy = Math.abs(data.getInnOne()-data.getInnTwo());
              data.setWonBy(wonBy);
              

//            System.out.println("****************");
//            System.out.println(countryOne.toUpperCase() + " vs " + countryTwo.toUpperCase());
//            System.out.println("****************");
//            System.out.println();
//            //System.out.println(countryOne.toUpperCase() +"\t"+ innOne + "/" + innOneWicket );
//            System.out.println(countryTwo.toUpperCase() +"\t"+ innTwo + "/" + innTwoWicket );
//
//            System.out.println(won.toUpperCase()+" won by "+wonBy +" runs.");
//                
                
                




        }catch (SQLException e){
            e.printStackTrace();
        }
        
       return data;
    }

    private ResultSet innOne(int search,int inn, Data data) {
        
        ResultSet rs = null;
            
        try {
            Connection myCon = DbConnection.connection(); 
            
            Statement myStmt = myCon.createStatement();
            String sql = "select * from matchscore,player,team where matchscore.matchId ="+search+" AND matchscore.innId=1 AND matchscore.playerId = player.playerId AND player.teamId = team.teamId";
            rs = myStmt.executeQuery(sql);
//            while(rs.next()){
//                //System.out.println(rs.getString("playerName")+"\t"+rs.getString("teamName")+"\t"+rs.getInt("score")+"\t"+rs.getString("playerType"));
//                
//            }
            
            
        } catch (Exception e) {
        }
        
        return rs;
    }

    private Object innTwo(Integer valueOf, int inn, Data data) {
        ResultSet rs = null;
            
        try {
            Connection myCon = DbConnection.connection(); 
            
            Statement myStmt = myCon.createStatement();
            String sql = "select * from matchscore,player,team where matchscore.matchId ="+search+" AND matchscore.innId=2 AND matchscore.playerId = player.playerId AND player.teamId = team.teamId";
            rs = myStmt.executeQuery(sql);
//            while(rs.next()){
//                //System.out.println(rs.getString("playerName")+"\t"+rs.getString("teamName")+"\t"+rs.getInt("score")+"\t"+rs.getString("playerType"));
//                
//            }
            
            
        } catch (Exception e) {
        }
        
        return rs;
    }

   
        
    }
    

//select * from matchscore,player,team where matchscore.matchId = 4 AND matchscore.innId=1 AND matchscore.playerId = player.playerId AND player.teamId = team.teamId;