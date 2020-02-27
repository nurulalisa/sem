import java.io.*;
import java.net.*;

public class Server{
    
    public static void main(String[] args) throws IOException{
        
       ServerSocket serverJava = new ServerSocket (10000);
        Socket clientC = serverJava.accept();
        
        System.out.println("client connected");
     
        InputStreamReader ot = new
        InputStreamReader(clientC.getInputStream());
        
        BufferedReader ou = new BufferedReader(ot);
        
        PrintWriter rp = new PrintWriter(clientC.getOutputStream());
            
        rp.println("wo hen hao");
        rp.flush();
        
        String recvr = ou.readLine();
        System.out.println(recvr);
        )
    }
