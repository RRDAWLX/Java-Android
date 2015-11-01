package Recursion;

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
		return recFind(searchKey, 0, nElems - 1);
	}
	
	public int recFind(long searchKey, int lowerBound, int upperBound){
		int curIn;
		curIn = (lowerBound + upperBound) / 2;
		if(arr[curIn] == searchKey)
			return curIn;
		else if (lowerBound > upperBound)
			return nElems;
		else{
			if(arr[curIn] < searchKey)
				return recFind(searchKey, curIn+1, upperBound);
			else
				return recFind(searchKey, lowerBound, curIn-1);
		}
	}
	
	public void insert(long value){
		int j;
		for(j=0; j<nElems; j++)
			if(arr[j] > value)
				break;
		for(int k = nElems; k > j; k--)
			arr[k] = arr[k-1];
		arr[j] = value;
		nElems++;
	}
	
	public void display(){
		for(int i = 0; i < nElems; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
