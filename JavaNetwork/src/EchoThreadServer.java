import java.net.ServerSocket;
import java.net.Socket;


public class EchoThreadServer {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8888);
		
		Socket client = null;
		
		boolean flag = true;
		while(flag){
			System.out.println("The server is running, waiting for clients to link.");
			client = server.accept();
			new Thread(new EchoThread(client)).start();
		}
		server.close();
	}
}
