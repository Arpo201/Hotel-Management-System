package Admin.Backend;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.MessageFormat;

public class ClientHandler extends Thread {
    private final Socket clientSocket;
    private String id = null;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        String clientData;
        JSONParser parser = new JSONParser();
        try(
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(clientSocket.getOutputStream());
        ) {
            JSONObject jsonData;
            while (true) {
                clientData = inFromClient.readLine();
                try {
                    jsonData = (JSONObject) parser.parse(clientData);
                    if(this.id == null && jsonData.get("type").equals("auth")) {
                        this.id = jsonData.get("id").toString();
                        System.out.println(MessageFormat.format("Room {0} is connected", this.id));
                        outToClient.writeBytes(getNameFromRoomId(this.id).toJSONString() + "\n");
                    }
                    System.out.println(MessageFormat.format("Got data from {0}: {1}", this.id, jsonData.toJSONString()));
                } catch (ParseException ignored) {}
            }
        } catch (IOException e) {
            System.out.println("Client disconnected!");
        }
    }

    private static JSONObject getNameFromRoomId(String roomId) {
        JSONObject data = new JSONObject(), roomData = Admin.Backend.Room.getRoomData(roomId);
        data.put("type", "customer_name");
        data.put("name", roomData.get("first_name").toString() + " " + roomData.get("last_name").toString());
        return data;
    }
}
