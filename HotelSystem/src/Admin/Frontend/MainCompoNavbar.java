package Admin.Frontend;

import java.awt.*;
import javax.swing.*;
public class MainCompoNavbar extends javax.swing.JPanel {
    
    
    public MainCompoNavbar() {
        initComponents();
        getHomeBtn();
        getRoomBtn();
        getLogoutBtn();
    }
    
    public void getHomeBtn(){
        ImageIcon setHomeIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Assets/home-icon.png")).getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH));
        this.homeIcon.setText("");
        this.homeIcon.setIcon(setHomeIcon);
    }
    
    public void getRoomBtn(){
        ImageIcon setBedIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Assets/bed-icon.jpg")).getImage().getScaledInstance(80, 40, Image.SCALE_SMOOTH));
        this.bedIcon.setText("");
        this.bedIcon.setIcon(setBedIcon);
    }
    
    public void getLogoutBtn(){
        ImageIcon setLogoutIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Assets/logout-icon.jpg")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.logoutIcon.setText("");
        this.logoutIcon.setIcon(setLogoutIcon);
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
        logout = new javax.swing.JPanel();
        logoutIcon = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();

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
        homeLabel.setForeground(new java.awt.Color(37, 80, 127));
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
        roomLabel.setForeground(new java.awt.Color(37, 80, 127));
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

        logout.setBackground(new java.awt.Color(255, 204, 204));
        logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setMaximumSize(new java.awt.Dimension(65, 157));
        logout.setMinimumSize(new java.awt.Dimension(65, 157));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutMouseReleased(evt);
            }
        });

        logoutIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutIcon.setText("logout Icon");

        logoutLabel.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 51, 51));
        logoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutLabel.setText("Logout");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoutIcon)
                .addGap(5, 5, 5)
                .addComponent(logoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        RunAdmin.logout();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        this.logout.setBackground(this.logout.getBackground().darker());
    }//GEN-LAST:event_logoutMousePressed

    private void logoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseReleased
        this.logout.setBackground(this.logout.getBackground().brighter());
    }//GEN-LAST:event_logoutMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bedIcon;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel room;
    private javax.swing.JLabel roomLabel;
    // End of variables declaration//GEN-END:variables
}
