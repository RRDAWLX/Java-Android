package LinkList;

public class DoublyLinkedApp {
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertFirst(2);
		dll.insertFirst(4);
		dll.insertFirst(6);
		dll.displayForward();
		
		dll.insertLast(1);
		dll.insertLast(3);
		dll.insertLast(5);
		dll.displayForward();
		
		dll.insertAfter(4, 8);
		dll.insertAfter(5, 7);
		dll.displayForward();
		
		dll.deleteFirst();
		dll.deleteLast();
		dll.deleteKey(1);
		dll.displayForward();
		dll.displayBackward();
	}
}
