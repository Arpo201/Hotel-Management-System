package Kitchen.Backend;

import Kitchen.Frontend.FoodClientOrder;
import org.json.simple.JSONObject;

import java.io.IOException;
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
            if(this.clientId == null) {
                this.clientId = clientData.get("id").toString();
                ClientHandler.setClientId(this.clientId);
            }
            System.out.println(MessageFormat.format("Got data from {0}: {1}", this.clientId, this.clientData));
            FoodClientOrder.addOrder(clientData);
            ClientHandler.sendAck();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
