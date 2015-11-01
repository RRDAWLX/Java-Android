
public class Problem5 {
	public static void main(String[] args){
		int num = 1;									//求解
		for(int i = 0; i < 4; i++)
			num *= 2;
		for(int i = 0; i < 2; i++)
			num *= 3;
		num = num * 5 * 7 * 11 * 13 * 17 * 19;
		System.out.println(num);
		
		for(double i = 1.0; i <= 20; i++){				//检验是否为正确答案
			if((num / i - num / (int)i) > 0.001){
				System.out.println(i + "Wrong");
				break;
			}
		}
		
		num = 1;										//求解
		for(int i = 1; i <= 20; i++){
			if(num % i ==0);
			else
				num *= i;
		}
		System.out.println(num);
		
		for(double i = 1.0; i <= 20; i++){				//检验是否为正确答案
			if((num / i - num / (int)i) > 0.001){
				System.out.println(i + "Wrong");
				break;
			}
		}
	}
}
