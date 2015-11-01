package LinkList;

public class ListIterator {
	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list){
		ourList = list;
		reset();
	}

	public void reset(){
		current = ourList.getFirst();
		previous = null;
	}
	
	public boolean atEnd(){
		return current.next == null;
	}
	
	public void nextLink(){
		previous = current;
		current = current.next;
	}
	
	public Link getCurrent(){
		return current;
	}
	
	public void insertAfter(int i){
		Link newLink = new Link(i);
		if(ourList.isEmpty()){
			ourList.setFirst(newLink);
			current = newLink;
		}
		else{
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	
	public void insertBefore(int i){
		Link newLink = new Link(i);
		
		if(previous == null){
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}
		else{
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public int deleteCurrent(){
		int i = current.iData;
		if(previous == null){
			ourList.setFirst(current.next);
			reset();
			return i;
		}
		else{
			previous.next = current.next;
			if(atEnd())
				reset();
			else
				current = current.next;
			return i;
		}
	}
}
