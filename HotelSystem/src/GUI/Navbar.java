package GUI;

import java.awt.*;
import javax.swing.*;
public class Navbar extends javax.swing.JPanel {
    
    
    public Navbar() {
        initComponents();
        getHomeBtn();
        getRoomBtn();
    }
    
    public void getHomeBtn(){
        ImageIcon setHomeIcon = new ImageIcon(new ImageIcon(getClass().getResource("../Images/home-icon.png")).getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH));
        this.homeIcon.setText("");
        this.homeIcon.setIcon(setHomeIcon);
    }
    
    public void getRoomBtn(){
        ImageIcon setBedIcon = new ImageIcon(new ImageIcon(getClass().getResource("../Images/bed-icon.jpg")).getImage().getScaledInstance(80, 40, Image.SCALE_SMOOTH));
        this.bedIcon.setText("");
        this.bedIcon.setIcon(setBedIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        room = new javax.swing.JPanel();
        bedIcon = new javax.swing.JLabel();
        roomLabel = new javax.swing.JLabel();
        jLogoutButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(76, 126, 171));

        home.setBackground(new java.awt.Color(216, 243, 255));
        home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setMaximumSize(new java.awt.Dimension(65, 157));
        home.setMinimumSize(new java.awt.Dimension(65, 157));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeMouseReleased(evt);
            }
        });

        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setText("Home Icon");

        homeLabel.setFont(new java.awt.Font("Angsana New", 1, 30)); // NOI18N
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("Home");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(homeIcon)
                .addGap(20, 20, 20)
                .addComponent(homeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        room.setBackground(new java.awt.Color(216, 243, 255));
        room.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        room.setMaximumSize(new java.awt.Dimension(65, 157));
        room.setMinimumSize(new java.awt.Dimension(65, 157));
        room.setPreferredSize(new java.awt.Dimension(65, 157));
        room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                roomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                roomMouseReleased(evt);
            }
        });

        bedIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bedIcon.setText("Bed Icon");

        roomLabel.setFont(new java.awt.Font("Angsana New", 1, 30)); // NOI18N
        roomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomLabel.setText("Room");

        javax.swing.GroupLayout roomLayout = new javax.swing.GroupLayout(room);
        room.setLayout(roomLayout);
        roomLayout.setHorizontalGroup(
            roomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bedIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roomLayout.setVerticalGroup(
            roomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(bedIcon)
                .addGap(20, 20, 20)
                .addComponent(roomLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLogoutButton.setBackground(new java.awt.Color(255, 204, 204));
        jLogoutButton.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLogoutButton.setForeground(new java.awt.Color(255, 51, 51));
        jLogoutButton.setText("Logout");
        jLogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLogoutButton)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLogoutButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        RunAdmin.logout();
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        RunAdmin.getHome();
    }//GEN-LAST:event_homeMouseClicked

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        this.home.setBackground(this.home.getBackground().darker());
    }//GEN-LAST:event_homeMousePressed

    private void homeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseReleased
        this.home.setBackground(this.home.getBackground().brighter());
    }//GEN-LAST:event_homeMouseReleased

    private void roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseClicked
        RunAdmin.getRoom();
    }//GEN-LAST:event_roomMouseClicked

    private void roomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMousePressed
        this.room.setBackground(this.room.getBackground().darker());
    }//GEN-LAST:event_roomMousePressed

    private void roomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseReleased
        this.room.setBackground(this.room.getBackground().brighter());
    }//GEN-LAST:event_roomMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bedIcon;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JPanel room;
    private javax.swing.JLabel roomLabel;
    // End of variables declaration//GEN-END:variables
}
