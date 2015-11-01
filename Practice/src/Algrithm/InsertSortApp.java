package Algrithm;

public class InsertSortApp {
	public static void main(String[] args){
		int maxSize = 100;
		ArrayIns a = new ArrayIns(maxSize);
		
		for(int i = 0; i < 10; i++){
			a.insert((int)(Math.random()*100));
		}
		
		a.display();
		a.insertSort();
		a.display();
		a.noDups();
		a.display();
	}
}
