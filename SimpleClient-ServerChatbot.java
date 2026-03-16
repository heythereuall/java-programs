//Server.java

import java.net.*;
import java.io.*;

public class Server{
    public static void main(String args[]) throws Exception{

        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started");

        Socket s = ss.accept();
        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

        String msg = br.readLine();

        if(msg.equalsIgnoreCase("hello"))
            System.out.println("Bot: Hi Client");
        else
            System.out.println("Bot: I don't understand");

        ss.close();
    }
}

//Client.java

import java.net.*;
import java.io.*;

public class Client{
    public static void main(String args[]) throws Exception{

        Socket s = new Socket("localhost",5000);

        PrintWriter pw = new PrintWriter(
                s.getOutputStream(),true);

        pw.println("hello");

        s.close();
    }
}
