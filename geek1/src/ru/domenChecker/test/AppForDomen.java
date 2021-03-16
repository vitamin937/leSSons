package ru.domenChecker.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class AppForDomen {
    public static void main(String[] args) throws UnknownHostException, IOException {

        // URL, для которого нужно получить IP-адрес
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ipAddress;
        String hostName;
        String body = null;
        try {
            body = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String head = "https://www.";
        String end = "/";
        String s = head+body+end;
        System.out.println("For Address: " + s);

        try {
            // Получить IP-адрес с помощью getByName ()
            InetAddress ip = InetAddress.getByName(new URL(s).getHost());
            ipAddress = ip.getHostAddress();
            String ipAddress2 = "127.0.0.1";
            hostName = ip.getHostName();
            // Распечатать IP-адрес
            System.out.println("domain " + ip.getHostName() + " is Exist");
            System.out.println("ip Address for domain " + hostName + " is: "+ ipAddress);
            System.out.println(" ");
            sendPingRequest(ipAddress2);
        } catch (MalformedURLException e) {
            // Это значит, что URL недействителен
            System.out.println("Invalid URL or domain is non Exist");
        }
    }
    public static void sendPingRequest(String ipAddress) throws UnknownHostException, IOException
    {
        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        if (geek.isReachable(5000))
            System.out.println("Host is reachable");
        else
            System.out.println("Sorry ! We can't reach to this host");

    }
}