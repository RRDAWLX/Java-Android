package LinkList;

public class LinkQueue {
	private FirstLastList fll;
	
	public LinkQueue(){
		fll = new FirstLastList();
	}
	
	public boolean isEmpty(){
		return fll.isEmpty();
	}
	
	public void insert(int i){
		fll.insertLast(i, 0);
	}
	
	public int remove(){
		return fll.deleteFirst().iData;
	}
	
	public void display(){
		System.out.print("Queue(front --> rear): ");
		fll.displayList();
	}
}
