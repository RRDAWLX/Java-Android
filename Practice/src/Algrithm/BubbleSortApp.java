package Algrithm;

public class BubbleSortApp {
	public static void main(String[] args){
		int maxSize = 100;
		ArrayBub a = new ArrayBub(maxSize);
		
		for(int i = 0; i < 10; i++){
			a.insert((int)(Math.random()*100));
		}
		
		a.display();
		int times = a.oddEvenSort();
		a.display();
		System.out.println("Times: " + times);
	}
}
