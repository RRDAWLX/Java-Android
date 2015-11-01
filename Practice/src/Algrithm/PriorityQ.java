package Algrithm;

public class PriorityQ {
	private long[] arr;
	private int maxSize;
	private int nElems;
	
	public PriorityQ(int max){
		maxSize = max;
		arr = new long[maxSize];
		nElems = 0;
	}
	
	public boolean isFull(){
		return nElems == maxSize;
	}
	
	public boolean isEmpty(){
		return nElems == 0;
	}
	
	public int size(){
		return maxSize;
	}
	
	public void insert(long value){
		if(nElems == 0)
			arr[nElems++] = value;
		else{
			int j;
			for(j = nElems - 1; j >= 0; j--){
				if(arr[j] < value)
					arr[j+1] = arr[j];
				else
					break;
			}
			arr[j+1] = value;
			nElems++;
		}
	}
	
	public long remove(){
		return arr[--nElems];
	}
	
	public long peek(){
		return arr[nElems-1];
	}
}
