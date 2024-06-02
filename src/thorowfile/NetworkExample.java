package thorowfile;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class NetworkExample {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;

        try {
            socket = new Socket("example.com", 80);
            inputStream = socket.getInputStream();
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.err.println("A network I/O error occurred: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException ex) {
                System.err.println("Failed to close resources: " + ex.getMessage());
            }
        }
    }
}
