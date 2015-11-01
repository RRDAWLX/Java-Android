import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class EchoThread implements Runnable{
	private Socket client = null;
	EchoThread(Socket client){
		this.client = client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			PrintStream out = new PrintStream(client.getOutputStream());
			BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
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
						out.println("Echo:" + str);
					}
				}
			}
			
			buf.close();
			out.close();
		}catch(Exception e){
			
		}
	}
}
