import java.io.*;
import java.net.*;

public class server{
    
    public static void main(String[] args) throws IOException{
        
       ServerSocket serverSocket = new ServerSocket (10000);
        Socket clientSocket = serverSocket.accept();
        
        System.out.println("client connected");
     
        InputStreamReader t = new;
        InputStreamReader(clientSocket.getInputStream());
        
        BufferedReader ot = new BufferedReader (gt);
        PrintWriter rp = new
            PrintWriter(clientSocket.getOutputStream());
        rp.println("wo hen hao");
        rp.flush();
        
        String recur = ot.readLine();
        System.out.println(recur);
    }
     
  
