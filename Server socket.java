import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {

        // Create a server socket listening on port 5000
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server is running... Waiting for client");

        // Wait for a client to connect
        Socket socket = server.accept();
        System.out.println("Client connected");

        // Read message from client
        DataInputStream input = new DataInputStream(socket.getInputStream());
        String message = input.readUTF();
        System.out.println("Client says: " + message);

        // Respond to client
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("Hello Client, message received!");

        // Close connections
        socket.close();
        server.close();
    }
}
