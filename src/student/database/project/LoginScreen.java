/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.database.project;

import javax.swing.JOptionPane;

/**
 *
 * @author SIU856414916
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        titlejPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bodyJPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        type_comboBox = new javax.swing.JComboBox<>();
        useridtxt = new javax.swing.JTextField();
        footerJPanel = new javax.swing.JPanel();
        login_jButton = new javax.swing.JButton();
        exit_jButton = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlejPanel.setBackground(new java.awt.Color(0, 102, 127));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Welcome to my First Database Project<br> Please login for access to Database!</html>");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/database/project/images/db_1.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/database/project/images/lock.png"))); // NOI18N

        javax.swing.GroupLayout titlejPanelLayout = new javax.swing.GroupLayout(titlejPanel);
        titlejPanel.setLayout(titlejPanelLayout);
        titlejPanelLayout.setHorizontalGroup(
            titlejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlejPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlejPanelLayout.setVerticalGroup(
            titlejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bodyJPanel.setBackground(new java.awt.Color(0, 153, 191));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Identify yourself as a:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Enter your Verificaiton-ID:");

        type_comboBox.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        type_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Faculty", "Staff" }));
        type_comboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout bodyJPanelLayout = new javax.swing.GroupLayout(bodyJPanel);
        bodyJPanel.setLayout(bodyJPanelLayout);
        bodyJPanelLayout.setHorizontalGroup(
            bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(type_comboBox, 0, 403, Short.MAX_VALUE)
                    .addComponent(useridtxt))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyJPanelLayout.setVerticalGroup(
            bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyJPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(useridtxt))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        footerJPanel.setBackground(new java.awt.Color(0, 102, 127));

        login_jButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        login_jButton.setText("Login");
        login_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_jButtonActionPerformed(evt);
            }
        });

        exit_jButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exit_jButton.setText("Exit");
        exit_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerJPanelLayout = new javax.swing.GroupLayout(footerJPanel);
        footerJPanel.setLayout(footerJPanelLayout);
        footerJPanelLayout.setHorizontalGroup(
            footerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerJPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        footerJPanelLayout.setVerticalGroup(
            footerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerJPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(footerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footerJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bodyJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(footerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_jButtonActionPerformed
        // TODO add your handling code here:
        Operations operations = new Operations();
        
        try{
            int userID = Integer.parseInt(useridtxt.getText());
            String usertype = type_comboBox.getSelectedItem().toString();
            
            if(usertype.equals("Student") && operations.studentLogin(userID, usertype, this)){
                dispose();
                new StudentChoices().setVisible(true);
            }else if(usertype.equals("Faculty") && operations.facultyLogin(userID, usertype, this)){
                dispose();
                new FacultyStudents().setVisible(true);
            }else if(usertype.equals("Staff") && operations.staffLogin(userID, usertype, this)){
                dispose();
                new StaffChoices().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Please type correct information");
            }    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please type corret information");
        }
    }//GEN-LAST:event_login_jButtonActionPerformed

    private void exit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_jButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exit_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyJPanel;
    private javax.swing.JButton exit_jButton;
    private javax.swing.JPanel footerJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton login_jButton;
    private javax.swing.JPanel titlejPanel;
    private javax.swing.JComboBox<String> type_comboBox;
    private javax.swing.JTextField useridtxt;
    // End of variables declaration//GEN-END:variables
}
