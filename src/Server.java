import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args){
        String host = "localhost";
        int port = 80;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new
                     PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new
                     InputStreamReader(clientSocket.getInputStream()))) {
            out.println("GET / HTTP/1.1\n" +
                    "Host: localhost\n\n\n");
            String resp = in.readLine();
            System.out.println(resp);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName(host);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(host + ", ip address: " +
                inetAddress.getHostAddress());
// netology.ru, ip address: 104.26.8.143
    }
}
