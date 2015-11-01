package LinkList;

public class LinkQueueApp {
	public static void main(String[] args){
		LinkQueue lq = new LinkQueue();
		
		lq.insert(10);
		lq.insert(20);
		lq.display();
		
		lq.insert(30);
		lq.insert(40);
		lq.display();
		
		lq.remove();
		lq.remove();
		lq.display();
	}
}
