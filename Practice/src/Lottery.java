public class Lottery {
	public static void main(String[] args){
		int[] redBall = new int[6];						//���ɺ�����
		for(int i = 0; i < 6;){
			boolean same = false;
			int temp = (int)(Math.random() * 33 + 1);
			
			for(int j = 0; j <= i; j++){				//�ж��Ƿ���֮ǰ���������ͬ
				if(temp == redBall[j]){
					same = true;
					break;
				}
			}
			
			if(!same){									//������Ҫ������������������
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
		
		System.out.println("���� " + redNums);
		if(blueBall < 10)
			System.out.println("���� " + 0 +blueBall);
		else
			System.out.println("���� " + blueBall);
	}
	
	public static void rank(int[] array){					//��������
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
