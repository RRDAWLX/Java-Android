package LinkList;

public class DoublyLinkedList {
	private Link first;
	private Link last;
	
	public DoublyLinkedList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int i){
		Link link = new Link(i);
		if(isEmpty())
			last = link;
		else
			first.previous = link;
		link.next = first;
		first = link;
	}
	
	public void insertLast(int i){
		Link link = new Link(i);
		if(isEmpty())
			first = link;
		else
			last.next = link;
		link.previous = last;
		last = link;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		
		if(first.next == null){
			last = null;
			first = null;
		}
		else{
			first = first.next;
			first.previous = null;
		}
		
		return temp;
	}
	
	public Link deleteLast(){
		Link temp = last;
		
		if(last.previous == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		
		return temp;
	}
	
	public boolean insertAfter(int key, int i){
		Link link = new Link(i);
		Link current = first;
		while(current.iData != key){
			current = current.next;
			if(current == null)
				return false;
		}//end while
		if(current == last){
			last = link;
		}
		else{
			current.next.previous = link;
		}
		link.next = current.next;
		link.previous = current;
		current.next = link;
		
		return true;
	}
	
	public Link deleteKey(int i){
		Link current = first;
		while(current.iData != i){
			current = current.next;
			if(current == null)
				return null;
		}//end while
		if(current == first)
			first = current.next;
		else
			current.previous.next = current.next;
		if(current == last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		
		return current;
	}
	
	public void displayForward(){
		System.out.print("List(first --> last):");
		Link current = first;
		while(current != null){
			System.out.print(" " + current.iData);
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward(){
		System.out.print("List(last --> first):"); 
		Link current = last;
		while(current != null){
			System.out.print(" " + current.iData);
			current = current.previous;
		}
		System.out.println();
	}
}
