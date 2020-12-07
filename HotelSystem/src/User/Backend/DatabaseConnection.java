package User.Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;

    public DatabaseConnection() {
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

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
