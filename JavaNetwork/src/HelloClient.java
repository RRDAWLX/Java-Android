import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;


public class HelloClient {
	public static void main(String[] args) throws Exception{
		//��������
		Socket client = new Socket("localhost", 8888);
		
		//��ȡ������
		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		//������������
		String str = buf.readLine();
		
		System.out.println(str);
		
		//�ر�������
		buf.close();
		
		//�Ͽ�����
		client.close();
	}
}
