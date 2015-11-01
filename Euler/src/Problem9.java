
public class Problem9 {
	public static void main(String[] args){
		int a, b, c;
		for(a = 1; a < 333; a++){
			b = 500 - a + 1;
			for(; b < 500; b++){
				c = 1000 - a - b;
				if(a*a + b*b == c*c){
					System.out.print(a*b*c);
					System.exit(0);
				}
			}
		}
	}
}
