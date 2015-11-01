package Recursion;

public class MergeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = {23,47,81,95};
		int[] arrayB = {7,14,39,55,62,74};
		int[] arrayC = new int[10];
		
		merge(arrayA, arrayB, arrayC);
		display(arrayC);
	}
	
	public static void merge(int[] arrA, int[] arrB, int[] arrC){
		int aDex = 0, bDex = 0, cDex = 0;
		while(aDex < arrA.length && bDex < arrB.length){
			if(arrA[aDex] < arrB[bDex])
				arrC[cDex++] = arrA[aDex++];
			else
				arrC[cDex++] = arrB[bDex++];
		}
		
		if(aDex == arrA.length)
			while(bDex < arrB.length)	
				arrC[cDex++] = arrB[bDex++];
		else
			while(aDex < arrA.length)
				arrC[cDex++] = arrA[aDex++];
	}
	
	public static void display(int[] arr){
		System.out.print(arr.toString() + ": ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
