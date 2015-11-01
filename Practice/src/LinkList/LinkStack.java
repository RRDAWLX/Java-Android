package LinkList;

public class LinkStack {
	private LinkList ll;
	
	public LinkStack(){
		ll = new LinkList();
	}
	
	public void push(int i){
		ll.insertFirst(i, 0);
	}
	
	public int pop(){
		return ll.deleteFirst().iData;
	}
	
	public boolean isEmpty(){
		return ll.isEmpty();
	}
	
	public void display(){
		System.out.println("Stack(top --> bottom): ");
		ll.displayList();
	}
}
