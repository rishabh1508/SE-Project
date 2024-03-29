/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.UserList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class CreateUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateUserPanel
     */
    UserList ul;
    public CreateUserPanel(UserList ul) {
        initComponents();
        this.ul = ul;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enabledtxt = new javax.swing.JComboBox<>();
        passwordtxt = new javax.swing.JTextField();
        enabledlb = new javax.swing.JLabel();
        emaillb = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        neuidlb = new javax.swing.JLabel();
        firstnamelb = new javax.swing.JLabel();
        neuidtxt = new javax.swing.JTextField();
        lastnametxt = new javax.swing.JTextField();
        firstnametxt = new javax.swing.JTextField();
        usernamelb = new javax.swing.JLabel();
        lastnamelb = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        createbtn = new javax.swing.JButton();
        passwordlb = new javax.swing.JLabel();

        enabledtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enabledtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        enabledlb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enabledlb.setText("Enabled:");

        emaillb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emaillb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emaillb.setText("Email ID:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create");

        neuidlb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        neuidlb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        neuidlb.setText("NEUID:");

        firstnamelb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstnamelb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstnamelb.setText("First Name:");

        usernamelb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernamelb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernamelb.setText("User Name:");

        lastnamelb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastnamelb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lastnamelb.setText("Last Name:");

        createbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        passwordlb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordlb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordlb.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emaillb)
                            .addComponent(passwordlb)
                            .addComponent(usernamelb)
                            .addComponent(enabledlb))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enabledtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnamelb)
                            .addComponent(neuidlb)
                            .addComponent(lastnamelb))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neuidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailtxt, enabledtxt, firstnametxt, lastnametxt, neuidtxt, passwordtxt, usernametxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuidlb)
                    .addComponent(neuidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnamelb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnamelb))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelb)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlb)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emaillb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enabledtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enabledlb))
                .addGap(28, 28, 28)
                .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailtxt, enabledtxt, firstnametxt, lastnametxt, neuidtxt, passwordtxt, usernametxt});

    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        boolean isEnabled = "Yes".equals(enabledtxt.getSelectedItem().toString());
        String passwordHashed = UserList.HashPassword(passwordtxt.getText());
        var a = ul.addNewUser();
        a.setNeuid(neuidtxt.getText());
        a.setFirstName(firstnametxt.getText());
        a.setLastName(lastnametxt.getText());
        a.setUserName(usernametxt.getText());
        a.setPassword(passwordHashed);
        a.setEmailID(emailtxt.getText());
        a.setIsEnabled(isEnabled);
        a.setPreviousPass(new ArrayList<>());
        
        JOptionPane.showMessageDialog(this, "User Created Successfully");
    }//GEN-LAST:event_createbtnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel emaillb;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel enabledlb;
    private javax.swing.JComboBox<String> enabledtxt;
    private javax.swing.JLabel firstnamelb;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastnamelb;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JLabel neuidlb;
    private javax.swing.JTextField neuidtxt;
    private javax.swing.JLabel passwordlb;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JLabel usernamelb;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
