package Algrithm;

public class ObjectSortApp {
	public static void main(String[] args){
		int maxSize = 10;
		ArrayInOb arr = new ArrayInOb(maxSize);
		
		arr.insert("w", "lx", 21);
		arr.insert("l", "f", 21);
		arr.insert("l", "xq", 21);
		arr.insert("h", "a", 21);
		arr.insert("w", "zy", 21);
		arr.insert("l", "j", 23);
		arr.insert("y", "sj", 20);
		
		System.out.println("Before sort:");
		arr.display();
		
		arr.insertionSort();
		System.out.println("After sort:");
		arr.display();
	}
}
