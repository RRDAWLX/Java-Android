package Algrithm;

public class ClassDataArray {
	private Person[] arr;
	private int nElems;
	
	public ClassDataArray(int max){
		arr = new Person[max];
		nElems = 0;
	}
	
	public Person find(String lastName){
		for(int j = 0; j < nElems; j++){
			if(arr[j].getLastName().equals(lastName))
				return arr[j];
		}
		return null;
	}
	
	public void insert(String lastName, String firstName, int age){
		arr[nElems] = new Person(lastName, firstName, age);
		nElems++;
	}
	
	public boolean delete(String lastName){
		int j;
		for(j = 0; j < nElems; j++)
			if(arr[j].getLastName().equals(lastName))
				break;
		if(j == nElems)
			return false;
		else{
			for(; j < nElems - 1; j++)
				arr[j] = arr[j+1];
			nElems--;
			return true;
		}
	}
	
	public void display(){
		for(int i = 0; i < nElems; i++)
			arr[i].displayPerson();
	}
}
