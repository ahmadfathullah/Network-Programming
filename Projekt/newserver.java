import java.net.*;
import java.io.*;
import.java.util.*;

public class newserver {

public static void main(String[] args) throws Exception {
ServerSocket ss = new ServerSocket(4347);
while (true) {
System.out.println("Waiting for Connection ...");
socket sock = ss.accept();
System.out.println("New socket " + s.getLocalSocketAddress() + " " + s.getRemoteSocketAddress());

DataOutputStream out= new DataOutputStream(sock.getOutputStream());
out.writeBytes("server Date: "+(new Date()).toString() + "\n");
out.close();
sock.close();
}
}
}