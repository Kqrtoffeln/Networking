package fr.ensmn.shao;
import java.net.*;
import java.io. *;
import java.util.*;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket Socket= new ServerSocket(5000);
            System.out.println("Waiting for Client.");
            Socket Serveur = Socket.accept();
            System.out.println("Server is connected.");

            // Sending data S to C.
            Scanner scan = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(Serveur.getOutputStream());
            while (true){
                System.out.print("Enter Data:");
                String data = scan.nextLine();
                pw.println(data);
                pw.flush();
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
