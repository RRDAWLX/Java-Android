package LinkList;

public class LinkStackApp {
	public static void main(String[] args){
		LinkStack ls = new LinkStack();
		
		ls.push(20);
		ls.push(30);
		ls.display();
		
		ls.push(40);
		ls.push(50);
		ls.display();
		
		ls.pop();
		ls.display();
	}
}
