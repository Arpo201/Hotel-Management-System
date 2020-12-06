/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kitchen.Frontend;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodOrderForm extends JInternalFrame {

    /**
     * Creates new form OrderFormtest
     */
    public FoodOrderForm() {
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        initComponents();

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        this.time.setText(formatter.format(date));
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.date.setText(formatter.format(date));
    }

    public void setRoom(String roomId){
        String text = "ห้อง " + roomId;
        this.roomNumber.setText(text);
    }

    public String getRoom(){
        return this.roomNumber.getText();
    }

    public String getOrderData() {
        return orderData.getText();
    }

    public void setOrderData(String orderData) {
        this.orderData.setText(orderData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        roomNumber = new JLabel();
        jPanel3 = new JPanel();
        orderData = new JTextArea();
        foodListHeader = new JLabel();
        close = new JButton();
        time = new JLabel();
        date = new JLabel();

        setVisible(true);

        jPanel2.setBackground(new java.awt.Color(146, 177, 204));

        roomNumber.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        roomNumber.setHorizontalAlignment(SwingConstants.CENTER);
        roomNumber.setText("ห้อง 101");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(roomNumber, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(roomNumber, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(227, 234, 240));

        orderData.setEditable(false);
        orderData.setColumns(20);
        orderData.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        orderData.setRows(5);

        foodListHeader.setFont(new java.awt.Font("Angsana New", 1, 30)); // NOI18N
        foodListHeader.setHorizontalAlignment(SwingConstants.CENTER);
        foodListHeader.setText("รายการอาหาร");

        close.setBackground(new java.awt.Color(206, 237, 255));
        close.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        close.setForeground(new java.awt.Color(37, 80, 127));
        close.setText("Finish");
        close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        time.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        time.setHorizontalAlignment(SwingConstants.CENTER);
        time.setText("เวลา");

        date.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        date.setHorizontalAlignment(SwingConstants.CENTER);
        date.setText("วันที่");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(foodListHeader, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(time, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(date, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(close, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderData)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(time)
                .addGap(7, 7, 7)
                .addComponent(date)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodListHeader)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderData, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(close, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton close;
    private JLabel date;
    private JLabel foodListHeader;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JTextArea orderData;
    private JLabel roomNumber;
    private JLabel time;
    // End of variables declaration//GEN-END:variables
}
