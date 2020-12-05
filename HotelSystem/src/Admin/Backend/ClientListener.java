package Admin.Backend;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientListener extends Thread {
    private static ServerSocket socket;
    private static final ClientListener client = new ClientListener();
    final ExecutorService clientProcessingPool = Executors.newFixedThreadPool(15);

    @Override
    public void run() {
        try(ServerSocket socket = new ServerSocket(3141);) {
            ClientListener.socket = socket;
            while(!this.isInterrupted()) {
                Socket connectionSocket = socket.accept();
                connectionSocket.setKeepAlive(true);
                clientProcessingPool.submit(new ClientHandler(connectionSocket));
            }
        } catch (IOException exception) {
            startSocketServer();
            exception.printStackTrace();
            System.out.println("Something went wrong\nRestarting...");
        }
    }

    public static void startSocketServer(){
        if(socket == null) client.start();
    }

    public static void stopSocketServer() {
        client.interrupt();
    }
}
