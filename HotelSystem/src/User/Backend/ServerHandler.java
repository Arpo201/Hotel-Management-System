package User.Backend;

import User.Frontend.UserWelcome;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerHandler extends Thread {
    private final Socket serverSocket;

    public ServerHandler(Socket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        String serverData;
        JSONParser parser = new JSONParser();
        try(
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
        ) {
            JSONObject jsonData;
            while (true) {
                serverData = inFromServer.readLine();
                try {
                    jsonData = (JSONObject) parser.parse(serverData);
                    if(jsonData.get("type").equals("customer_name")) {
                        UserWelcome.setClientName(jsonData.get("name").toString());
                    }
                } catch (ParseException ignored) {}
            }
        } catch (IOException e) {
            System.out.println("Server disconnected!");
        }
    }
}
