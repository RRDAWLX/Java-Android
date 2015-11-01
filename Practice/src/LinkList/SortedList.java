package LinkList;

public class SortedList {
	private Link first;
	
	public SortedList(){
		first = null;
	}
	
	public SortedList(Link[] linkArr){
		first = null;
		for(int i = 0; i < linkArr.length; i++)
			insert(linkArr[i]);
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insert(int i){
		Link link = new Link(i);
		Link previous = null;
		Link current = first;
		while(current != null && current.iData < i){
			previous = current;
			current = current.next;
		}
		if(previous == null)
			first = link;
		else
			previous.next = link;
		link.next = current;
	}
	
	public void insert(Link link){
		Link previous = null;
		Link current = first;
		while(current != null && current.iData < link.iData){
			previous = current;
			current = current.next;
		}
		if(previous == null)
			first = link;
		else
			previous.next = link;
		link.next = current;
	}
	
	public Link remove(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		System.out.println("List(first --> last):");
		Link current = first;
		while(current != null){
			System.out.print(current.iData + " ");
			current = current.next;
		}
		System.out.println();
	}
}
