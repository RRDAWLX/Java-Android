package Algrithm;

public class OrdArrayApp {
	public static void main(String[] args){
		int maxSize = 100;
		OrdArray arr = new OrdArray(maxSize);
		
		arr.insert(93); arr.display();
		arr.insert(34);
		arr.insert(38);
		arr.insert(53);
		arr.insert(32);
		arr.insert(34);
		
		arr.display();
		
		int searchKey = 34;
		if(arr.find(searchKey) == arr.size())
			System.out.println("can not find " + searchKey);
		else
			System.out.println("can find " + searchKey);
		
		arr.delete(34);
		arr.display();
		
	}
}
