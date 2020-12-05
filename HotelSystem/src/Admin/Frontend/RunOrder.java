/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Frontend;

import javax.swing.UIManager;
import org.json.simple.JSONObject;

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
