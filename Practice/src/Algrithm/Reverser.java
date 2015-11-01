package Algrithm;

public class Reverser {
	private String input;
	private String output;
	
	public Reverser(String in){
		input = in;
	}
	
	public String doRev(){
		int size = input.length();
		StackX s = new StackX(size);
		
		for(int i = 0; i < size; i++){
			s.push(input.charAt(i));
		}
		
		output = "";
		while(!s.isEmpty()){
			char c = s.pop();
			output += c;
		}
		
		return output;
	}
}
