class StackX {
	private final int SIZE = 20;
	private int[] st;
	private int top;
	
	public StackX(){
		st = new int[20];
		top = -1;
	}
	
	public void push(int j){
		st[++top] = j;
	}
	
	public int pop(){
		return st[top--];
	}
	
	public int peek(){
		return st[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
}

/*class Vertex {
	public char label;
	public boolean wasVisited;
	
	public Vertex(char lab){
		label = lab;
		wasVisited = false;
	}
}*/

class Graph{
	private final int MAX_SIZE = 20;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private StackX theStack;
	
	public Graph(){
		vertexList = new Vertex[MAX_SIZE];
		
		adjMat = new int[MAX_SIZE][MAX_SIZE];
		for(int i=0; i<MAX_SIZE; i++){
			for(int j=0; j<MAX_SIZE; j++){
				adjMat[i][j] = 0;
			}
		}
		
		nVerts = 0;
		theStack = new StackX();
	}
	
	public void addVertex(char lab){
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	
	public void dfs(){
		vertexList[0].wasVisited = true;
		displayVertex(0);
		theStack.push(0);
		
		while(!theStack.isEmpty()){
			int v = getAdjUnvisitedVertex(theStack.peek());
			if(v == -1){
				theStack.pop();
			}
			else{
				displayVertex(v);
				vertexList[v].wasVisited = true;
				theStack.push(v);
			}
		}
		
		for(int i=0; i<nVerts; i++){
			vertexList[i].wasVisited = false;
		}
	}

	private int getAdjUnvisitedVertex(int v) {
		// TODO Auto-generated method stub
		for(int i=0; i<nVerts; i++){
			if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
				return i;
			}
		}
		return -1;
	}
}

public class DFSApp {
	public static void main(String[] args){
		Graph theGraph = new Graph();
		theGraph.addVertex('a');
		theGraph.addVertex('b');
		theGraph.addVertex('c');
		theGraph.addVertex('d');
		theGraph.addVertex('e');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		
		System.out.print("Visits: ");
		theGraph.dfs();
		System.out.println();
	}
}
