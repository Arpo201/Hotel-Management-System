package Kitchen.Frontend;

import Kitchen.Backend.ClientListener;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.MessageFormat;

/**
 *
 * @author Asus
 */
public class FoodClientOrder extends JFrame implements WindowListener {
    public FoodClientOrder() {
        initComponents();
        this.addWindowListener(this);
        ClientListener.startSocketServer();
    }

    public static void addOrder(JSONObject orderData){
        FoodOrderForm newOrder = new FoodOrderForm();
        String roomId = orderData.get("room_id").toString();
        newOrder.setRoom(roomId);
        String orderString = "";
        for(Object order : (JSONArray)orderData.get("order")) {
            orderString += MessageFormat.format("{0} x{1}\n", ((JSONObject)order).get("name"), ((JSONObject)order).get("count"));
        }
        newOrder.setOrderData(orderString);
        newOrder.setTitle("Room " + roomId + " order");
        desktopPane.add(newOrder);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        headLabel = new JLabel();
        body = new JPanel();
        desktopPane = new JDesktopPane();
        testBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(67, 106, 141));

        headLabel.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        headLabel.setForeground(new java.awt.Color(255, 255, 255));
        headLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headLabel.setText("Order");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(headLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(headLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        );

        body.setBackground(new java.awt.Color(234, 242, 249));

        desktopPane.setBackground(new java.awt.Color(227, 234, 240));

        testBtn.setText("add test");
        testBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBtnActionPerformed(evt);
            }
        });

        desktopPane.setLayer(testBtn, JLayeredPane.DEFAULT_LAYER);

        GroupLayout desktopPaneLayout = new GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addContainerGap(928, Short.MAX_VALUE)
                .addComponent(testBtn)
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testBtn)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        GroupLayout bodyLayout = new GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desktopPane)
                .addGap(0, 0, 0))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBtnActionPerformed
        desktopPane.add(new FoodOrderForm());
//        addOrder(new JSONObject());
        System.out.println("add");
    }//GEN-LAST:event_testBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new FoodClientOrder().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel body;
    private ButtonGroup buttonGroup1;
    private static JDesktopPane desktopPane = new JDesktopPane();
    private JLabel headLabel;
    private JPanel jPanel1;
    private JButton testBtn;

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        ClientListener.stopSocketServer();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
    // End of variables declaration//GEN-END:variables
}
