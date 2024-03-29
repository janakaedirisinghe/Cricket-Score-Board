/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newcricketapp.UI;

import com.github.javafaker.Faker;
import com.mycompany.newcricketapp.Database;
import com.mycompany.newcricketapp.Data;
import com.mysql.jdbc.JDBC4ResultSet;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chuti
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        batLabel.setVisible(false);
        ballLabel.setVisible(false);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        summaryTA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        leftTA = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        rightTA = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        batLabel = new javax.swing.JLabel();
        ballLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        searchBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cricket Score Dashboard");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 0, 51));

        summaryTA.setEditable(false);
        summaryTA.setBackground(new java.awt.Color(204, 204, 204));
        summaryTA.setColumns(15);
        summaryTA.setFont(new java.awt.Font("Source Sans Pro", 0, 36)); // NOI18N
        summaryTA.setRows(5);
        summaryTA.setMinimumSize(new java.awt.Dimension(4, 30));
        jScrollPane1.setViewportView(summaryTA);

        leftTA.setColumns(20);
        leftTA.setRows(5);
        leftTA.setTabSize(15);
        jScrollPane3.setViewportView(leftTA);

        rightTA.setColumns(20);
        rightTA.setRows(5);
        rightTA.setTabSize(15);
        jScrollPane5.setViewportView(rightTA);

        title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CRICKET SCORE");

        batLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        batLabel.setText("Batting");
        batLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                batLabelComponentHidden(evt);
            }
        });

        ballLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ballLabel.setText("Balling");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 255), null, null));

        search.setToolTipText("search by match id");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Match Id");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "summary", "Inn 1", "Inn 2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        searchBtn.setText("serach");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 131, Short.MAX_VALUE)
                    .addComponent(search)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(batLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ballLabel)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batLabel)
                    .addComponent(ballLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
       
        
            String matchSearch = search.getText();
            int innSearch = jComboBox1.getSelectedIndex();
            
            Database database = new Database(matchSearch,innSearch);
            Object data1 = database.initial();
            
            if(data1.getClass()==Data.class){
                Data data = (Data) data1;
                leftTA.setText("");
                rightTA.setText("");
            title.setText(data.getCountryOne()+" vs "+data.getCountryTwo());
            String innOne = String.valueOf(data.getInnOne());
            String innTwo =String.valueOf(data.getInnTwo());
            String innOneWicket = String.valueOf(data.getInnOneWicket());
            String innTwoWicket = String.valueOf(data.getInnTwoWicket());
             summaryTA.setText(data.getCountryOne()+"\t"+innOne+"/"+innOneWicket+"\n");
             summaryTA.append(data.getCountryTwo()+"\t"+innTwo+"/"+innTwoWicket+"\n\n");
             summaryTA.append(data.getWon()+" won by "+String.valueOf(data.getWonBy())+" runs");
             
//                Faker faker = new Faker();
//                System.out.println(faker.name());
            }
            if(data1.getClass()==   JDBC4ResultSet.class){
                leftTA.setText("");
                rightTA.setText("");
                try {
                     ResultSet rs = (ResultSet) data1;
                     ballLabel.setVisible(true);
                     batLabel.setVisible(true);
                     
                     
                     while(rs.next()){
                         String playerType = rs.getString("playerType");
                         
                         //System.out.println(playerType);
                         
                         if ("bat".equals(playerType)) {
                             batLabel.setText("Batiing/"+rs.getString("teamName"));
                             leftTA.append(rs.getString("playerName")+"\t"+rs.getInt("score")+"\n");
                         } 
                         if("ball".equals(playerType)){
                             ballLabel.setText("Balling/"+rs.getString("teamName"));
                             rightTA.append(rs.getString("playerName")+"\t"+rs.getInt("score")+"\n");
                         }
                         //System.out.println(rs.getString("playerName")+"\t"+rs.getInt("score")+"\t"+rs.getString("playerType")+"\n");
                         //leftTA.append(rs.getString("playerName")+"\t\t"+rs.getInt("score")+"\n");
                         
                         
                         
                           
                     }
                     
                     
                } catch (Exception e) {
                }
            }
           
         
         
         
         
         
         
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void batLabelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_batLabelComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_batLabelComponentHidden

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
                
            }
        });
       
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ballLabel;
    private javax.swing.JLabel batLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea leftTA;
    private javax.swing.JTextArea rightTA;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextArea summaryTA;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
