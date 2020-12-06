package Admin.Backend;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.MessageFormat;

public class KitchenConnector extends Thread {
    private static ObjectOutputStream outToServer;

    @Override
    public void run() {
        try(
                Socket socket = new Socket("localhost", 3142);
                ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());
        ) {
            KitchenConnector.outToServer = outToServer;
            System.out.println("Connected to Kitchen!");
            while (!this.isInterrupted()){
                sendJSON(getFirstQueue());
                JSONObject serverData = (JSONObject) inFromServer.readObject();
                if(serverData.get("type").equals("ack")) removeFirstQueue();
                System.out.println(serverData);
            }
        } catch (IOException | ClassNotFoundException exception) {
            this.interrupt();
            System.out.println("Disconnected!\nReconnecting...");
            ClientListener.startKitchenClient();
        } catch (InterruptedException ignored) { }
    }

    public static void sendJSON(JSONObject data) throws IOException {
        outToServer.writeObject(data);
        outToServer.flush();
        outToServer.reset();
        System.out.println(MessageFormat.format("Sending {0} to kitchen", data.toJSONString()));
    }

    public synchronized JSONObject getFirstQueue() throws InterruptedException {
        JSONArray queues = QueueHandler.getQueues();
        while (queues.size() <= 0) {
            wait();
        }
        JSONObject queue = (JSONObject) queues.get(0);
        return queue;
    }

    public void removeFirstQueue() {
        JSONArray queues = QueueHandler.getQueues();
        queues.remove(0);
    }
}
