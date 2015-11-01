package Algrithm;

import java.io.*;

public class InFixApp {
	public static void main(String[] args) throws IOException{
		String input, output;
		while(true){
			System.out.print("Enter infix: ");
			System.out.flush();
			input = getString();
			
			if(input == "")
				break;
			
			InToPost itp = new InToPost(input);
			output = itp.doTrans();
			System.out.println("Postfix is " + output);
		}// end while
	}// end main()
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		return input;
	}
}
