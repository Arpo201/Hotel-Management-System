package Admin.Backend;

import Admin.Frontend.RunAdmin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientListener extends Thread {
    final ExecutorService clientProcessingPool = Executors.newFixedThreadPool(15);

    @Override
    public void run() {
        try(ServerSocket socket = new ServerSocket(3141);) {
            while(true) {
                Socket connectionSocket = socket.accept();
                connectionSocket.setKeepAlive(true);
                clientProcessingPool.submit(new ClientHandler(connectionSocket));
            }
        } catch (IOException exception) {
            RunAdmin.startSocket();
            exception.printStackTrace();
            System.out.println("Something went wrong\nRestarting...");
        }
    }
}
