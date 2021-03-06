/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.database.project;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JTable;

/**
 *
 * @author jpvan
 */
public class StaffFaculty extends javax.swing.JFrame {

    /**
     * Creates new form FacultyDashboard
     */
    public StaffFaculty() {
        initComponents();
        UpdateDB();
    }
    
    public void UpdateDB(){
        int q, i;
        
        try{
             Connection myConn = MySQLConnection.getConnection();
             PreparedStatement pst = myConn.prepareStatement("SELECT staff.*, department.dname\n"
                     + " FROM staff, department\n"
                     + "WHERE staff.deptid = department.did");
            
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData StData = rs.getMetaData();
            
            q = StData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                
                Vector columnData = new Vector();
                
                for (i = 1; i <= q; i++){
                    columnData.add(rs.getString("sid"));
                    columnData.add(rs.getString("sname"));
                    columnData.add(rs.getString("deptid"));
                    columnData.add(rs.getString("dname"));
                }    
                    RecordTable.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        staffID_Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        departmentID_Txt = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        facultyDBMS = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        choicesDBMS = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        staffName_Txt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        exit_button = new javax.swing.JButton();
        addnew_button = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 249, 234), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Staff ID");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, 40));

        staffID_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffID_TxtActionPerformed(evt);
            }
        });
        jPanel4.add(staffID_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 400, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Department ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 40));

        departmentID_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentID_TxtActionPerformed(evt);
            }
        });
        jPanel4.add(departmentID_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 400, 40));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Go Back to Faculty DBMS");

        facultyDBMS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        facultyDBMS.setText("Faculty DBMS");
        facultyDBMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyDBMSMouseClicked(evt);
            }
        });
        facultyDBMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyDBMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(facultyDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(facultyDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 280, 160));

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Go Back to DBMS selection");

        choicesDBMS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        choicesDBMS.setText("DBMS Selection");
        choicesDBMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choicesDBMSMouseClicked(evt);
            }
        });
        choicesDBMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choicesDBMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(choicesDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(choicesDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 280, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Staff Name");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 40));

        staffName_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffName_TxtActionPerformed(evt);
            }
        });
        jPanel4.add(staffName_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 400, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 420));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 249, 234), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Staff Name", "Department ID", "Department Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 400));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 780, 420));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 249, 234), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_button.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        exit_button.setText("Logout");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        jPanel6.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 210, 60));

        addnew_button.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addnew_button.setText("Add new");
        addnew_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnew_buttonActionPerformed(evt);
            }
        });
        jPanel6.add(addnew_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 60));

        printButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        jPanel6.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 210, 60));

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel6.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 210, 60));

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel6.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 210, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1410, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1440, 570));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setText("Staff Database Managment System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1440, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1436, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1440, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void staffID_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffID_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffID_TxtActionPerformed

    private void departmentID_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentID_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentID_TxtActionPerformed

    private void addnew_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnew_buttonActionPerformed
        // TODO add your handling code here:        
        Operations operations = new Operations();
    
        try{
            
            int staffID = Integer.parseInt(staffID_Txt.getText());
            String staffName = staffName_Txt.getText();
            int department = Integer.parseInt(departmentID_Txt.getText());

            
            if(operations.addNewStaff(staffID, staffName, department, this)){
                 JOptionPane.showMessageDialog(this, "You've succesfully added a staff member");
                 UpdateDB();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please type corret information");
        }
    }//GEN-LAST:event_addnew_buttonActionPerformed

    private void staffName_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffName_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffName_TxtActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:]
        MessageFormat header = new MessageFormat("Printing in Progress...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            
        }catch(java.awt.print.PrinterException e){
            System.err.format("No printer found", e.getMessage());
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        LoginScreen loginScreen = new LoginScreen();
        Logout.logOut(this, loginScreen);
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        staffID_Txt.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        staffName_Txt.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        departmentID_Txt.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); 
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        Operations operations = new Operations();
    
        try{
            
            int staffID = Integer.parseInt(staffID_Txt.getText());
            String staffName = staffName_Txt.getText();
            int department = Integer.parseInt(departmentID_Txt.getText());
            
            if(operations.updateStaff(staffID, staffName, department, this)){
                 JOptionPane.showMessageDialog(this, "You've succesfully update the staff table!");
                 UpdateDB();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please type corret information");
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        Operations operations = new Operations();
    
        try{
            int deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete item",
                    "Warning", JOptionPane.YES_NO_OPTION);
            
            if(deleteItem == JOptionPane.YES_OPTION){
            int staffID = Integer.parseInt(staffID_Txt.getText());
            String staffName = staffName_Txt.getText();
            int department = Integer.parseInt(departmentID_Txt.getText());
            
            if(operations.deleteStaff(staffID, staffName, department, this)){
                 JOptionPane.showMessageDialog(this, "You've succesfully deleted a staff member!");
                 UpdateDB();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please type corret information");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void choicesDBMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choicesDBMSMouseClicked

        
    }//GEN-LAST:event_choicesDBMSMouseClicked

    private void choicesDBMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choicesDBMSActionPerformed
        // TODO add your handling code here:
        dispose();
        new StaffChoices().setVisible(true);
    }//GEN-LAST:event_choicesDBMSActionPerformed

    private void facultyDBMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyDBMSMouseClicked
        // TODO add your handling code here:
        dispose();
        new StaffDashboard().setVisible(true);
    }//GEN-LAST:event_facultyDBMSMouseClicked

    private void facultyDBMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyDBMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyDBMSActionPerformed

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
            java.util.logging.Logger.getLogger(StaffFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffFaculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnew_button;
    private javax.swing.JButton choicesDBMS;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField departmentID_Txt;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton facultyDBMS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField staffID_Txt;
    private javax.swing.JTextField staffName_Txt;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
