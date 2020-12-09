package User.Backend;

import User.Frontend.UserSite;
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
            }
        } catch (IOException | ClassNotFoundException exception) {
            UserWelcome.startSocket();
            System.out.println("Something went wrong\nRestarting...");
        } catch (InterruptedException ignored) { }
    }

    private void sendJSON(JSONObject data) throws IOException {
        outToServer.writeObject(data);
        outToServer.flush();
        outToServer.reset();
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
