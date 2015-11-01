
public class Search {
	//顺序查找
	int SeqSearch(LineList R[], int n, int k){
		int i = 0;
		while(i < n && R[i].key != k) i++;
		if(i > n)
			return -1;
		else
			return i;
	}
	
	//二分查找
	int BinSearch(LineList R[], int n, int k){
		int i = -1, low = 0,  high = n - 1, mid;
		boolean find = false;         // find=flase表示为找到，find=true表示已找到
		while(low <= high && !find){
			mid = (low + high) / 2;
			if(k < R[mid].key)
				high = mid -1;
			else if(k > R[mid].key)
				low = mid + 1;
			else{
				i = mid;
				find = true;
			}
		}
		return i;
	}
	
	//分块查找
	int BlkSearch(LineList R[], IDXType idx[], int m, int k){
		int low = 0, high = m - 1, mid, i = 0, j = 0;
		boolean find = false;
		while(low <= high && !find){
			mid = (low + high) / 2;
			if(k < idx[mid].key)
				high = mid -1;
			else if(k > idx[mid].key)
				low = mid + 1;
			else{
				high = mid - 1;
				find = true;
			}
		}
		
		if(low < m){
			i = idx[low].low;
			j = idx[low].high;
		}
		
		while(i <= j && R[i].key != k)
			i++;
		if(i > j)
			return -1;
		else 
			return i;
	}
	
}
