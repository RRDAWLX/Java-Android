package LinkList;

public class SortedListApp {
	public static void main(String[] args){
		SortedList sl = new SortedList();
		
		sl.insert(1);
		sl.insert(2);
		sl.displayList();
		
		sl.insert(3);
		sl.insert(4);
		sl.displayList();
		
		sl.remove();
		sl.displayList();
	}
}
