/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Asus
 */
public class RunAdmin {
        private Navbar nav = new Navbar();
        private Head head = new Head();
        private ClientBar clientBar = new ClientBar();
        private static JFrame frame;
        private static JPanel card;
        private static Home home = new Home();
        private static Room room = new Room();
        public RunAdmin(){
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            card = new JPanel();
            card.setLayout(new CardLayout());
            card.add(home, "Home");
            card.add(room, "Room");
            
            frame.add(head, BorderLayout.NORTH);
            frame.add(nav, BorderLayout.WEST);
            frame.add(card);
            frame.add(clientBar, BorderLayout.SOUTH);
            
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        
        public static void getHome(){
            CardLayout c1 = (CardLayout)(card.getLayout());
            c1.show(card, "Home");
        }
        public static void getRoom(){
            CardLayout c1 = (CardLayout)(card.getLayout());
            c1.show(card, "Room");
        }
        public static void logout(){
            frame.dispose();
            new LoginForm().setVisible(true);
        }
    public static void main(String[] args) {
        new RunAdmin();
    }
}
