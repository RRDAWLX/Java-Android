package Recursion;

public class BinarySearchApp {
	public static void main(String[] args){
		int maxSize = 100;
		OrdArray arr = new OrdArray(maxSize);
		
		for(int i = 0; i < 100; i++)
			arr.insert((long)(Math.random() * 100));
		arr.display();
		
		long searchKey = 45;
		if(arr.find(searchKey) == arr.size())
			System.out.println("Can't find");
		else
			System.out.println("Can find");
	}
}
