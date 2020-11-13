/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

/**
 *
 * @author Rping
 */
import java.sql.*;
public class TestDB {
    public static void main(String[] args){
        connectDB();
    }
    public static Connection connectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");//ระบุ Driver
            String url = "jdbc:mysql://" +"localhost"+ "/" +"hotel_db"; //=localhost/StudentDB
            Connection connect = DriverManager.getConnection(url,"root",""); //ใช้งาน interface ที่ชื่อ Connection
            System.out.println("เชื่อมต่อฐานข้อมูลเรียบร้อย");
            return connect;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
