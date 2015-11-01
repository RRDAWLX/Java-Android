package Recursion;
import java.io.*;

class Params{
	public int n;
	public int returnAddress;
	
	public Params(int nn, int ra){
		n = nn;
		returnAddress = ra;
	}
}

class StackX{
	private int maxSize;
	private Params[] stackArray;
	private int top;
	
	public StackX(int max){
		maxSize = max;
		stackArray = new Params[maxSize];
		top = -1;
	}
	
	public void push(Params p){
		stackArray[++top] = p;
	}
	
	public Params pop(){
		return stackArray[top--];
	}
	
	public Params peek(){
		return stackArray[top];
	}
}

public class StackTriangleApp {
	static int theNumber;
	static int theAnswer;
	static StackX theStack;
	static int codePart;
	static Params theseParams;
	
	public static void main(String[] args) throws IOException{
		while(true){
		System.out.print("Enter a number: ");
		theNumber = getInt();
		recTriangle();
		System.out.println("Triangle = " + theAnswer);
		}
	}
	
	public static void recTriangle(){
		theStack = new StackX(10000);
		codePart = 1;
		while(step() == false);
	}
	
	public static boolean step(){
		switch(codePart){
		case 1:
			theseParams = new Params(theNumber, 6);
			theStack.push(theseParams);
			codePart = 2;
			break;
		case 2:
			theseParams = theStack.peek();
			if(theseParams.n == 1){
				theAnswer = 1;
				codePart = 5;
			}
			else
				codePart = 3;
			break;
		case 3:
			Params newParams = new Params(theseParams.n - 1, 4);
			theStack.push(newParams);
			codePart = 2;
			break;
		case 4:
			theseParams = theStack.peek();
			theAnswer = theAnswer + theseParams.n;
			codePart = 5;
			break;
		case 5:
			theseParams = theStack.peek();
			codePart = theseParams.returnAddress;
			theStack.pop();
			break;
		case 6:
			return true;
		}//end switch
		return false;
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static int getInt() throws IOException{
		return Integer.parseInt(getString());
	}
}