package LinkList;

public class FirstLastList {
	private Link first;
	private Link last;
	
	public FirstLastList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int i, double d){
		Link link = new Link(i, d);
		if(first == null)
			last = link;
		link.next = first;
		first = link;
	}
	
	public void insertLast(int i, double d){
		Link link = new Link(i,d);
		if(first == null)
			first = link;
		else
			last.next = link;
		last = link;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		if(first.next == null)
			last = null;
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		System.out.println("List(first --> last):");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
