/**计算1——100的和的平方和1——100平方和的差*/
public class Problem6 {
	public static void main(String[] args){
		long difference = 0;
		long sumOfSquares = 0;
		long squareOfSum = 0;
		int sum = 0;
		
		for (int i = 1; i <= 100; i++){
			sumOfSquares += i * i;
		}
		
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		
		squareOfSum = sum * sum;
		
		difference = squareOfSum - sumOfSquares;
		System.out.println(difference);
	}
}
