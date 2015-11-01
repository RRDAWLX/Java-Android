package Tree234;

public class Node {
	private static final int ORDER = 4;
	private int numItems;
	private Node parent;
	private Node[] childArray = new Node[ORDER];
	private DataItem[] itemArray = new DataItem[ORDER - 1];
	
	// connect child to this node
	public void connectChild(int childNum, Node child){
		childArray[childNum] = child;
		if(child != null)
			child.parent = this;   //???parent是私有变量
	}
	
	// disconnect child form this node, return it 
	public Node disconnectChild(int childNum){
		Node tempNode = childArray[childNum];
		childArray[childNum] = null;
		return tempNode;
	}
	
	public Node getChild(int childNum){
		return childArray[childNum];
	}
	
	public Node getParent(){
		return parent;
	}
	
	public boolean isLeaf(){
		return (childArray[0] == null) ? true : false;
	}
	
	public int getNumItems(){
		return numItems;
	}
	
	public DataItem getItem(int index){
		return itemArray[index];
	}
	
	public boolean isFull(){
		return (numItems == ORDER - 1) ? true : false;
	}
	
	// return index of item (within node) if found, otherwise, return -1
	public int findItem(long key){
		for(int i = 0; i < ORDER - 1; i++){
			if(itemArray[i] == null)
				break;
			else if(itemArray[i].data == key)
				return i;
		}
		return -1;
	}
	
	public int insertItem(DataItem newItem){
		// assumes node is not full
		numItems++;
		long newKey = newItem.data;
		
		for(int i = ORDER - 2; i >= 0; i--){
			if(itemArray[i] == null)
				continue;
			else{
				long itsKey = itemArray[i].data;
				if(newKey < itsKey)
					itemArray[i+1] = itemArray[i];
				else{
					itemArray[i+1] = newItem;
					return i;
				}
			}
		}
		itemArray[0] = newItem;
		return 0;
	}
	
	public DataItem removeItem(){
		//assumes node is not empty
		DataItem temp = itemArray[numItems-1];
		itemArray[numItems-1] = null;
		numItems--;
		return temp;
	}
	
	public void displayItem(){
		for(int i = 0; i < numItems; i++)
			System.out.print("/" + itemArray[i].data);
		System.out.println("/");
	}
}