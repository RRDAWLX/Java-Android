package Algrithm;
import java.io.*;
public class PostfixApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String input;
		int output;
		
		while(true){
			System.out.print("Enter postfix: ");
			System.out.flush();
			input = getString();
			
			if(input == "")
				break;
			
			ParsePost pp = new ParsePost(input);
			output = pp.doParse();
			System.out.println("Evaluate to " + output);
		}
	} // end main()
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}// end getString()

}
