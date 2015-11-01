
public class Problem3 {
	public static void main(String args[]){
		long num = 600851475143l;
		int i;
		long j = (long)Math.sqrt(num);
		for(i=2; i<=j; i++){
			if(num % i == 0){
				num = num / i;
				j = (long)Math.sqrt(num);
			}
		}		
		System.out.println(num);
	}
}
