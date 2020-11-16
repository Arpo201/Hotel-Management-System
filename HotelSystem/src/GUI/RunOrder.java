/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Asus
 */
public class RunOrder {
    private static ClientOrderForm cof;
    private static OrderForm newOrder;
    public RunOrder(){
        cof = new ClientOrderForm();
    }
    
    public void addOrder(int num){
        cof.addOrder(num);
    }
    public static void finishOrder(OrderForm order){
        cof.finishOrder(order);
    }
    public static void main(String[] args) {
        new ClientOrderForm().setVisible(true);
    }
}
