package Algrithm;

public class ClassDataApp {
	public static void main(String[] args){
		int maxSize = 100;
		ClassDataArray arr = new ClassDataArray(maxSize);
		
		arr.insert("w", "lx", 21);
		arr.insert("l", "f", 21);
		arr.insert("l", "xq", 21);
		arr.insert("h", "a", 21);
		arr.insert("w", "zy", 21);
		arr.insert("l", "j", 23);
		arr.insert("y", "sj", 20);
		
		arr.display();
		
		String search = "l";
		Person found = arr.find(search);
		if(found != null)
			found.displayPerson();
		else
			System.out.println("No such a person");
		
		System.out.println("Delete h");
		arr.delete("h");
		arr.display();
	}
}
