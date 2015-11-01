package Recursion;

public class MergeSortApp {
	public static void main(String[] args){
		int maxSize = 10;
		DArray da = new DArray(maxSize);
		
		for(int i = 0; i < 10; i++)
			da.insert((long)(Math.random() * 99));
		
		da.display();
		
		da.mergeSort();
		
		da.display();
	}
}
