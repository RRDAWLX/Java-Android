import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class HelloServer {
	public static void main(String[] args) throws Exception{
		//���������������8888�˿�
		ServerSocket server = new ServerSocket(8888);
		
		System.out.println("���������У��ȴ��ͻ�������");
		
		//�����������˶�Ӧ�ͻ��˵�Socket�����ȴ��ͻ�������
		Socket client = server.accept();
		
		//��������������Ӧ�ͻ������ӵ������
		PrintStream out = new PrintStream(client.getOutputStream());
		
		//����Ӧ�ͻ�����������
		String str = "Hello, I'm server!";
		out.println(str);
		
		//�ر������
		out.close();
		
		//�Ͽ���ͻ��˵�����
		client.close();
		
		//�رշ�����
		server.close();
	}
}
