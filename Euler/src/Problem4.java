
public class Problem4 {
	public static void main(String[] args){
		int[] palindrome = new int[50];						//用于存储回文数
		int[][] nums = new int[50][2];						//用于存储组成回文数的两个数字
		int n = 0;
		
		for(int i = 999; i > 800; i--){
			for(int j = i; j > 800; j--){
				int num = i * j;
				if(isPalindrome(num)){          	//如果palindrome是回文数，则加入数组array
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
		for(int i = 0; i < n - 1; i++){					//得到最大回文数和其下标
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
		//检测m是否为回文数
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
