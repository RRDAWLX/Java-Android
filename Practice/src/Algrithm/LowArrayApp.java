package Algrithm;

public class LowArrayApp {
	public static void main(String[] args){
		LowArray arr;
		arr = new LowArray(100);
		int nElems = 0;
		int j;
		
		arr.setElem(0,24);
		arr.setElem(1, 54);
		arr.setElem(2, 74);
		arr.setElem(3, 87);
		arr.setElem(4, 29);
		arr.setElem(5, 32);
		arr.setElem(6, 41);
		nElems = 7;
		
		for(j=0; j < nElems; j++)
			System.out.print(arr.getElem(j) + " ");
		System.out.println();
		
		double searchKey = 32;
		for(j=0; j < nElems; j++)
			if(arr.getElem(j) == searchKey)
				break;
		if(j == nElems)
			System.out.println(searchKey + " not found");
		else
			System.out.println(searchKey + " found");
		
		for(j=0; j<nElems; j++)
			if(arr.getElem(j) == 29)
				break;
		for(int k = j; k < nElems-1; k++)
			arr.setElem(k, arr.getElem(k+1));
		nElems--;
		
		for(j=0; j<nElems; j++)
			System.out.print(arr.getElem(j) + " ");
		System.out.println();
	}
}
