package User.Backend;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocketHandler extends Thread {
    @Override
    public void run() {
        try(Socket socket = new Socket("localhost", 3141);
            DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream() );
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            while(true) {
                if(socket.isConnected()) System.out.println("Connected!");
                outToServer.writeBytes("{\"type\":\"auth\", \"id\": \"301\"}\n");
                outToServer.writeBytes("{\"type\":\"msg\", \"msg\": \"reeeeeeeeeeeeeeeeeeeeee\"}\n");
                System.out.println(inFromServer.readLine());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
