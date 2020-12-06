/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Frontend;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Asus
 */
public class RunAdmin {
        private MainCompoNavbar nav = new MainCompoNavbar();
        private MainCompoHead head = new MainCompoHead();
        private static MainCompoBottomBar clientBar = new MainCompoBottomBar();
        private static JFrame frame;
        private static JPanel card;
        private static MainpageHome home = new MainpageHome();
        private static MainpageRoom room = new MainpageRoom();
        public RunAdmin() {
            this("");
        }

        public RunAdmin(String name){
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            card = new JPanel();
            card.setLayout(new CardLayout());
            card.add(home, "Home");
            card.add(room, "Room");

            head.setName(name);

            frame.add(head, BorderLayout.NORTH);
            frame.add(nav, BorderLayout.WEST);
            frame.add(card);
            frame.add(clientBar, BorderLayout.SOUTH);

            home.updateData();
            
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

        public static void updateUI(String type) {
            if (type == "room") room.updateRoomStatus();
            else home.updateData();
            clientBar.updateUserCount();
        }

        public static void getHome(){
            CardLayout c1 = (CardLayout)(card.getLayout());
            updateUI("home");
            c1.show(card, "Home");
        }
        public static void getRoom(){
            CardLayout c1 = (CardLayout)(card.getLayout());
            updateUI("room");
            c1.show(card, "Room");
        }
        public static void logout(){
            frame.dispose();
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginForm().setVisible(true);
                }
            });
        }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new RunAdmin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
