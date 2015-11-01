package Sorting;

public class Sort {
	/**
	 * Simple insertion sort
	 */
	public static <AnyType extends Comparable<? super AnyType>> void insertionSort(AnyType [] a){
		for(int p = 1; p < a.length; p++){
			AnyType tmp = a[p];
			int j = p;
			
			for( ; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}
	
	/**
	 * Shellsort, using a sequence suggested by Gonnet.
	 */
	public static <AnyType extends Comparable<? super AnyType>> void shellSort(AnyType[] a){
		//除以2.2而不是2，其在实践中表现良好，但没有理论基础。
		for(int gap = a.length / 2; gap >0; gap = gap == 2 ? 1 : (int)(gap / 2.2))
			for(int i = gap; i < a.length; i++){
				AnyType tmp = a[i];
				int j = i;
				
				for( ; j >= gap && tmp.compareTo(a[j - gap]) < 0; j -= gap)
					a[j] = a[j - gap];
				a[j] = tmp;
			}
	}
	
	/**
	 * Mergesort algorithm.
	 * @param a an array of Comparable items.
	 */
	public static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a){
		AnyType[] tmpArray = (AnyType [])new Comparable[a.length];
		mergeSort(a, tmpArray, 0, a.length - 1);
	}
	
	/**
	 * Internal method that makes recursive calls.
	 * @param a an array of Comparable items.
	 * @param tmpArray an array to place the merged result.
	 * @param left the left-most index of the subarray.
	 * @param right the right-most index of the subarray.
	 */
	private static <AnyType extends Comparable<? super AnyType>> 
	void mergeSort(AnyType[] a, AnyType[] tmpArray, int left, int right){
		if(left < right){
			int center = (left + right) / 2;
			mergeSort(a, tmpArray, left, right);
			mergeSort(a, tmpArray, center + 1, right);
			merge(a, tmpArray, left, center + 1, right);
		}
	}
	
	/**
	 *Internal method that merges two sorted halves of a subarray.
	 * @param a an array of Comparable items.
	 * @param tmpArray an array to place the merged result.
	 * @param leftPos the left-most index of the subarray.
	 * @param rightPos the index of the start of the second half.
	 * @param rightEnd the right-most index of the subarray.
	 */
	private static <AnyType extends Comparable<? super AnyType>>
	void merge(AnyType[] a, AnyType[] tmpArray, int leftPos, int rightPos, int rightEnd){
		int leftEnd = rightPos -1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		
		//Main loop
		while(leftPos <= leftEnd && rightPos <= rightEnd)
			if(a[leftPos].compareTo(a[rightPos]) <= 0)
				tmpArray[tmpPos++] = a[leftPos++];
			else 
				tmpArray[tmpPos++] = a[rightPos++];
		
		while(leftPos <= leftEnd)
			tmpArray[tmpPos++] = a[leftPos++];
		while(rightPos <= rightPos)
			tmpArray[tmpPos++] = a[rightPos++];
		
		//Copy tmpArray back
		for(int i = 0; i < numElements; i++, rightEnd--){
			a[rightEnd] = tmpArray[rightEnd];
		}
	}
	
	/**
	 * Quicksort algorithm (driver)
	 */
	public static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] a){
		quickSort(a, 0, a.length - 1);
	}
	
	/**
	 * Internal quicksort method that makes recursive calls.
	 * Uses median-of-three partitioning and a cutoff.
	 */
	private static <AnyType extends Comparable<? super AnyType>> 
	void quickSort(AnyType[] a, int low, int high){}
}
