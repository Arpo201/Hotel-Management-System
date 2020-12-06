package Admin.Backend;

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
    private static ResponseHandler responseHandler;

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
                responseHandler = new ResponseHandler(clientData, id);
                responseHandler.start();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(MessageFormat.format("Client {0} disconnected!", id));
            ClientHandler.id = null;
        }
    }

    static void setClientId(String id) {
        ClientHandler.id = id;
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
