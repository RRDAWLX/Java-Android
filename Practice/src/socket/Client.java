package socket;

import java.io.*;
import java.net.*;

public class Client{
	public static void main(String[] args){
		try{
			Socket client = new Socket("192.168.1.102", 4600);
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter os = new PrintWriter(client.getOutputStream());
			BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			System.out.print("Client: ");
			String line = sin.readLine(); 
			
			while(!line.equals("yes")){
				os.println(line);
				os.flush();
				System.out.println(is.readLine());
				System.out.print("Client: ");
				line = sin.readLine();
			}
			
			os.println("yes");
			
			os.close();
			is.close();
			client.close();
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
}