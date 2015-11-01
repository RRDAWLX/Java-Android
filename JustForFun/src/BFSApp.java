class Vertex{
	public char label;
	public boolean wasVisited;
	
	Vertex(char lab){
		label = lab;
		wasVisited = false;
	}
}

class Queue{
	private final int SIZE = 20;
	private int[] queue;
	private int front;
	private int rear;
	
	Queue(){
		queue = new int[SIZE];
		front = 0;
		rear = -1;
	}
	
	public void insert(int v){
		if(rear == SIZE-1){
			rear = -1;
		}
		queue[++rear] = v;
	}
	
	public int remove(){
		int v = queue[front++];
		if(front == SIZE){
			front = 0;
		}
		return v;
	}
	
	public boolean isEmpty(){
		return (front == rear+1 || front+SIZE-1 == rear);
	}
}

class GraphB{
	private final int MAX_SIZE = 20;
	private Vertex[] vertexList;
	private int nVerts;
	private int[][] adjMat;
	private Queue theQueue;
	
	GraphB(){
		vertexList = new Vertex[MAX_SIZE];
		nVerts = 0;
		adjMat = new int[MAX_SIZE][MAX_SIZE];
		for(int i=0; i<MAX_SIZE; i++){
			for(int j=0; j<MAX_SIZE; j++){
				adjMat[i][j] = 0;
			}
		}
		theQueue = new Queue();
	}
	
	public void addVertex(char label){
		vertexList[nVerts++] = new Vertex(label);
	}
	
	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public int getAdjUnvisitedVertex(int v){
		for(int i=0; i<nVerts; i++){
			if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
				return i;
			}
		}
		return -1;
	}

	public void bfs(){
		System.out.print(vertexList[0].label);
		vertexList[0].wasVisited = true;
		theQueue.insert(0);
		int v2;
		
		while(!theQueue.isEmpty()){
			int v1 = theQueue.remove();
			while((v2 = getAdjUnvisitedVertex(v1)) != -1){
				System.out.print(vertexList[v2].label);
				vertexList[v2].wasVisited = true;
				theQueue.insert(v2);
			}
		}
		
		for(int i=0; i<nVerts; i++){
			vertexList[i].wasVisited = false;
		}
	}
}

public class BFSApp {
	public static void main(String[] args){
		GraphB g = new GraphB();
		
		g.addVertex('a');
		g.addVertex('b');
		g.addVertex('c');
		g.addVertex('d');
		g.addVertex('e');
		g.addVertex('f');
		g.addVertex('g');
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 6);
		
		System.out.print("Visits: ");
		g.bfs();
		System.out.println();
	}
}
