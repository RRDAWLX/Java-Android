package HashTable;

public class SortedList {
	private Link first;
	
	public SortedList(){
		first = null;
	}
	
	public void insert(Link theLink){
		int key = theLink.getKey();
		Link previous = null;
		Link current = first;
		
		while(current != null && key > current.getKey()){
			previous = current;
			current = current.next;
		}
		
		if(previous == null)
			first = theLink;
		else
			previous.next = theLink;
		theLink.next = current;
	}
	
	public void delete(int key){
		Link previous = null;
		Link current = first;
		
		while(current != null && key != current.getKey()){
			previous = current;
			current = current.next;
		}
		
		if(previous == null)
			first = first.next;
		else
			previous.next = current.next;
	}
	
	public Link find(int key){
		Link current = first;
		
		while(current != null && key >= current.getKey()){
			if(key == current.getKey())
				return current;
			current = current.next;
		}
		return null;
	}
	
	public void displayList(){
		System.out.print("List(first-->last):");
		Link current = first;
		while(current != null){
			System.out.print(" " + current.getKey());
			current = current.next;
		}
		System.out.println();
	}
}