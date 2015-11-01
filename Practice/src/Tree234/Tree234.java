package Tree234;

public class Tree234 {
	private Node root = new Node();
	
	public int find(long key){
		Node curNode = root;
		int childNumber;
		while(true){
			if((childNumber = curNode.findItem(key)) != -1)
				return childNumber;
			else if(curNode.isLeaf())
				return -1;
			else
				curNode = getNextChild(curNode, key);
		}
	}
	
	// insert a DataItem
	public void insert(long value){
		Node curNode = root;
		DataItem newItem = new DataItem(value);
		
		while(true){
			if(curNode.isFull()){
				split(curNode);
				curNode = curNode.getParent();
				curNode = getNextChild(curNode, value);
			}
			else if(curNode.isLeaf())
				break;
			// node is not full, not a leaf, so go to lower level
			else
				curNode = getNextChild(curNode, value);
		}
		curNode.insertItem(newItem);
	}
	
	public void split(Node thisNode){
		// assumes node is full
		DataItem itemB, itemC;
		Node parent, child2, child3;
		int itemIndex;
		
		itemC = thisNode.removeItem();
		itemB = thisNode.removeItem();
		child3 = thisNode.disconnectChild(3);
		child2 = thisNode.disconnectChild(2);
		Node newRight = new Node();
		
		if(thisNode == root){
			root = new Node();
			parent = root;
			root.connectChild(0, thisNode);
		}
		else
			parent = thisNode.getParent();
		
		// deal with parent
		itemIndex = parent.insertItem(itemB);
		int n = parent.getNumItems();
		
		for(int i = n - 1; i > itemIndex; i--){
			Node temp = parent.disconnectChild(i);
			parent.connectChild(i+1, temp);
		}
		
		parent.connectChild(itemIndex+1, newRight);
		
		// deal with newRight
		newRight.insertItem(itemC);
		newRight.connectChild(0, child2);
		newRight.connectChild(1, child3);
	}
	
	// gets appropriate child of node during search for value
	public Node getNextChild(Node theNode, long theValue){
		// assumes node is not empty, not full, not a leaf
		int j;
		int numItems = theNode.getNumItems();
		for(j = 0; j < numItems; j++){
			if(theValue < theNode.getItem(j).data)
				return theNode.getChild(j);
		}
		return theNode.getChild(j);
	}
	
	public void displayTree(){
		recDisplayTree(root, 0, 0);
	}
	
	public void recDisplayTree(Node thisNode, int level, int childNumber){
		System.out.print("level=" + level + " child=" + childNumber + " ");
		thisNode.displayItem();
		
		// call ourselves for each child of this node
		int numItems = thisNode.getNumItems();
		for(int j = 0; j < numItems+1; j++){
			Node nextNode = thisNode.getChild(j);
			if(nextNode != null)
				recDisplayTree(nextNode, level+1, j);
			else			// when thisNode is a leaf
				return;   
		}
	}
}
