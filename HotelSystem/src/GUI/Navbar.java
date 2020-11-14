/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Asus
 */
public class Navbar extends javax.swing.JPanel {

    /**
     * Creates new form BorderGUI
     */
    public Navbar() {
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

        jTabPanel = new javax.swing.JPanel();
        jHomeButton = new javax.swing.JButton();
        jRoomButton = new javax.swing.JButton();
        jFoodButton = new javax.swing.JButton();
        jLogoutButton = new javax.swing.JButton();

        jTabPanel.setBackground(new java.awt.Color(76, 126, 171));
        jTabPanel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jHomeButton.setBackground(new java.awt.Color(216, 243, 255));
        jHomeButton.setFont(new java.awt.Font("Angsana New", 1, 30)); // NOI18N
        jHomeButton.setText("Home");
        jHomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeButtonActionPerformed(evt);
            }
        });

        jRoomButton.setBackground(new java.awt.Color(216, 243, 255));
        jRoomButton.setFont(new java.awt.Font("Angsana New", 1, 30)); // NOI18N
        jRoomButton.setText("Room");
        jRoomButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoomButtonActionPerformed(evt);
            }
        });

        jFoodButton.setBackground(new java.awt.Color(216, 243, 255));
        jFoodButton.setFont(new java.awt.Font("Angsana New", 1, 30)); // NOI18N
        jFoodButton.setText("Food");
        jFoodButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFoodButtonActionPerformed(evt);
            }
        });

        jLogoutButton.setBackground(new java.awt.Color(255, 153, 153));
        jLogoutButton.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLogoutButton.setForeground(new java.awt.Color(255, 51, 51));
        jLogoutButton.setText("Logout");
        jLogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTabPanelLayout = new javax.swing.GroupLayout(jTabPanel);
        jTabPanel.setLayout(jTabPanelLayout);
        jTabPanelLayout.setHorizontalGroup(
            jTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jHomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFoodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jTabPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jTabPanelLayout.setVerticalGroup(
            jTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jHomeButton)
                .addGap(30, 30, 30)
                .addComponent(jRoomButton)
                .addGap(30, 30, 30)
                .addComponent(jFoodButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(jLogoutButton)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButtonActionPerformed
        RunAdmin.getHome();
    }//GEN-LAST:event_jHomeButtonActionPerformed

    private void jRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRoomButtonActionPerformed
        RunAdmin.getRoom();
    }//GEN-LAST:event_jRoomButtonActionPerformed

    private void jFoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFoodButtonActionPerformed

    }//GEN-LAST:event_jFoodButtonActionPerformed

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        RunAdmin.logout();
    }//GEN-LAST:event_jLogoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jFoodButton;
    private javax.swing.JButton jHomeButton;
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JButton jRoomButton;
    private javax.swing.JPanel jTabPanel;
    // End of variables declaration//GEN-END:variables
}
