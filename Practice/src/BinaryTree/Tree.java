package BinaryTree;

import java.util.Stack;

public class Tree {
	private Node root;
	
	public void Tree(){
		root = null;
	}
	
	public Node find(int key){
		Node current = root;
		while(current.iData != key){
			if(current.iData < key)
				current = current.rightChild;
			else
				current = current.leftChild;
			if(current == null)
				return null;
		}
		return current;
	}
	
	public void insert(int id, double dd){
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		
		if(root == null){
			root = newNode;
		}
		else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(id < current.iData){
					current = current.leftChild;
					if(current == null){
							parent.leftChild = newNode;
							return;
					}
				}
				else{
					current = current.rightChild;
					if(current == null){
							parent.rightChild = newNode;
							return;
					}
				}
			}
		}
	}
	
	public boolean delete(int key){
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData != key){       //search for node
			parent = current;
			if(key < current.iData){       //go left
				current = current.leftChild;
				isLeftChild = true;
			}
			else{
				current = current.rightChild; //go right
				isLeftChild = false;
			}
			if(current == null)            //end of the line, didn't find
				return false;
		}
		
		//if no children, simply delete it
		if(current.leftChild == null && current.rightChild == null){
			if(current == root)              //if root,
				root = null;          		 //tree is empty
			else if(isLeftChild)
				parent.leftChild = null;	 //disconnect from parent
			else
				parent.rightChild = null;
		}
		
		//if no right child, replace with left subtree
		else if(current.rightChild == null){
			if(current == root)
				root = current.leftChild;
			else if(isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
		}
		
		//if no left child, replace with right subtree
		else if(current.leftChild == null){
			if(current == root)
				root = current.rightChild;
			else if(isLeftChild)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;
		}
		
		//two children, so replace with inorder successor
		else{
			// get successor of node to delete(current)
			Node successor = getSuccessor(current);
			
			//connect parent of currrent to successor instead
			if(current == root)
				root = successor;
			else if(isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			
			//connect successor to current's left child
			successor.leftChild = current.leftChild;
		}//(successor cannot have a left child)
		return true;
	}
	
	//returns node with next-highest value after delNode
	//goes to right child, then right child's left descendents
	private Node getSuccessor(Node delNode){
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		
		while(current != null){
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != delNode.rightChild){
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		
		return successor;
	}
	
	public void traverse(int traverseType){
		switch(traverseType){
		case 1:
			System.out.print("\nPreorder traversal: ");
			preOrder(root);
			break;
		case 2:
			System.out.print("\nInorder traversal: ");
			inOrder(root);
			break;
		case 3:
			System.out.print("\nPostorder traversal: ");
			postOrder(root);
			break;
		}
		System.out.println();
	}
	
	public void preOrder(Node localRoot){
		if(localRoot != null){
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void inOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}
	
	public void postOrder(Node localRoot){
		if(localRoot != null){
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}
	
	public void displayTree(){
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("-------------------------------");
		while(isRowEmpty == false){
			Stack localStack = new Stack();
			isRowEmpty = true;
			
			for(int i = 0; i < nBlanks; i++)
				System.out.print(" ");
			
			while(globalStack.isEmpty() == false){
				Node temp = (Node)globalStack.pop();
				if(temp != null){
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					
					if(temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				}
				else{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
					for(int i = 0; i < nBlanks*2-2; i++)
						System.out.print(" ");
			}//end while globalStack is not empty
			System.out.println();
			nBlanks /= 2;
			while(localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}//end while isRowEmpty is false
		System.out.println("-------------------------------");
	}
}
