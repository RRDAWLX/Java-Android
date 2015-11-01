package Algrithm;

public class ArrayIns {
	long[] a;
	int nElems;
	
	public ArrayIns(int max){
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	
	public void display(){
		for(int i = 0; i < nElems; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public void insertSort(){
		int out,in;
		for(out = 1; out < nElems; out++){
			in = out;
			long temp = a[in];
			while(in > 0 && a[in-1] > temp){
				a[in] = a[in-1];
				in--;
			}
			a[in] = temp;
		}
	}
	
	public long median(){
		if(nElems == 0)
			return -1;
		else{
			insertSort();
			return a[(nElems-1) / 2];
		}
	}
	
	public void noDups(){
		int dups = 0;
		insertSort();
		for(int i = 1; i < nElems; i++){
			if(a[i] == a[i-1-dups]){
				dups++;
			}
			else{
				a[i-dups] = a[i];
			}
		}
		nElems -= dups;
	}
}
