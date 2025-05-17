package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoHTTPServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(80); // Tells OS I am a server, at port 80hai
            System.out.println("Waiting for client..");
            while (true) {
                Socket client = server.accept();
                System.out.println("Someone connected!!");

                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);

                // GET /hello HTTP/1.1
                String line = in.readLine();
                if (line != null && line.startsWith("GET")) {
                    System.out.println(line);
                    // out.println("HTTP/1.1 200 OK");
                    // out.println("Content-Type: text/html");
                    // out.println();
                    out.println("<html><head><title>CS Review Session</title></head><body><h1>Hello Class</h1><p>Welcome! Do you want to get a 7 in CS major? click this <a href=\"https://www.youtube.com/watch?v=dQw4w9WgXcQ\" target=\"_blank\"><img src=\"https://www.baltana.com/files/wallpapers-2/Cute-Cat-Images-07756.jpg\"></a></p></body></html>");
                }
                client.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

