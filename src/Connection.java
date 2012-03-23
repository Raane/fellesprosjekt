/*
 * Written with quite a lot of help from the simpleConnection class
 */



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class Connection {
  private Socket mySocket;
  private DataOutputStream os;
  private DataInputStream is;
  private boolean stop = true;
  private int myPort;

  public Connection(int myPort) {
    this.myPort = myPort;
  }
  
  private Connection(Socket mySocket, int myPort) throws IOException {
    this.myPort = myPort;
    this.mySocket = mySocket;
    os = new DataOutputStream(mySocket.getOutputStream());
    is = new DataInputStream(mySocket.getInputStream());
        
    stop = false;
    System.out.println("Connection established!");
  }

  public void connect(InetAddress remoteAddress, int remotePort) throws IOException, SocketTimeoutException {
    System.out.println("Atempting to connect to: "+remoteAddress.getHostAddress()+" : "+remotePort);
    mySocket = new Socket(remoteAddress,remotePort);
		
    os = new DataOutputStream(mySocket.getOutputStream());
    is = new DataInputStream(mySocket.getInputStream());
        
    stop = false;
        
    System.out.println("Connection established!");
  }

  public Connection accept()
    throws IOException, SocketTimeoutException {
		
    ServerSocket myServerSocket = new ServerSocket(myPort);
    System.out.println("ServerSocket is listening at: " +myServerSocket.getLocalPort() );
    mySocket = myServerSocket.accept();
    System.out.println("Received connection at: " +myServerSocket.getLocalPort() );
    System.out.println("New connection issued at port "+mySocket.getLocalPort());
    myServerSocket.close();

    return new Connection(mySocket, myPort);
  }

  public void send(String msg) throws ConnectException, IOException {
    os.writeUTF(msg);
  }

  public String receive() throws ConnectException, IOException {
    while (!stop) {
      String msg  = is.readUTF();
      System.out.println("Received the text: "+ msg);
      return msg;
    }
    throw new IOException("Can't receive. The connection is not established!");
  }

  public void close() throws IOException {
    stop = true;
    try {
      os.close();
      is.close();
      mySocket.close();
    } 
    catch (UnknownHostException e) {
      System.err.println("Trying to connect to unknown host: " + e);
    }
  }
}
