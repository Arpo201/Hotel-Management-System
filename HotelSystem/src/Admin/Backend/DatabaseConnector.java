package Admin.Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static Connection connection = null;

    public DatabaseConnector() {
        connect();
    }

    public static void connect() {
        if(connection == null) {
            String url = "jdbc:mysql://68.183.181.112/hotel?useSSL=true&requireSSL=true&enabledTLSProtocols=TLSv1.2";
            try {
                connection = DriverManager.getConnection(url, "hotel", "r2BIwa7o2e");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Already connected! doing nothing.");
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
