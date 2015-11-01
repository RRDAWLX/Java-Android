import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws Exception{
		//建立服务器，监听8888端口
		ServerSocket server = new ServerSocket(8888);
		
		boolean f = true;
		while(f){
			System.out.println("服务器运行，等待客户端连接");
			
			//建立对应客户的Socket，等待客户端请求连接
			Socket client = server.accept();
			
			//建立输入流
			BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			//建立输出流
			PrintStream out = new PrintStream(client.getOutputStream());
			
			boolean flag = true;
			while(flag){
				String str = buf.readLine();
				if(str == null || "".equals(str)){
					flag = false;
				}
				else{
					if("bye".equals(str)){
						flag = false;
					}
					else{
						out.println("ECHO:" +str);
					}
				}
			}
			out.close();
			buf.close();
			client.close();
		}
		server.close();
	}
}
