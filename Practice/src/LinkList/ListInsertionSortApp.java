package LinkList;

public class ListInsertionSortApp {
	public static void main(String[] args){
		int size = 10;
		Link[] arr = new Link[size];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = new Link((int)(Math.random() * 99));
		
		System.out.print("Unsorted array:");
		for(int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i].iData);
		System.out.println();
		
		SortedList sl = new SortedList(arr);
		for(int i = 0; i < arr.length; i++)
			arr[i] = sl.remove();
		
		System.out.print("Sorted list:");
		for(int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i].iData);
		System.out.println();
	}
}
