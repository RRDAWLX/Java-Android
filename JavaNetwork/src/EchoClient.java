import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class EchoClient {
	public static void main(String[] args) throws Exception{
		//建立连接
		Socket client = new Socket("localhost", 8888);
		
		//建立获取键盘输入流
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//建立输出流
		PrintStream out = new PrintStream(client.getOutputStream());
		
		//建立来自服务器的输入流
		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		boolean flag = true;
		while(flag){
			System.out.print("Please input: ");
			String str = in.readLine();   //获取键盘输入
			out.println(str);    //向服务器输出信息
			if("bye".equals(str) || "".equals(str) || str == null){
				flag = false;
			}
			else{
				String echo = buf.readLine();
				System.out.println(echo);
			}
		}
		
		//关闭各连接与流
		buf.close();
		out.close();
		in.close();
		client.close();
	}
}
