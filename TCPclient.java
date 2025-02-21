import java.net.*;
import java.io.*;

public class TCPclient{
        public static void main(String args[]) throws IOException{
                Socket s = new Socket("localhost", 4999);

                //send message to the server
                PrintWriter pr = new PrintWriter(s.getOutputStream());
                pr.println("Hello from client");
                pr.flush();

                //read message from the server
                InputStreamReader in = new InputStreamReader(s.getInputStream());
                BufferedReader bf = new BufferedReader(in);

                String str = bf.readLine();

                System.out.println("Server: " + str);
        }
}
