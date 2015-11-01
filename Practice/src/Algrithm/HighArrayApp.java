package Algrithm;

public class HighArrayApp {
	public static void main(String[] args){
		int maxSize = 100;
		
		HighArray arr = new HighArray(maxSize);
		
		arr.insert(39);
		arr.insert(23);
		arr.insert(83);
		arr.insert(20);
		arr.insert(42);
		
		arr.display();
		
		HighArray ordArr = new HighArray(maxSize);
		ordArr.display();
		while(true){
			long max = arr.removeMax();
			if(max == -1) break;
			ordArr.insert(max);
		}
		ordArr.display();
	}
}
