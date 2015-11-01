package LinkList;

import java.io.*;

public class InterIterApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		LinkList theList = new LinkList();
		ListIterator iter1 = new ListIterator(theList);
		int value;
		
		iter1.insertAfter(1);
		iter1.insertAfter(2);
		iter1.insertAfter(4);
		iter1.insertBefore(3);
		
		while(true){
			System.out.println("Enter first letter of show, reset, next, get, before, after, delete:");
			System.out.flush();
			char choice = getChar();
			switch(choice){
			case 's':
				if(!theList.isEmpty())
					theList.displayList();
				else
					System.out.println("The list is empty");
				break;
			case 'r':
				iter1.reset();
				break;
			case 'n':
				if(!theList.isEmpty() && !iter1.atEnd())
					iter1.nextLink();
				else
					System.out.println("Can't go to next link");
				break;
			case 'g':
				if(!theList.isEmpty())
					System.out.println("returned " + iter1.getCurrent().iData);
				else
					System.out.println("The list is empty");
				break;
			case 'b':
				System.out.print("Enter a int: ");
				System.out.flush();
				iter1.insertBefore(getInt());
				break;
			case 'a':
				System.out.print("Enter a int: ");
				System.out.flush();
				iter1.insertAfter(getInt());
				break;
			case 'd':
				if(!theList.isEmpty())
					System.out.println("Deleted " + iter1.deleteCurrent());
				else
					System.out.println("The list is empty, can'n delete");
				break;
			default:
				System.out.println("Invalid entry");
			}//end switch
		}//end while
	}//end main()

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static char getChar() throws IOException{
		char ch = getString().charAt(0);
		return ch;
	}
	
	public static int getInt() throws IOException{
		int i = Integer.parseInt(getString());
		return i;
	}
}
