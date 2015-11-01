public class Euler {
	public static void main(String[] args){
		int n = 0;
		for(int i = 100; i < 1000; i++){
			if(i % 3 == 1){
				if(i % 5 == 4 || i % 8 == 4){
					System.out.println(i);
					n++;
				}
			}
		}
		System.out.println(n);
	}
}
