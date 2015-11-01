import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class EchoClient {
	public static void main(String[] args) throws Exception{
		//��������
		Socket client = new Socket("localhost", 8888);
		
		//������ȡ����������
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//���������
		PrintStream out = new PrintStream(client.getOutputStream());
		
		//�������Է�������������
		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		boolean flag = true;
		while(flag){
			System.out.print("Please input: ");
			String str = in.readLine();   //��ȡ��������
			out.println(str);    //������������Ϣ
			if("bye".equals(str) || "".equals(str) || str == null){
				flag = false;
			}
			else{
				String echo = buf.readLine();
				System.out.println(echo);
			}
		}
		
		//�رո���������
		buf.close();
		out.close();
		in.close();
		client.close();
	}
}
