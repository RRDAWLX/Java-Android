//计算小于2,000,000的所有质数的和

public class Problem10 {
	public static void main(String[] args){
		long sum = 0;
		long num = 2;
		while(num < 2000000){
			if(isPrime(num))
				sum += num;
			num++;
		}
		
		System.out.println(sum);
	}
	
	static boolean isPrime(long num){
		long j = (long)Math.sqrt(num);
		for(long i = 2; i <= j; i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
