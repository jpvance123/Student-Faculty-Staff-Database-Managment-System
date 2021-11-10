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
public class GradeBook extends javax.swing.JFrame {

    /**
     * Creates new form FacultyDashboard
     */
    public GradeBook() {
        initComponents();
        UpdateDB();
    }
    
    public void UpdateDB(){
        int q, i;
        
        try{
             Connection myConn = MySQLConnection.getConnection();
             PreparedStatement pst = myConn.prepareStatement("SELECT * from students");
            
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData StData = rs.getMetaData();
            
            q = StData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                
                Vector columnData = new Vector();
                
                for (i = 1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("sid"));
                    columnData.add(rs.getString("sname"));
                    columnData.add(rs.getString("major"));
                    columnData.add(rs.getString("s_level"));
                    columnData.add(rs.getString("age"));
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
        jLabel2 = new javax.swing.JLabel();
        studentage_txt = new javax.swing.JTextField();
        studentid_txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        studentmajor_txt = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        gradeBookButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        facultyManagmentButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        studentlvl_txt1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        studentname_txt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Student Age");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 140, 40));

        studentage_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentage_txtActionPerformed(evt);
            }
        });
        jPanel4.add(studentage_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 150, 40));

        studentid_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentid_txt1ActionPerformed(evt);
            }
        });
        jPanel4.add(studentid_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 400, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Student Major");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 40));

        studentmajor_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentmajor_txtActionPerformed(evt);
            }
        });
        jPanel4.add(studentmajor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 400, 40));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        gradeBookButton.setText("GradeBook");
        gradeBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeBookButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("GradeBook For Student");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(gradeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(gradeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 280, 160));

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        facultyManagmentButton.setText("FACULTY MANAGMENT");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("FACULTY MANAGMENT");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(facultyManagmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(facultyManagmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 280, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Student Level");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 40));

        studentlvl_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentlvl_txt1ActionPerformed(evt);
            }
        });
        jPanel4.add(studentlvl_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 140, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Student Name");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 40));

        studentname_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentname_txt1ActionPerformed(evt);
            }
        });
        jPanel4.add(studentname_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 400, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Student ID");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 420));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 249, 234), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student ID", "Student Name", "Student Major", "Student Level", "Student Age"
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1440, 590));

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

    private void studentage_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentage_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentage_txtActionPerformed

    private void studentid_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentid_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentid_txt1ActionPerformed

    private void studentmajor_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentmajor_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentmajor_txtActionPerformed

    private void addnew_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnew_buttonActionPerformed
        // TODO add your handling code here:        
        Operations operations = new Operations();
    
        try{
            
            int userID = Integer.parseInt(studentid_txt1.getText());
            String userName = studentname_txt1.getText();
            String majorType = studentmajor_txt.getText();
            String studentLevel = studentlvl_txt1.getText();
            int ageOfStudent = Integer.parseInt(studentage_txt.getText());
            
            if(operations.addNewStudent(userID, userName, majorType, studentLevel, ageOfStudent, this)){
                 JOptionPane.showMessageDialog(this, "You've succesfully added a student");
                 UpdateDB();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please type corret information");
        }
    }//GEN-LAST:event_addnew_buttonActionPerformed

    private void studentlvl_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentlvl_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentlvl_txt1ActionPerformed

    private void studentname_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentname_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentname_txt1ActionPerformed

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
        
        studentid_txt1.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        studentname_txt1.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        studentmajor_txt.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        studentlvl_txt1.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        studentage_txt.setText(RecordTable.getValueAt(SelectedRows, 5).toString()); 
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        Operations operations = new Operations();
    
        try{
            int id = Integer.parseInt(RecordTable.getValueAt(SelectedRows,0).toString());
            
            int userID = Integer.parseInt(studentid_txt1.getText());
            String userName = studentname_txt1.getText();
            String majorType = studentmajor_txt.getText();
            String studentLevel = studentlvl_txt1.getText();
            int ageOfStudent = Integer.parseInt(studentage_txt.getText());
            
            if(operations.updateStudent(id, userID, userName, majorType, studentLevel, ageOfStudent, this)){
                 JOptionPane.showMessageDialog(this, "You've succesfully update the table!");
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
            int id = Integer.parseInt(RecordTable.getValueAt(SelectedRows,0).toString());
            int deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete item",
                    "Warning", JOptionPane.YES_NO_OPTION);
            
            if(deleteItem == JOptionPane.YES_OPTION){
            int userID = Integer.parseInt(studentid_txt1.getText());
            String userName = studentname_txt1.getText();
            String majorType = studentmajor_txt.getText();
            String studentLevel = studentlvl_txt1.getText();
            int ageOfStudent = Integer.parseInt(studentage_txt.getText());
            
            if(operations.deleteStudent(id, userID, userName, majorType, studentLevel, ageOfStudent, this)){
                 JOptionPane.showMessageDialog(this, "You've succesfully deleted the record from the table!");
                 UpdateDB();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please type corret information");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void gradeBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeBookButtonActionPerformed
        // TODO add your handling code here
        new GradeBook().setVisible(true);
    }//GEN-LAST:event_gradeBookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnew_button;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton facultyManagmentButton;
    private javax.swing.JButton gradeBookButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField studentage_txt;
    private javax.swing.JTextField studentid_txt1;
    private javax.swing.JTextField studentlvl_txt1;
    private javax.swing.JTextField studentmajor_txt;
    private javax.swing.JTextField studentname_txt1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}