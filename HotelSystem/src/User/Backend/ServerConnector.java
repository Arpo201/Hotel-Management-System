package User.Backend;

import User.Frontend.UserWelcome;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.Socket;
import java.text.MessageFormat;

public class ServerConnector extends Thread {
    private static ObjectOutputStream outToServer;

    @Override
    public void run() {
        JSONParser parser = new JSONParser();
        try {
            QueueHandler.pushQueues((JSONObject) parser.parse("{\"type\":\"auth\", \"id\": \"301\"}"));
            QueueHandler.pushQueues((JSONObject) parser.parse("{\"type\":\"get_response\"}"));
        } catch (ParseException ignored) {}

        try(
                Socket socket = new Socket("localhost", 3141);
                ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());
        ) {
            ServerConnector.outToServer = outToServer;
            System.out.println("Connected!");
            while (true){
                sendJSON(popQueues());
                JSONObject serverData = (JSONObject) inFromServer.readObject();
                System.out.println(serverData);
                if(serverData.get("type").equals("customer_name")) {
                    UserWelcome.setClientName(serverData.get("name").toString());
                }
            }
        } catch (IOException | InterruptedException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    private void sendJSON(JSONObject data) throws IOException {
        outToServer.writeObject(data);
        outToServer.flush();
        System.out.println(MessageFormat.format("Sending {0} to server", data.toJSONString()));
    }

    public synchronized JSONObject popQueues() throws InterruptedException {
        JSONArray queues = QueueHandler.getQueues();
        while (queues.size() <= 0) {
            wait();
        }
        JSONObject queue = (JSONObject) queues.get(0);
        queues.remove(0);
        return queue;
    }
}
