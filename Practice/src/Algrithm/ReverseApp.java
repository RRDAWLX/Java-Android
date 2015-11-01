package Algrithm;
import java.io.*;
public class ReverseApp {
	public static void main(String[] args) throws IOException{
		String input, output;
		
		while(true){
			System.out.print("Enter a string:");
			System.out.flush();
			input = getInput();
			if(input == "")
				break;
			else if(input.equals("exit"))
				return;
			Reverser rev = new Reverser(input);
			output = rev.doRev();
			System.out.println("Output: " + output);
		}
	}
	
	public static String getInput() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		return input;
	}
}
