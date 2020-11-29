package Admin.Backend;

import Admin.Frontend.FoodClientOrder;
import Admin.Frontend.RunOrder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.MessageFormat;

public class ResponseHandler extends Thread {
    private final JSONObject clientData;
    private String clientId;

    public ResponseHandler(JSONObject clientData, String clientId) {
        this.clientData = clientData;
        this.clientId = clientId;
    }

    @Override
    public void run() {
        try {
            clientData.put("room_id", clientId);
            System.out.println(MessageFormat.format("Got data from {0}: {1}", this.clientId, this.clientData));
            if(clientData.get("type").equals("auth") && this.clientId == null) {
                this.clientId = clientData.get("id").toString();
                ClientHandler.setClientId(this.clientId);
                System.out.println(MessageFormat.format("Room {0} is connected", this.clientId));
                sendCustomerName(this.clientId);
            } else if(clientData.get("type").equals("food_order")) {
                try {
                    FoodClientOrder.addOrder(clientData);
                } catch (NullPointerException e) {}
                ClientHandler.sendAck();
            } else {
                ClientHandler.sendAck();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    private void sendMsg(String msg) throws IOException {
        JSONObject jsonData = new JSONObject();
        jsonData.put("type", "msg");
        jsonData.put("msg", msg);
        ClientHandler.sendJSON(jsonData);
    }

    static void sendCustomerName(String roomId) throws IOException {
        JSONObject jsonData = new JSONObject(), roomData = Admin.Backend.Room.getRoomData(roomId);
        jsonData.put("type", "customer_name");
        jsonData.put("name", roomData.get("first_name").toString() + " " + roomData.get("last_name").toString());
        ClientHandler.sendJSON(jsonData);
    }
}
