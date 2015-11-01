package Recursion;
import java.io.*;

class StackX2{
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public StackX2(int s){
		maxSize = s;
		stackArray = new int[s];
		top = -1;
	}
	
	public void push(int p){
		stackArray[++top] = p;
	}
	
	public int pop(){
		return stackArray[top--];
	}
	
	public int peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
}

public class StackTriangle2App {
	static int theNumber;
	static int theAnswer;
	static StackX2 theStack;
	
	public static void main(String[] args) throws IOException{
		while(true){
		System.out.print("Enter a number: ");
		theNumber = getInt();
		stackTriangle();
		System.out.println("Triangle = " + theAnswer);
		}
	}
	
	public static void stackTriangle(){
		theStack = new StackX2(1000);
		
		theAnswer = 0;
		
		while(theNumber > 0)
			theStack.push(theNumber--);
		while(!theStack.isEmpty())
			theAnswer += theStack.pop();
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static int getInt() throws IOException{
		return Integer.parseInt(getString());
	}
}
