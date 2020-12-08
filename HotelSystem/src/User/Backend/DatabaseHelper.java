package User.Backend;

import org.json.simple.JSONObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.MessageFormat;

public class DatabaseHelper {
    private static Connection connection = new DatabaseConnector().getConnection();

    public static String getRoomData(String roomId) {
        JSONObject roomData = new JSONObject();
        roomData.put("first_name", "");
        roomData.put("last_name", "");
        String sql = MessageFormat.format("select * from room where id = {0}", roomId);
        try {
            ResultSet rs = connection.createStatement().executeQuery(sql);
            if(rs.next()){
                roomData.replace("first_name", rs.getString("first_name"));
                roomData.replace("last_name", rs.getString("last_name"));
            }
        } catch (Exception ignored) { }

        return roomData.get("first_name").toString() + " " + roomData.get("last_name").toString();
    }
}
