import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TranslatorClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",805);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("GET /hello HTTP/1.1");
            String response = in.readLine();
            System.out.println("Server said: " + response);
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

