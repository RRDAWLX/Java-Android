
public class Person {
	public static void main(String[] args){
		Person A = new Person("A");
		Person B = new Person("B");
		
		A.tell(B, "How Are You?");
	}
	
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void tell(Person p, String str){
		System.out.println("I am " + this.name + ", I say " + str);
		p.hear(str);
	}
	
	public void hear(String str){
		System.out.println("I am " + this.name + ", I hear " + str);
	}
}
