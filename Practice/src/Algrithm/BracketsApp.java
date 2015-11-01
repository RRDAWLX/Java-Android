package Algrithm;
import java.io.*;
public class BracketsApp{
	public static void main(String[] args) throws IOException{
		String input;
		
		while(true){
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getInput();
			if(input.equals(""))
				break;
			BracketChecker bc = new BracketChecker(input);
			bc.check();
		}
	}
	
	public static String getInput() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
}
