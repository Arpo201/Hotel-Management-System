/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kitchen.Frontend;

import javax.swing.*;

/**
 *
 * @author Asus
 */
public class RunOrder {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new FoodClientOrder().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
