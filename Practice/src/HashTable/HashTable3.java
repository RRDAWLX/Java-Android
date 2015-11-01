package HashTable;

public class HashTable3 {
	private SortedList[] hashArray;
	private int arraySize;
	
	public HashTable3(int size){
		arraySize = size;
		hashArray = new SortedList[arraySize];
		for(int i = 0; i < arraySize; i++)
			hashArray[i] = new SortedList();
	}
	
	public void displayTable(){
		for(int i = 0; i < arraySize; i++){
			System.out.print(i + ". ");
			hashArray[i].displayList();
		}
	}
	
	public int hashFunc(int key){
		return key % arraySize;
	}
	
	public void insert(Link theLink){
		int key = theLink.getKey();
		int hashVal = hashFunc(key);
		hashArray[hashVal].insert(theLink);
	}
	
	public void delete(int key){
		int hashVal = hashFunc(key);
		hashArray[hashVal].delete(key);
	}
	
	public Link find(int key){
		int hashVal = hashFunc(key);
		Link theLink = hashArray[hashVal].find(key);
		return theLink;
	}
}
