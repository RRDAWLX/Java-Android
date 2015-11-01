package Algrithm;

public class InToPost {
	private CharStack theStack;
	private String input;
	private String output;
	
	public InToPost(String s){
		int stackSize = s.length();
		theStack = new CharStack(stackSize);
		input = s;
		output = "";
	}
	
	public String doTrans(){
		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			theStack.displayStack("For " + ch + " ");
			switch(ch){
			case '(' :
				theStack.push(ch);
				break;
			case ')' :
				gotParen(ch);
				break;
			case '+':
			case '-':
				gotOper(ch, 1);
				break;
			case '*':
			case '/':
				gotOper(ch, 2);
				break;
			default:
				output += ch;
				break;
			} //end switch
		} //end for
		
		while(!theStack.isEmpty()){
			theStack.displayStack("while ");
			output += theStack.pop();
		}
		theStack.displayStack("End ");
		return output;
	} // end doTrans
	
	public void gotOper(char opThis, int prec1){
		while(!theStack.isEmpty()){
			char opTop = theStack.pop();
			
			if(opTop == '('){
				theStack.push(opTop);
				break;
			}
			else{
				int prec2;
				if(opTop == '+' || opTop == '-'){
					prec2 = 1;
				}
				else{
					prec2 = 2;
				}
				
				if(prec1 > prec2){
					theStack.push(opTop);
					break;
				}
				else{
					output += opTop;
				}
			}//end else
		}//end while
		theStack.push(opThis);
	}//end gotOper()
	
	public void gotParen(char ch){
		while(!theStack.isEmpty()){
			char c = theStack.pop();
			if(c == '(')
				break;
			else
				output += c;
		}
	}// end gotParen()
}