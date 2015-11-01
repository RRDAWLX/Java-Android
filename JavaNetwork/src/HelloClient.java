import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;


public class HelloClient {
	public static void main(String[] args) throws Exception{
		//建立连接
		Socket client = new Socket("localhost", 8888);
		
		//获取输入流
		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		//接受输入内容
		String str = buf.readLine();
		
		System.out.println(str);
		
		//关闭输入流
		buf.close();
		
		//断开链接
		client.close();
	}
}
