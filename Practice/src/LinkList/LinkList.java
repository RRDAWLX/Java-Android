package LinkList;

public class LinkList {
	private Link first;
	
	public LinkList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int i, double d){
		Link link = new Link(i,d);
		link.next = first;
		first = link;
	}
	
	public Link find(int key){
		Link current = first;
		while(current.iData != key){
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}
	
	public Link delete(int key){
		Link previous = first;
		Link current = first;
		
		while(current.iData != key){
			if(current.next == null)
				return null;
			else{
				previous = current;
				current = current.next;
			}//end else
		}//end while
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link getFirst(){
		return first;
	}
	
	public void setFirst(Link f){
		first = f;
	}
	
	public ListIterator getIterator(){
		return new ListIterator(this);
	}

	public void displayList(){
		Link current = first;
		System.out.println("List(first --> last):");
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
