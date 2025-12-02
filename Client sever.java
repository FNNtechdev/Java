import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF("Hello Server");
        s.close();
    }
}
