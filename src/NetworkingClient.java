/* CLIENT */
import java.io.*;
import java.net.*;
public class NetworkingClient {
    public static void main(String[] args) {
        Socket client = null;

        // Default port number we are going to use
        int portnumber = 1234;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        for (int i = 0; i < 10; i++) {
            try {
                String msg = "";

                // Creat client socket
                client = new Socket.(InetAddress.getLocalHost(), portnumber);
                System.out.println("Client socket is created " + client);

                // Creat an output stream of the client socket
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);

                // Creat an input stream of the client socket
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));

                // Creat
            }
        }
    }
}