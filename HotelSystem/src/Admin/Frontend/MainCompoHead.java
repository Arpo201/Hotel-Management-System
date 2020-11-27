/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Frontend;

import java.awt.Image;
import java.text.MessageFormat;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class MainCompoHead extends javax.swing.JPanel {

    /**
     * Creates new form Head
     */
    public MainCompoHead() {
        initComponents();
        getLogo();
    }
    
    public void getLogo(){
        ImageIcon setHomeIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Assets/hotel.png")).getImage().getScaledInstance(80, 50, Image.SCALE_SMOOTH));
        this.logoIcon.setText("");
        this.logoIcon.setIcon(setHomeIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHeadPanel3 = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        logoIcon = new javax.swing.JLabel();

        jHeadPanel3.setBackground(new java.awt.Color(67, 106, 141));
        jHeadPanel3.setForeground(new java.awt.Color(85, 122, 149));
        jHeadPanel3.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N

        NameLabel.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Admin: -");

        logoIcon.setForeground(new java.awt.Color(255, 255, 255));
        logoIcon.setText("Logo");
        logoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jHeadPanel3Layout = new javax.swing.GroupLayout(jHeadPanel3);
        jHeadPanel3.setLayout(jHeadPanel3Layout);
        jHeadPanel3Layout.setHorizontalGroup(
            jHeadPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHeadPanel3Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(logoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jHeadPanel3Layout.setVerticalGroup(
            jHeadPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHeadPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHeadPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoIconMouseClicked
        new RegisterForm().setVisible(true);
    }//GEN-LAST:event_logoIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel jHeadPanel3;
    private javax.swing.JLabel logoIcon;

    public void setName(String name) {
        NameLabel.setText(MessageFormat.format("Admin: {0}", name));
    }
// End of variables declaration//GEN-END:variables
}
