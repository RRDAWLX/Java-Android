package Algrithm;

public class ArrayBub {
	long[] a;
	int nElems;
	
	public ArrayBub(int max){
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
	
	/**public void bubbleSort(){
		int out, in;
		for(out=nElems-1; out > 0; out--){
			for(in=0; in < out; in++){
				if(a[in] > a[in+1]){
					long temp = a[in];
					a[in] = a[in+1];
					a[in+1] = temp;
				}
			}
		}
	}*/
	
	public void bubbleSort(){
		int left, right, in;
		left = 0;
		right = nElems - 1;
		while(left < right){
			for(in = left; in < right; in++){
				if(a[in] > a[in+1]){
					long temp = a[in];
					a[in] = a[in+1];
					a[in+1] = temp;
				}
			}
			right--;
			for(in = right; in > left; in--){
				if(a[in] < a[in-1]){
					long temp = a[in];
					a[in] = a[in-1];
					a[in-1] = temp;
				}
			}
			left++;
		}
	}
	
	public int oddEvenSort(){
		int times = 0;
		while(true){
			boolean odd = false, even = false;
			
			for(int i = 0; i < nElems - 1; i=i+2){
				if(a[i] > a[i+1]){
					long temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					odd = true;
				}
			}
			
			for(int i = 1; i < nElems - 1; i=i+2){
				if(a[i] > a[i+1]){
					long temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					even = true;
				}
			}
			
			if((odd && even) || (!odd & even)){
				times = times + 2;
			}
			else if(!odd && !even)
				return times;
			else{
				times++;
				return times;
			}
		}
	}
}
