package Algrithm;

public class Queue {
	private long[] arr;
	private int nElems;
	private int maxSize;
	private int front, rear;
	
	public Queue(int max){
		maxSize = max;
		arr = new long[maxSize];
		nElems = 0;
		front = 0;
		rear = -1;
	}
	
	public boolean isFull(){
		return nElems == maxSize;
	}
	
	public boolean isEmpty(){
		return nElems == 0;
	}
	
	public int size(){
		return maxSize;
	}
	
	public void insert(long value){
		if(!isFull()){
			rear = (rear+1) % maxSize;
			arr[rear] = value;
			nElems++;
		}
	}
	
	public long remove(){
		long temp = arr[front];
		front = (front + 1) % maxSize;	
		nElems--;
		return temp;
	}
	
	public long peekFront(){
		return arr[front];
	}
}
