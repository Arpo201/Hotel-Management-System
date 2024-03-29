package Admin.Frontend;

import Admin.Backend.DatabaseHelper;

import javax.swing.*;

public class MainpageHome extends javax.swing.JPanel {
    
    
    public MainpageHome() {
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

        jPageHeadPanel = new javax.swing.JPanel();
        jPageLabel = new javax.swing.JLabel();
        jBodyPanel = new javax.swing.JPanel();
        jVacantLabel = new javax.swing.JLabel();
        allAvailableRoomCount = new javax.swing.JLabel();
        jfloor1Panel = new javax.swing.JPanel();
        floor1Label = new javax.swing.JLabel();
        availableRoom1 = new javax.swing.JLabel();
        floor1AvailableCount = new javax.swing.JLabel();
        jfloor2Panel = new javax.swing.JPanel();
        floor2Label = new javax.swing.JLabel();
        availableRoom2 = new javax.swing.JLabel();
        floor2AvailableCount = new javax.swing.JLabel();
        jfloor3Panel = new javax.swing.JPanel();
        floor3Label = new javax.swing.JLabel();
        availableRoom3 = new javax.swing.JLabel();
        floor3AvailableCount = new javax.swing.JLabel();
        clientData = new javax.swing.JPanel();
        clientDataLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(234, 242, 249));

        jPageHeadPanel.setBackground(new java.awt.Color(146, 177, 204));

        jPageLabel.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jPageLabel.setForeground(new java.awt.Color(30, 91, 145));
        jPageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPageLabel.setText("Home");

        javax.swing.GroupLayout jPageHeadPanelLayout = new javax.swing.GroupLayout(jPageHeadPanel);
        jPageHeadPanel.setLayout(jPageHeadPanelLayout);
        jPageHeadPanelLayout.setHorizontalGroup(
            jPageHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPageHeadPanelLayout.setVerticalGroup(
            jPageHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jBodyPanel.setBackground(new java.awt.Color(227, 234, 240));

        jVacantLabel.setFont(new java.awt.Font("Angsana New", 1, 60)); // NOI18N
        jVacantLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVacantLabel.setText("ขณะนี้มีห้องว่าง");

        allAvailableRoomCount.setBackground(new java.awt.Color(255, 255, 255));
        allAvailableRoomCount.setFont(new java.awt.Font("Angsana New", 1, 100)); // NOI18N
        allAvailableRoomCount.setForeground(new java.awt.Color(120, 208, 31));
        allAvailableRoomCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allAvailableRoomCount.setText("15");

        jfloor1Panel.setBackground(new java.awt.Color(255, 255, 255));
        jfloor1Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jfloor1Panel.setMinimumSize(new java.awt.Dimension(300, 200));

        floor1Label.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        floor1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        floor1Label.setText("ชั้น 1");

        availableRoom1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        availableRoom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        availableRoom1.setText("ขณะนี้ว่าง");

        floor1AvailableCount.setFont(new java.awt.Font("Angsana New", 1, 60)); // NOI18N
        floor1AvailableCount.setForeground(new java.awt.Color(120, 208, 31));
        floor1AvailableCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        floor1AvailableCount.setText("5");

        javax.swing.GroupLayout jfloor1PanelLayout = new javax.swing.GroupLayout(jfloor1Panel);
        jfloor1Panel.setLayout(jfloor1PanelLayout);
        jfloor1PanelLayout.setHorizontalGroup(
            jfloor1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(floor1AvailableCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(floor1Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(availableRoom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jfloor1PanelLayout.setVerticalGroup(
            jfloor1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfloor1PanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(floor1Label)
                .addGap(20, 20, 20)
                .addComponent(availableRoom1)
                .addGap(5, 5, 5)
                .addComponent(floor1AvailableCount)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jfloor2Panel.setBackground(new java.awt.Color(255, 255, 255));
        jfloor2Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jfloor2Panel.setMinimumSize(new java.awt.Dimension(300, 200));

        floor2Label.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        floor2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        floor2Label.setText("ชั้น 2");

        availableRoom2.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        availableRoom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        availableRoom2.setText("ขณะนี้ว่าง");

        floor2AvailableCount.setFont(new java.awt.Font("Angsana New", 1, 60)); // NOI18N
        floor2AvailableCount.setForeground(new java.awt.Color(120, 208, 31));
        floor2AvailableCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        floor2AvailableCount.setText("5");

        javax.swing.GroupLayout jfloor2PanelLayout = new javax.swing.GroupLayout(jfloor2Panel);
        jfloor2Panel.setLayout(jfloor2PanelLayout);
        jfloor2PanelLayout.setHorizontalGroup(
            jfloor2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(floor2AvailableCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(floor2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(availableRoom2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jfloor2PanelLayout.setVerticalGroup(
            jfloor2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfloor2PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(floor2Label)
                .addGap(20, 20, 20)
                .addComponent(availableRoom2)
                .addGap(5, 5, 5)
                .addComponent(floor2AvailableCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jfloor3Panel.setBackground(new java.awt.Color(255, 255, 255));
        jfloor3Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jfloor3Panel.setMinimumSize(new java.awt.Dimension(300, 200));

        floor3Label.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        floor3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        floor3Label.setText("ชั้น 3");

        availableRoom3.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        availableRoom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        availableRoom3.setText("ขณะนี้ว่าง");

        floor3AvailableCount.setFont(new java.awt.Font("Angsana New", 1, 60)); // NOI18N
        floor3AvailableCount.setForeground(new java.awt.Color(120, 208, 31));
        floor3AvailableCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        floor3AvailableCount.setText("5");

        javax.swing.GroupLayout jfloor3PanelLayout = new javax.swing.GroupLayout(jfloor3Panel);
        jfloor3Panel.setLayout(jfloor3PanelLayout);
        jfloor3PanelLayout.setHorizontalGroup(
            jfloor3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(floor3AvailableCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(floor3Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(availableRoom3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jfloor3PanelLayout.setVerticalGroup(
            jfloor3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfloor3PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(floor3Label)
                .addGap(20, 20, 20)
                .addComponent(availableRoom3)
                .addGap(5, 5, 5)
                .addComponent(floor3AvailableCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clientData.setBackground(new java.awt.Color(206, 237, 255));
        clientData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clientData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientDataMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientDataMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clientDataMouseReleased(evt);
            }
        });

        clientDataLabel.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        clientDataLabel.setForeground(new java.awt.Color(37, 80, 127));
        clientDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientDataLabel.setText("รายชื่อลูกค้า");
        clientDataLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientDataLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout clientDataLayout = new javax.swing.GroupLayout(clientData);
        clientData.setLayout(clientDataLayout);
        clientDataLayout.setHorizontalGroup(
            clientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientDataLayout.setVerticalGroup(
            clientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jBodyPanelLayout = new javax.swing.GroupLayout(jBodyPanel);
        jBodyPanel.setLayout(jBodyPanelLayout);
        jBodyPanelLayout.setHorizontalGroup(
            jBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jVacantLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(allAvailableRoomCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jfloor1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clientData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jfloor2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jfloor3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBodyPanelLayout.setVerticalGroup(
            jBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVacantLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allAvailableRoomCount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfloor1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jfloor3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jfloor2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(clientData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPageHeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPageHeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clientDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientDataMouseClicked
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new ClientData().setVisible(true);
    }//GEN-LAST:event_clientDataMouseClicked

    private void clientDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientDataMousePressed
        this.clientData.setBackground(this.clientData.getBackground().darker());
    }//GEN-LAST:event_clientDataMousePressed

    private void clientDataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientDataMouseReleased
        this.clientData.setBackground(this.clientData.getBackground().brighter());
    }//GEN-LAST:event_clientDataMouseReleased

    public void updateData() {
        allAvailableRoomCount.setText(DatabaseHelper.getAllAvailableRoomCount());
        floor1AvailableCount.setText(DatabaseHelper.getAvailableRoomCount(1));
        floor2AvailableCount.setText(DatabaseHelper.getAvailableRoomCount(2));
        floor3AvailableCount.setText(DatabaseHelper.getAvailableRoomCount(3));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allAvailableRoomCount;
    private javax.swing.JLabel availableRoom1;
    private javax.swing.JLabel availableRoom2;
    private javax.swing.JLabel availableRoom3;
    private javax.swing.JPanel clientData;
    private javax.swing.JLabel clientDataLabel;
    private javax.swing.JLabel floor1AvailableCount;
    private javax.swing.JLabel floor1Label;
    private javax.swing.JLabel floor2AvailableCount;
    private javax.swing.JLabel floor2Label;
    private javax.swing.JLabel floor3AvailableCount;
    private javax.swing.JLabel floor3Label;
    private javax.swing.JPanel jBodyPanel;
    private javax.swing.JPanel jPageHeadPanel;
    private javax.swing.JLabel jPageLabel;
    private javax.swing.JLabel jVacantLabel;
    private javax.swing.JPanel jfloor1Panel;
    private javax.swing.JPanel jfloor2Panel;
    private javax.swing.JPanel jfloor3Panel;
    // End of variables declaration//GEN-END:variables
}
