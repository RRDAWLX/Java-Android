package Algrithm;

import java.io.IOException;

public class PriorityQApp {
	public static void main(String[] args) throws IOException{
		PriorityQ pq = new PriorityQ(5);
		
		pq.insert(1);
		pq.insert(2);
		pq.insert(4);
		pq.insert(5);
		pq.insert(3);
		
		while(!pq.isEmpty()){
			System.out.print(pq.remove() + " ");
		}
	}
}
