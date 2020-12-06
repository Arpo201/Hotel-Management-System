package Admin.Backend;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientListener extends Thread {
    private static ServerSocket socket;
    private static ClientListener client = new ClientListener();
    private static KitchenConnector kitchenClient = new KitchenConnector();
    final ExecutorService clientProcessingPool = Executors.newFixedThreadPool(15);

    @Override
    public void run() {
        try(ServerSocket socket = new ServerSocket(3141);) {
            ClientListener.socket = socket;
            System.out.println("Listening on port 3141");
            System.out.println(socket);
            while(!this.isInterrupted()) {
                Socket connectionSocket = socket.accept();
                connectionSocket.setKeepAlive(true);
                clientProcessingPool.submit(new ClientHandler(connectionSocket));
            }
        } catch (IOException exception) {
            startSocketServer();
            System.out.println("Something went wrong\nRestarting...");
        }
    }

    public static void notifySocket() {
        synchronized (kitchenClient) {
            kitchenClient.notify();
        }
    }

    public static void startSocketServer() {
        client = new ClientListener();
        client.start();
        startKitchenClient();
    }

    public static void stopSocketServer() {
        client.interrupt();
        stopKitchenClient();
    }

    public static void startKitchenClient() {
        kitchenClient = new KitchenConnector();
        kitchenClient.start();
    }

    public static void stopKitchenClient() {
        kitchenClient.interrupt();
    }
}
