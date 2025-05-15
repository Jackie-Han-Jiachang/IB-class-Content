import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TranslatorService {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(805);
            System.out.println("Waiting for client");
            Socket client = server.accept();
            System.out.println("Someone connected");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            String message = in.readLine();
            if (message.equals("hello")){
                out.println("你好");
            } else if (message.equals("love ya")){
                out.println("爱你");
            } else if(message.equals("eat what?")){
                out.println("食何？");
            }
            else {
                out.println("再见");
            }
            
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    
}
