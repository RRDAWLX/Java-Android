package LinkList;

public class FirstLastApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLastList fll = new FirstLastList();
		
		fll.insertFirst(1, 3.4);
		fll.insertFirst(2, 4.5);
		fll.insertFirst(3, 6.3);
		
		fll.insertLast(4, 3.8);
		fll.insertLast(5, 0.3);
		fll.insertLast(6, 9.3);
		
		fll.displayList();
		
		fll.deleteFirst();
		fll.deleteFirst();
		
		fll.displayList();
	}

}
