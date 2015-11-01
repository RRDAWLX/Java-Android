public class Lottery {
	public static void main(String[] args){
		int[] redBall = new int[6];						//生成红球数
		for(int i = 0; i < 6;){
			boolean same = false;
			int temp = (int)(Math.random() * 33 + 1);
			
			for(int j = 0; j <= i; j++){				//判断是否与之前的随机数相同
				if(temp == redBall[j]){
					same = true;
					break;
				}
			}
			
			if(!same){									//将符合要求的随机数加入数组中
				redBall[i] = temp;
				i++;
			}
		} 
		
		rank(redBall);
		
		String redNums = "";
		for(int i = 0; i < 6; i++){
			if(redBall[i] < 10)
				redNums += "0" + redBall[i] + " ";
			else
				redNums += redBall[i] + " ";
		}
		
		int blueBall = (int)(System.currentTimeMillis() % 16 + 1);
		
		System.out.println("红球： " + redNums);
		if(blueBall < 10)
			System.out.println("篮球： " + 0 +blueBall);
		else
			System.out.println("篮球： " + blueBall);
	}
	
	public static void rank(int[] array){					//红球排序
    	for(int i = array.length - 1; i > 0; i--){
    		for(int j = 0; j < i; j++){
    			if(array[j] > array[j + 1]){
    				int temp = array[j];
    				array[j] = array[j + 1];
    				array[j + 1] = temp;
    			}
    		}
    	}
    }
}
