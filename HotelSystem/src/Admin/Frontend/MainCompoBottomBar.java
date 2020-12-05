package Admin.Frontend;

import Admin.Backend.DatabaseHelper;

import java.awt.Image;
import javax.swing.ImageIcon;

public class MainCompoBottomBar extends javax.swing.JPanel {

    public MainCompoBottomBar() {
        initComponents();
        getClientBtn();
    }
    
    public void getClientBtn(){
        ImageIcon setClientIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Assets/user-icon.png")).getImage().getScaledInstance(35, 40, Image.SCALE_SMOOTH));
        this.clientIcon.setText("");
        this.clientIcon.setIcon(setClientIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFooterPanel = new javax.swing.JPanel();
        CurrentClientLabel1 = new javax.swing.JLabel();
        ClientNum = new javax.swing.JLabel();
        CurrentClientLabel2 = new javax.swing.JLabel();
        clientIcon = new javax.swing.JLabel();

        jFooterPanel.setBackground(new java.awt.Color(67, 106, 141));

        CurrentClientLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        CurrentClientLabel1.setForeground(new java.awt.Color(255, 255, 255));
        CurrentClientLabel1.setText("ขณะนี้มีผู้เข้าพัก");

        ClientNum.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        ClientNum.setForeground(new java.awt.Color(255, 255, 255));
        ClientNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientNum.setText(DatabaseHelper.getUserCount());
        ClientNum.setAlignmentY(0.0F);
        ClientNum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CurrentClientLabel2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        CurrentClientLabel2.setForeground(new java.awt.Color(255, 255, 255));
        CurrentClientLabel2.setText("คน");

        clientIcon.setForeground(new java.awt.Color(255, 255, 255));
        clientIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientIcon.setText("img");
        clientIcon.setMinimumSize(new java.awt.Dimension(25, 30));

        javax.swing.GroupLayout jFooterPanelLayout = new javax.swing.GroupLayout(jFooterPanel);
        jFooterPanel.setLayout(jFooterPanelLayout);
        jFooterPanelLayout.setHorizontalGroup(
            jFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFooterPanelLayout.createSequentialGroup()
                .addContainerGap(639, Short.MAX_VALUE)
                .addComponent(clientIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(CurrentClientLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClientNum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrentClientLabel2)
                .addGap(50, 50, 50))
        );
        jFooterPanelLayout.setVerticalGroup(
            jFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CurrentClientLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jFooterPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CurrentClientLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addGroup(jFooterPanelLayout.createSequentialGroup()
                        .addComponent(ClientNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void updateUserCount() {
        ClientNum.setText(DatabaseHelper.getUserCount());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClientNum;
    private javax.swing.JLabel CurrentClientLabel1;
    private javax.swing.JLabel CurrentClientLabel2;
    private javax.swing.JLabel clientIcon;
    private javax.swing.JPanel jFooterPanel;
    // End of variables declaration//GEN-END:variables
}
