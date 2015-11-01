package Algrithm;

public class StackX {
	private int maxSize;
	private char[] a;
	private int top;
	
	public StackX(int max){
		maxSize = max;
		a =new char[maxSize];
		top = -1;
	}
	
	public void push(char value){
		a[++top] = value;
	}
	
	public char pop(){
		return a[top--];
	}
	
	public char peek(){
		return a[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == maxSize;
	}
}
