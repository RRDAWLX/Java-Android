package Algrithm;

public class QueueApp {
	public static void main(String[] args){
		Queue q = new Queue(5);
		
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		
		q.remove();
		q.remove();
		q.remove();
		
		q.insert(70);
		q.insert(80);
		
		while(!q.isEmpty()){
			System.out.print(q.remove() + " ");
		}
	}
}
