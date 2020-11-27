package Admin.Frontend;

import Admin.Backend.Room;
import org.json.simple.JSONObject;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Asus
 */
public class BookingForm extends javax.swing.JFrame {

    /**
     * Creates new form BookingForm
     */
    public BookingForm() {
        this(null);
    }
    public BookingForm(String roomId) {
        this.roomId = roomId;
        this.roomData = Room.getRoomData(roomId);
        initComponents();
        this.checkin.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        this.checkout.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
    }
    public static void getBookingForm(String roomId){
        BookingForm bf = new BookingForm(roomId);
        bf.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        northPanel = new javax.swing.JPanel();
        bookingLabel = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        numRoom = new javax.swing.JLabel();
        prefix = new javax.swing.JComboBox<>();
        fname = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneNum = new javax.swing.JTextField();
        mailLabel = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        checkinLabel = new javax.swing.JLabel();
        checkin = new datechooser.beans.DateChooserCombo();
        checkoutLabel = new javax.swing.JLabel();
        checkout = new datechooser.beans.DateChooserCombo();
        southPanel = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        northPanel.setBackground(new java.awt.Color(67, 106, 141));

        bookingLabel.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        bookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookingLabel.setText("Booking Form");

        javax.swing.GroupLayout northPanelLayout = new javax.swing.GroupLayout(northPanel);
        northPanel.setLayout(northPanelLayout);
        northPanelLayout.setHorizontalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, northPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookingLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        northPanelLayout.setVerticalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        bodyPanel.setBackground(new java.awt.Color(234, 242, 249));

        numRoom.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        numRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numRoom.setText(MessageFormat.format("ห้อง {0}", roomId));

        prefix.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        prefix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "นาย", "นาง", "นางสาว" }));
        prefix.setSelectedItem(roomData.get("prefix").toString());

        fname.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.setText(roomData.get("first_name").toString());

        lnameLabel.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        lnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lnameLabel.setText("นามสกุล");

        lname.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.setText(roomData.get("last_name").toString());

        phoneLabel.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneLabel.setText("เบอร์โทร");

        phoneNum.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        phoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumActionPerformed(evt);
            }
        });
        phoneNum.setText(roomData.get("tel").toString());

        mailLabel.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        mailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mailLabel.setText("อีเมล");

        mail.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        mail.setText(roomData.get("email").toString());

        checkinLabel.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        checkinLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        checkinLabel.setText("เช็คอิน");

        checkin.setCalendarPreferredSize(new java.awt.Dimension(500, 300));
        checkin.setNothingAllowed(false);
        checkin.setFieldFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        checkin.setMinDate(java.util.Calendar.getInstance());
        checkin.setNavigateFont(new java.awt.Font("Angsana New", java.awt.Font.PLAIN, 24));
        checkin.setCurrentNavigateIndex(0);
        try {
            String[] checkinDate = roomData.get("checkin").toString().split("/");
            checkin.setSelectedDate(new Calendar.Builder().setDate(Integer.parseInt(checkinDate[2]), Integer.parseInt(checkinDate[1]), Integer.parseInt(checkinDate[0])).build());
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }

        checkoutLabel.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        checkoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        checkoutLabel.setText("เช็คเอาท์");

        checkout.setCalendarPreferredSize(new java.awt.Dimension(500, 300));
        checkout.setNothingAllowed(false);
        checkout.setFieldFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        checkout.setMinDate(java.util.Calendar.getInstance());
        checkout.setNavigateFont(new java.awt.Font("Angsana New", java.awt.Font.PLAIN, 24));
        checkout.setCurrentNavigateIndex(0);
        try {
            String[] checkoutDate = roomData.get("checkout").toString().split("/");
            checkout.setSelectedDate(new Calendar.Builder().setDate(Integer.parseInt(checkoutDate[2]), Integer.parseInt(checkoutDate[1]), Integer.parseInt(checkoutDate[0])).build());
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lnameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(prefix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fname)
                    .addComponent(lname, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(phoneNum, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(mail, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(checkin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(numRoom)
                .addGap(20, 20, 20)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutLabel))
                .addGap(85, 85, 85))
        );

        southPanel.setBackground(new java.awt.Color(146, 177, 204));

        cancel.setBackground(new java.awt.Color(255, 153, 153));
        cancel.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 51, 51));
        cancel.setText("Cancel");
        cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.setMaximumSize(new java.awt.Dimension(90, 35));
        cancel.setMinimumSize(new java.awt.Dimension(90, 35));
        cancel.setPreferredSize(new java.awt.Dimension(90, 35));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(153, 219, 255));
        reset.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(48, 103, 163));
        reset.setText("Reset");
        reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setMaximumSize(new java.awt.Dimension(90, 35));
        reset.setMinimumSize(new java.awt.Dimension(90, 35));
        reset.setPreferredSize(new java.awt.Dimension(90, 35));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        confirm.setBackground(new java.awt.Color(183, 255, 132));
        confirm.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        confirm.setForeground(new java.awt.Color(101, 186, 42));
        confirm.setText("Confirm");
        confirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.setMaximumSize(new java.awt.Dimension(90, 35));
        confirm.setMinimumSize(new java.awt.Dimension(90, 35));
        confirm.setPreferredSize(new java.awt.Dimension(90, 35));
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout southPanelLayout = new javax.swing.GroupLayout(southPanel);
        southPanel.setLayout(southPanelLayout);
        southPanelLayout.setHorizontalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southPanelLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        southPanelLayout.setVerticalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(northPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(southPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(northPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(southPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void phoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        this.prefix.setSelectedIndex(0);
        this.fname.setText("");
        this.lname.setText("");
        this.phoneNum.setText("");
        this.mail.setText("");
        this.checkin.setSelectedDate(Calendar.getInstance());
        this.checkout.setSelectedDate(Calendar.getInstance());
    }//GEN-LAST:event_resetActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        JSONObject data = new JSONObject();
        data.put("id", roomId);
        data.put("prefix", prefix.getSelectedItem().toString());
        data.put("first_name", fname.getText());
        data.put("last_name", lname.getText());
        data.put("tel", phoneNum.getText());
        data.put("email", mail.getText());
        data.put("checkin", checkin.getText());
        data.put("checkout", checkout.getText());
        Room.setRoomData(data);
        RunAdmin.updateUI();
        this.dispose();
    }//GEN-LAST:event_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel bookingLabel;
    private javax.swing.JButton cancel;
    private datechooser.beans.DateChooserCombo checkin;
    private javax.swing.JLabel checkinLabel;
    private datechooser.beans.DateChooserCombo checkout;
    private javax.swing.JLabel checkoutLabel;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField mail;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JPanel northPanel;
    private javax.swing.JLabel numRoom;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneNum;
    private javax.swing.JComboBox<String> prefix;
    private javax.swing.JButton reset;
    private javax.swing.JPanel southPanel;
    private String roomId;
    private JSONObject roomData;
    // End of variables declaration//GEN-END:variables
}
