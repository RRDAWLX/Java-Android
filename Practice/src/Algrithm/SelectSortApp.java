package Algrithm;

public class SelectSortApp {
	public static void main(String[] args){
		int maxSize = 100;
		ArraySel a = new ArraySel(maxSize);
		
		for(int i = 0; i < 10; i++){
			a.insert((int)(Math.random()*100));
		}
		
		a.display();
		a.selectionSort();
		a.display();
	}
}
