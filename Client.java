package fr.ensmn.shao;
import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args){
        try{
            Socket Client = new Socket("localhost",5000);
            System.out.println("Client is connected.");
            //Reading data from Server
            BufferedReader br = new BufferedReader(new InputStreamReader(Client.getInputStream()));
            while(true){
                String data = br.readLine();
                System.out.println("Data from Server: " + data);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
