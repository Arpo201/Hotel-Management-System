/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rping
 */
public class Connect {
    public static void main(String[] args){
        connectDB();
    }
    public static Connection connectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");//ระบุ Driver
            String url = "jdbc:mysql://" +"68.183.181.112"+ "/" +"hotel"; //=localhost/StudentDB
            Connection connect = DriverManager.getConnection(url,"hotel","r2BIwa7o2e"); //ใช้งาน interface ที่ชื่อ Connection
            System.out.println("เชื่อมต่อฐานข้อมูลเรียบร้อย");
            return connect;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
