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
public class FacultyStaff extends javax.swing.JFrame {

    /**
     * Creates new form FacultyDashboard
     */
    public FacultyStaff() {
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
        jLabel16 = new javax.swing.JLabel();
        staffName_Txt = new javax.swing.JTextField();
        exitbutton = new javax.swing.JButton();
        go_back = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        exitbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitbutton.setText("Logout");
        exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbuttonMouseClicked(evt);
            }
        });
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 180, 60));

        go_back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        go_back.setText("Go Back");
        go_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_backMouseClicked(evt);
            }
        });
        go_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_backActionPerformed(evt);
            }
        });
        jPanel4.add(go_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 190, 60));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1440, 450));

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

    private void staffName_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffName_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffName_TxtActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        staffID_Txt.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        staffName_Txt.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        departmentID_Txt.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); 
    }//GEN-LAST:event_jTable1MouseClicked

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        LoginScreen loginScreen = new LoginScreen();
        Logout.logOut(this, loginScreen);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void exitbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMouseClicked

    }//GEN-LAST:event_exitbuttonMouseClicked

    private void go_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_backMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_go_backMouseClicked

    private void go_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new FacultyStudents().setVisible(true);
    }//GEN-LAST:event_go_backActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FacultyStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField departmentID_Txt;
    private javax.swing.JButton exitbutton;
    private javax.swing.JButton go_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField staffID_Txt;
    private javax.swing.JTextField staffName_Txt;
    // End of variables declaration//GEN-END:variables
}
