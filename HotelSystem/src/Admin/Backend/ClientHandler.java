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

public class ClientHandler implements Runnable {
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
            while (true) {
                JSONObject jsonData = new JSONObject();
                /* Get Data From Client */
                clientData = inFromClient.readLine();
                System.out.println(MessageFormat.format("Got data from {0}: {1}", this.id, clientData));
                try {
                    jsonData = (JSONObject) parser.parse(clientData);
                } catch (ParseException ignored) {}
                if(this.id == null && jsonData.get("type").equals("auth")) {
                    this.id = jsonData.get("id").toString();
                }

                /* Send Data To Client */

                //Code
            }
        } catch (IOException e) {
            System.out.println("Client disconnected!");
        }
    }
}
