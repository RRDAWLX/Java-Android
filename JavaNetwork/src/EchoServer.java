import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws Exception{
		//����������������8888�˿�
		ServerSocket server = new ServerSocket(8888);
		
		boolean f = true;
		while(f){
			System.out.println("���������У��ȴ��ͻ�������");
			
			//������Ӧ�ͻ���Socket���ȴ��ͻ�����������
			Socket client = server.accept();
			
			//����������
			BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			//���������
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
