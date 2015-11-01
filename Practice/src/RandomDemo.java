import java.util.Random;


public class RandomDemo {
	public static void main(String[] args){
		printLuckyNums();
	}
	
	public static void printLuckyNums(){
		for(int i=0; i<6; i++)
			System.out.print(getLuckyNum(33) + " ");
		System.out.println(getLuckyNum(16));
	}
	
	public static int  getLuckyNum(int n){
		Random random = new Random();
		return random.nextInt(n)+1;
	}
}
