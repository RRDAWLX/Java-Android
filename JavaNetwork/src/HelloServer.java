import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class HelloServer {
	public static void main(String[] args) throws Exception{
		//建立服务器，检测8888端口
		ServerSocket server = new ServerSocket(8888);
		
		System.out.println("服务器运行，等待客户端链接");
		
		//建立服务器端对应客户端的Socket，并等待客户端连接
		Socket client = server.accept();
		
		//建立服务器对相应客户端连接的输出流
		PrintStream out = new PrintStream(client.getOutputStream());
		
		//向相应客户的输入内容
		String str = "Hello, I'm server!";
		out.println(str);
		
		//关闭输出流
		out.close();
		
		//断开与客户端的链接
		client.close();
		
		//关闭服务器
		server.close();
	}
}
