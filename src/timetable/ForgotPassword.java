/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javafx.scene.input.KeyCode.F;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ForgotPassword extends javax.swing.JDialog {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        clearWarnings();
        addUserGroup();
    }
    ButtonGroup userGroup = new ButtonGroup();

    public void addUserGroup() {
        radioStudent.setSelected(true);
        userGroup.add(radioStudent);
        userGroup.add(radioAdmin);
        userGroup.add(radioProfessor);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        radioAdmin = new javax.swing.JRadioButton();
        radioStudent = new javax.swing.JRadioButton();
        radioProfessor = new javax.swing.JRadioButton();
        usernamelbl = new javax.swing.JLabel();
        cpasswordlbl = new javax.swing.JLabel();
        uplbl = new javax.swing.JLabel();
        loginlbl = new javax.swing.JLabel();
        securityKeytxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        cPassword = new javax.swing.JPasswordField();
        securityKeylbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(108, 184, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User Accounts.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 250));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Members Login Panel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 520);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RECOVER PASSWORD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 30, 350, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 330, 140, 23);

        username.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(330, 130, 260, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 110, 110, 23);

        jButton1.setBackground(new java.awt.Color(108, 184, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RECOVER");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 470, 160, 40);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 0, 29, 30);

        radioAdmin.setBackground(new java.awt.Color(108, 184, 204));
        radioAdmin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        radioAdmin.setText("ADMIN");
        jPanel1.add(radioAdmin);
        radioAdmin.setBounds(540, 410, 80, 25);

        radioStudent.setBackground(new java.awt.Color(108, 184, 204));
        radioStudent.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        radioStudent.setText("STUDENT");
        radioStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStudentActionPerformed(evt);
            }
        });
        jPanel1.add(radioStudent);
        radioStudent.setBounds(330, 410, 93, 25);

        radioProfessor.setBackground(new java.awt.Color(108, 184, 204));
        radioProfessor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        radioProfessor.setText("PROFFESOR");
        jPanel1.add(radioProfessor);
        radioProfessor.setBounds(440, 410, 90, 25);

        usernamelbl.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(255, 0, 51));
        usernamelbl.setText("Username should be of length six");
        jPanel1.add(usernamelbl);
        usernamelbl.setBounds(610, 130, 250, 40);

        cpasswordlbl.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        cpasswordlbl.setForeground(new java.awt.Color(255, 0, 51));
        cpasswordlbl.setText("kjjfhshashasj");
        jPanel1.add(cpasswordlbl);
        cpasswordlbl.setBounds(610, 350, 250, 40);

        uplbl.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        uplbl.setForeground(new java.awt.Color(255, 0, 51));
        uplbl.setText("*Invaild username or security key");
        jPanel1.add(uplbl);
        uplbl.setBounds(330, 76, 250, 30);

        loginlbl.setForeground(new java.awt.Color(0, 153, 255));
        loginlbl.setText("Login??");
        loginlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginlblMouseExited(evt);
            }
        });
        jPanel1.add(loginlbl);
        loginlbl.setBounds(330, 440, 120, 14);
        jPanel1.add(securityKeytxt);
        securityKeytxt.setBounds(330, 210, 260, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Security Key");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 180, 110, 23);
        jPanel1.add(password);
        password.setBounds(330, 290, 260, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 260, 110, 23);
        jPanel1.add(cPassword);
        cPassword.setBounds(330, 360, 260, 30);

        securityKeylbl.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        securityKeylbl.setForeground(new java.awt.Color(255, 0, 51));
        securityKeylbl.setText("kjjfhshashasj");
        jPanel1.add(securityKeylbl);
        securityKeylbl.setBounds(610, 210, 250, 40);

        passwordlbl.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(255, 0, 51));
        passwordlbl.setText("kjjfhshashasj");
        jPanel1.add(passwordlbl);
        passwordlbl.setBounds(610, 290, 250, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    public boolean isValidAdmin() {
        boolean valid = true;
        String a = "";
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "select securityKey from admin where username=?;";
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, username.getText());

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
            }
            if (!a.equals(securityKeytxt.getText())) {

                uplbl.setVisible(true);
                valid = false;
            }
        } catch (SQLException ex) {
            System.out.println("unable  to connect database");
        }
        dc.closeDBConnection();
        return valid;
    }

    public void clearWarnings() {
        usernamelbl.setVisible(false);
        cpasswordlbl.setVisible(false);
        uplbl.setVisible(false);
        securityKeylbl.setVisible(false);
        passwordlbl.setVisible(false);

    }

    public boolean isValidInput() {
        clearWarnings();
        boolean result = true;
        if (username.getText().isEmpty()) {
            usernamelbl.setText("*Enter username");
            usernamelbl.setVisible(true);
            result = false;
        } else if (username.getText().length() < 5) {
            usernamelbl.setText("Enter username of length five!");
            usernamelbl.setVisible(true);
            result = false;
        }
        if (securityKeytxt.getText().isEmpty()) {
            securityKeylbl.setText("*Enter Security key");
            securityKeylbl.setVisible(true);
            result = false;
        }
        if (password.getText().isEmpty()) {
            passwordlbl.setText("*Enter password");
            passwordlbl.setVisible(true);
            result = false;
        }
        if (!cPassword.getText().equals(password.getText())) {
            cpasswordlbl.setText("*password dobot match");
            cpasswordlbl.setVisible(true);
            result = false;
        }

        return result;
    }

    public void clearForm() {
        clearWarnings();
        username.setText("");
        securityKeytxt.setText("");
        password.setText("");
        cPassword.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isValidInput()) {
            if (radioAdmin.isSelected() && isValidAdmin()) {
                DB_Connect dc = new DB_Connect();
                dc.connectDatabase();
                String SQL = "update admin set password=? where username=?";
                try {
                    PreparedStatement ps = dc.conn.prepareStatement(SQL);
                    ps.setString(1, password.getText());
                    ps.setString(2, username.getText());

                    int rs = ps.executeUpdate();
                    if (rs == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Password updated");
                        clearForm();
                        this.dispose();

                    }
                } catch (SQLException ex) {
                    System.out.println("unable  to connect database");
                }
                dc.closeDBConnection();
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioStudentActionPerformed

    private void loginlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginlblMouseClicked
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_loginlblMouseClicked

    private void loginlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginlblMouseEntered
        loginlbl.setForeground(new Color(178, 67, 14));// TODO add your handling code here:
    }//GEN-LAST:event_loginlblMouseEntered

    private void loginlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginlblMouseExited
        loginlbl.setForeground(new Color(0, 153, 255));
        // TODO add your handling code here:
    }//GEN-LAST:event_loginlblMouseExited

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ForgotPassword dialog = new ForgotPassword(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JLabel cpasswordlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioProfessor;
    private javax.swing.JRadioButton radioStudent;
    private javax.swing.JLabel securityKeylbl;
    private javax.swing.JTextField securityKeytxt;
    private javax.swing.JLabel uplbl;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
}
