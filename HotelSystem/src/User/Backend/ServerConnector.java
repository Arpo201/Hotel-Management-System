package User.Backend;

import Admin.Backend.ClientHandler;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerConnector extends Thread {
    private static JSONArray queues = new JSONArray();
    private static DataOutputStream outToServer;

    @Override
    public void run() {
        JSONParser parser = new JSONParser();
        try {
            pushQueues((JSONObject) parser.parse("{\"type\":\"auth\", \"id\": \"301\"}"));
        } catch (ParseException ignored) {}

        try(Socket socket = new Socket("localhost", 3141);
            DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
        ) {
            ServerConnector.outToServer = outToServer;
            if(socket.isConnected()) System.out.println("Connected!");
            while(socket.isConnected()) {
                if(queues.size() > 0) {
                    outToServer.writeBytes(popQueues().toJSONString() + "\n");
                }
                new ServerHandler(socket).start();
                Thread.sleep(100);
            }
        } catch (IOException | InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public static JSONObject popQueues() {
        JSONObject queue = (JSONObject) queues.get(0);
        queues.remove(0);
        return queue;
    }

    public static void pushQueues(JSONObject queue) {
        ServerConnector.queues.add(queue);
    }
}
