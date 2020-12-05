package Admin.Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;

    public DatabaseConnection() {
        if(connection == null) {
            String url = "jdbc:mysql://68.183.181.112/hotel";
            try {
                connection = DriverManager.getConnection(url, "hotel", "r2BIwa7o2e");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
