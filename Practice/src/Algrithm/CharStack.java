package Algrithm;

public class CharStack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public CharStack(int max){
		maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char ch){
		stackArray[++top] = ch;
	}
	
	public char pop(){
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int size(){
		return top+1;
	}
	
	public char peekN(int n){
		return stackArray[n];
	}
	
	public void displayStack(String s){
		System.out.print(s);
		System.out.print("Stack (bottom --> top): ");
		for(int i = 0; i < size(); i++){
			System.out.print(peekN(i) + " ");
		}
		System.out.println();
	}
}
