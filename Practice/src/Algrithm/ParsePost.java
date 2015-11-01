package Algrithm;

public class ParsePost {
	private IntStack theStack;
	private String input;
	
	public ParsePost(String in){
		input = in;
	}
	
	public int doParse(){
		theStack = new IntStack(20);
		char ch;
		int num1, num2, interAns;
		for(int i = 0; i < input.length(); i++){
			ch = input.charAt(i);
			theStack.displayStack(" " + ch + " ");
			if(ch >= '0' && ch <= '9')
				theStack.push((int)(ch - '0'));
			else{
				num2 = theStack.pop();
				num1 = theStack.pop();
				switch(ch){
				case '+':
					interAns = num1 + num2;
					break;
				case '-':
					interAns = num1 - num2;
					break;
				case '*':
					interAns = num1 * num2;
					break;
				case '/':
					interAns = num1 / num2;
					break;
				default:
					interAns = 0;
				}//end switch
				theStack.push(interAns);
			}//end else
		}//end for
		return theStack.pop();
	}//end doParse()
}
