package Kitchen.Backend;

import Kitchen.Frontend.FoodClientOrder;
import Kitchen.Frontend.RunOrder;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.MessageFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientListener extends Thread {
    private static ServerSocket socket;
    private static final ClientListener client = new ClientListener();
    private static ObjectOutputStream outToClient;

    @Override
    public void run() {
        try(ServerSocket socket = new ServerSocket(3142);) {
            ClientListener.socket = socket;
            System.out.println("Listening on port 3142");
            while(!this.isInterrupted()) {
                Socket connectionSocket = socket.accept();
                connectionSocket.setKeepAlive(true);
                JSONObject clientData;
                try(
                    ObjectOutputStream outToClient = new ObjectOutputStream(connectionSocket.getOutputStream());
                    ObjectInputStream inFromClient = new ObjectInputStream(connectionSocket.getInputStream());
                ) {
                    System.out.println("Client connected!");
                    ClientListener.outToClient = outToClient;
                    while (true) {
                        clientData = (JSONObject) inFromClient.readObject();
                        FoodClientOrder.addOrder(clientData);
                        sendAck();
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Client disconnected!");
                }
            }
        } catch (IOException exception) {
            startSocketServer();
            System.out.println("Something went wrong\nRestarting...");
        }
    }

    static void sendAck() throws IOException {
        JSONObject jsonData = new JSONObject();
        jsonData.put("type", "ack");
        sendJSON(jsonData);
    }

    static void sendJSON(JSONObject data) throws IOException {
        outToClient.writeObject(data);
        outToClient.flush();
        outToClient.reset();
    }

    public static void startSocketServer(){
        if(socket == null) client.start();
    }

    public static void stopSocketServer() {
        client.interrupt();
    }
}
