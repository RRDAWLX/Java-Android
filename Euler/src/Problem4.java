
public class Problem4 {
	public static void main(String[] args){
		int[] palindrome = new int[50];						//���ڴ洢������
		int[][] nums = new int[50][2];						//���ڴ洢��ɻ���������������
		int n = 0;
		
		for(int i = 999; i > 800; i--){
			for(int j = i; j > 800; j--){
				int num = i * j;
				if(isPalindrome(num)){          	//���palindrome�ǻ����������������array
					palindrome[n] = num;
					nums[n][0] = i;
					nums[n][1] = j;
					n++;
					break;
				}
			}
		}
		
		int maxIndex = 0;
		int maxPalindrome = palindrome[0];
		for(int i = 0; i < n - 1; i++){					//�õ��������������±�
			if(maxPalindrome < palindrome[i]){
				maxPalindrome = palindrome[i];
				maxIndex = i;
			}
		}
		
		System.out.println(palindrome[maxIndex] + " = " + nums[maxIndex][0] 
				+ " * " + nums[maxIndex][1]);
		System.out.print(n);
	}
	
	public static boolean isPalindrome(int m){
		//���m�Ƿ�Ϊ������
		String num = String.valueOf(m);
		int low = 0;
		int high = num.length() - 1;
		while(low < high){
			if(num.charAt(low) != num.charAt(high))
				return false;
			low++;
			high--;
		}
		
		return true;
	}
}
