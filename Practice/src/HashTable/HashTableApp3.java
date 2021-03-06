package HashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashTableApp3 {
	public static void main(String[] args) throws IOException{
		Link aDataItem;
		int aKey, size, n, keysPerCell;
		
		System.out.print("Enter size of hash table: ");
		size = getInt();
		System.out.println("Enter initial number of items: ");
		n = getInt();
		keysPerCell = 100;
		
		HashTable3 theHashTable = new HashTable3(size);
		
		for(int j = 0; j < n; j++){
			aKey = (int)(Math.random() * size * keysPerCell);
			aDataItem = new Link(aKey);
			theHashTable.insert(aDataItem);
		}
		
		while(true){
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete or find: ");
			char choice = getChar();
			switch(choice){
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key value to insert: ");
				aKey = getInt();
				aDataItem = new Link(aKey);
				theHashTable.insert(aDataItem);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = getInt();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = getInt();
				aDataItem = theHashTable.find(aKey);
				if(aDataItem != null)
					System.out.println("Found " + aKey);
				else
					System.out.println("Could not find " + aKey);
				break;
			default:
				System.out.print("Invalid entry\n");
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
