package Kitchen.Backend;

import Kitchen.Frontend.FoodClientOrder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.Socket;
import java.text.MessageFormat;

public class ClientHandler extends Thread {
    private final Socket clientSocket;
    private static String id = null;
    private static ObjectOutputStream outToClient;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        JSONObject clientData;
        try(
            ObjectOutputStream outToClient = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream inFromClient = new ObjectInputStream(clientSocket.getInputStream());
        ) {
            ClientHandler.outToClient = outToClient;
            while (true) {
                clientData = (JSONObject) inFromClient.readObject();
                if(ClientHandler.id == null) {
                    ClientHandler.id = clientData.get("id").toString();
                }
                System.out.println(MessageFormat.format("Got data from {0}: {1}", id, clientData));
                FoodClientOrder.addOrder(clientData);
                ClientHandler.sendAck();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(MessageFormat.format("Client {0} disconnected!", id));
            ClientHandler.id = null;
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
        System.out.println(MessageFormat.format("Sending {0} to {1}", data.toJSONString(), id));
    }
}
