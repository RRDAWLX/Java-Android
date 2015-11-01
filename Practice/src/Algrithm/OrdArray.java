package Algrithm;

public class OrdArray {
	private long[] arr;
	private int nElems;
	
	public OrdArray(int max){
		arr = new long[max];
		nElems = 0;
	}
	
	public int size(){
		return nElems;
	}
	
	public int find(long searchKey){
		int low = 0;
		int high = nElems - 1;
		int mid;
		
		while(true){
			mid = (low + high) / 2;
			if(arr[mid] == searchKey)
				return mid;
			else if(low > high)
					return nElems;
			else{
				if(arr[mid] < searchKey)
					low = mid + 1;
				else
					high = mid - 1;
				}
		}
	}
	
	public void insert(long value){
		/**int j;
		for(j = 0; j <nElems; j++)
			if(arr[j] > value)
				break;
		for(int k = nElems; k > j; k--)
			arr[k] = arr[k - 1];
		arr[j] = value;
		nElems++;*/
		
		int low = 0;
		int high = nElems - 1;
		int mid;
		
		while(low < high){
			mid = (low + high) / 2;
			if(arr[mid] < value)
				low = mid + 1;
			else
				high = mid - 1;
		}
		
		for(int k = nElems; k > low; k--)
			arr[k] = arr[k-1];
		arr[low] = value;
		nElems++;
	}
	
	public boolean delete(long value){
		/**int j = find(value);
		if(j == nElems)
			return false;
		else{
			for(int k = j;k < nElems - 1; k++)
				arr[k] = arr[k+1];
			nElems--;
			return true;
		}*/
		
		int low = 0;
		int high = nElems - 1;
		int mid;
		
		while(true){
			mid = (low + high) / 2;
			if(arr[mid] == value){
				for(int k = mid; k < nElems - 1; k++)
					arr[k] = arr[k + 1];
				nElems--;
				return true;
			}
			else if(low > high)
				return false;
			else{
				if(arr[mid] < value)
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
	}

	public void display(){
		for(int j = 0; j < nElems; j++ )
			System.out.print(arr[j] + " ");
		System.out.println();
	}
	
	public void merge(long[] A, long[] B){
	}
}
