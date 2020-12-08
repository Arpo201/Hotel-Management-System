package Admin.Backend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DatabaseHelper {
    private static Connection connection = new DatabaseConnector().getConnection();

    public static String getUserCount() {
        String sql = "select count(*) as count from room where first_name != '' and last_name != ''";
        try {
            ResultSet rs = connection.createStatement().executeQuery(sql);
            if(rs.next()){
                return rs.getString("count");
            }
        } catch (Exception ignored) { }
        return "0";
    }

    public static ResultSet getUserData() {
        ResultSet rs = null;
        String sql = "select * from room where first_name != '' and last_name != ''";
        try {
            rs = connection.createStatement().executeQuery(sql);
        } catch (Exception ignored) { }
        return rs;
    }

    public static JSONObject getAvailableStatus() {
        JSONParser parser = new JSONParser();
        JSONObject data = null;
        try {
            data = (JSONObject) parser.parse("{\"101\": true, \"102\": true, \"103\": true, \"104\": true, \"105\": true, \"201\": true, \"202\": true, \"203\": true, \"204\": true, \"205\": true, \"301\": true, \"302\": true, \"303\": true, \"304\": true, \"305\": true}");
        } catch (ParseException ignored) {}

        String sql = "select id from room where first_name != '' and last_name != ''";
        try {
            ResultSet rs = connection.createStatement().executeQuery(sql);
            while(rs.next()){
                data.replace(rs.getString("id"), false);
            }
        } catch (Exception ignored) { }
        return data;
    }

    public static JSONObject getRoomData(String roomId) {
        JSONObject data = new JSONObject();
        data.put("id", "");
        data.put("prefix", "");
        data.put("first_name", "");
        data.put("last_name", "");
        data.put("tel", "");
        data.put("email", "");
        data.put("checkin", "");
        data.put("checkout", "");
        String sql = MessageFormat.format("select * from room where id = {0}", roomId);
        try {
            ResultSet rs = connection.createStatement().executeQuery(sql);
            if(rs.next()){
                data.replace("id", roomId);
                data.replace("prefix", rs.getString("prefix"));
                data.replace("first_name", rs.getString("first_name"));
                data.replace("last_name", rs.getString("last_name"));
                data.replace("tel", rs.getString("tel"));
                data.replace("email", rs.getString("email"));
                data.replace("checkin", rs.getString("checkin"));
                data.replace("checkout", rs.getString("checkout"));
            }
        } catch (Exception ignored) { }
        return data;
    }

    public static boolean setRoomData(JSONObject data) {
        String sql = MessageFormat.format("update room set prefix = \"{0}\", first_name = \"{1}\", last_name = \"{2}\", tel = \"{3}\", email = \"{4}\", checkin = \"{5}\", checkout = \"{6}\" where id = \"{7}\"",
                data.get("prefix").toString(),
                data.get("first_name").toString(),
                data.get("last_name").toString(),
                data.get("tel").toString(),
                data.get("email").toString(),
                data.get("checkin").toString(),
                data.get("checkout").toString(),
                data.get("id").toString()
        );
        try {
            Statement stm = connection.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String getAvailableRoomCount(int floor) {
        String sql;
        if(floor == -1) sql = "select count(*) as count from room where first_name = '' and last_name = ''";
        else sql = MessageFormat.format("select count(*) as count from room where first_name = \"\" and last_name = \"\" and floor = {0}", floor);
        try {
            ResultSet rs = connection.createStatement().executeQuery(sql);
            if(rs.next()){
                return rs.getString("count");
            }
        } catch (Exception ignored) { }
        return "0";
    }

    public static String getAllAvailableRoomCount() {
        return getAvailableRoomCount(-1);
    }

    public static boolean addNewAdmin(JSONObject data) {
        String sql = MessageFormat.format("insert into user values(null, \"{0}\", \"{1}\", \"{2}\")",
                data.get("username").toString(),
                data.get("password").toString(),
                data.get("full_name").toString()
        );
        try {
            Statement stm = connection.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
