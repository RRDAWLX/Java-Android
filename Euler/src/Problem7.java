
public class Problem7 {
	public static void main(String args[]){
		int i = 1;
		int num = 2;
		while(i < 10001){
			num++;
			if(isPrime(num))
				i++;
		}
		System.out.println(num);
	}
	
	static boolean isPrime(int num){
		int j = (int)Math.sqrt(num);
		for(int i=2; i <= j; i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
