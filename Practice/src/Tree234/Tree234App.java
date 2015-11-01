package Tree234;

import java.io.*;

public class Tree234App {
	public static void main(String[] args) throws IOException{
		long value;
		Tree234 theTree = new Tree234();
		
		theTree.insert(50);
		theTree.insert(40);
		theTree.insert(60);
		theTree.insert(30);
		theTree.insert(70);
		while(true){
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, find or exit: ");
			char choice = getChar();
			switch(choice){
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.print("Enter value to insert: ");
				value = getInt();
				theTree.insert(value);
				break;
			case 'f':
				System.out.print("Enter value to find: ");
				value = getInt();
				int found = theTree.find(value);
				if(found != -1)
					System.out.println("Found " + value);
				else
					System.out.println("Could not find " + value);
				break;
			case 'e':
				return;
			default:
				System.out.println("Invalid entry");
			}
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static char getChar() throws IOException{
		return getString().charAt(0);
	}
	
	public static int getInt() throws IOException{
		return Integer.parseInt(getString());
	}
}