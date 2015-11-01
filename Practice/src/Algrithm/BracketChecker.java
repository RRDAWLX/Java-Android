package Algrithm;

public class BracketChecker {
	private String input;
	
	public BracketChecker(String in){
		input = in;
	}
	
	public void check(){
		int size = input.length();
		StackX s = new StackX(size);
		
		for(int i = 0; i < size; i++){
			char ch = input.charAt(i);
			switch(ch){
			case '{':
			case '[':
			case '(':
				s.push(ch); break;
			case '}':
			case ']':
			case ')':
				if(!s.isEmpty()){
					char chx = s.pop();
					if(ch == '{' && chx != '}' || ch == '[' && chx != ']' || ch == '(' && chx != ')'){
						System.out.println("Error: " + ch + " at " + i);
					}
				}
				else
					System.out.println("Error: " + ch + " at " + i);
				break;
				default :break;
			}//end switch
		}//end for
		if(!s.isEmpty())
			System.out.println("Error: missing right delimiter");
	}
}
