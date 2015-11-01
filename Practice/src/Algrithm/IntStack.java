package Algrithm;

public class IntStack {
	private int maxSize;
	private int[] arr;
	private int top;
	
	public IntStack(int max){
		maxSize = max;
		arr = new int[maxSize];
		top = -1;
	}
	
	public void push(int n){
		arr[++top] = n;
	}
	
	public int pop(){
		return arr[top--];
	}
	
	public int peek(){
		return arr[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == maxSize;
	}
	
	public int size(){
		return top+1;
	}
	
	public int peekN(int i){
		return arr[i];
	}
	
	public void displayStack(String s){
		System.out.print("Stack (bottom --> top):");
		for(int j = 0; j < size(); j++){
			System.out.print(" " + peekN(j));
		}
		System.out.println();
	}
}