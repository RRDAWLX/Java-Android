package Recursion;

import java.io.*;

public class TriangleApp {
	static int theNumber;
	
	public static void main(String[] args) throws IOException{
		while(true){
		System.out.print("Enter a number:");
		System.out.flush();
		theNumber = getInt();
		int answerNumber = triangle(theNumber);
		System.out.println("Triangle = " + answerNumber);
		}
	}

	private static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	private static int getInt() throws IOException{
		// TODO Auto-generated method stub
		return Integer.parseInt(getString());
	}

	private static int triangle(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return 1;
		else
			return (n + triangle(n-1));
	}
}
