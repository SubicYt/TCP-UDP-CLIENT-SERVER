import java.net.*;
import java.io.*;

public class TCPserver{
        public static void main(String args[]) throws IOException{
                
                //establish the connection
                ServerSocket ss = new ServerSocket(4999);
                Socket s = ss.accept();
                System.out.println("client connected");

                //read message from the client
                InputStreamReader in = new InputStreamReader(s.getInputStream());
                BufferedReader bf = new BufferedReader(in);

                String str = bf.readLine();
                System.out.println("client: " + str);

                PrintWriter pr = new PrintWriter(s.getOutputStream());
                pr.println("hello client, this is server");
                pr.flush();
        }
} 
