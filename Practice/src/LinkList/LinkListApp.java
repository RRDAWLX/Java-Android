package LinkList;

public class LinkListApp {
	public static void main(String[] args){
		LinkList list = new LinkList();
		
		list.insertFirst(1, 4.35);
		list.insertFirst(2, 5.36);
		list.insertFirst(3, 8.39);
		list.insertFirst(4, 9.89);
		
		list.displayList();
		
		Link f = list.find(2);
		if(f != null)
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can not find link");
		
		Link d = list.delete(3);
		if(d != null)
			System.out.println("Deleted link with key " + d.iData);
		else
			System.out.println("Can not delete link");
		
		list.displayList();
	}
}
