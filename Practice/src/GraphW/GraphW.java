package GraphW;

public class GraphW {
	private final int MAX_SIZE = 20;
	private final int INFINITY = 1000000;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private int currentVert;
	private PriorityQ thePQ;
	private int nTree;
	
	public GraphW(){
		vertexList = new Vertex[MAX_SIZE];
		adjMat = new int[MAX_SIZE][MAX_SIZE];
		nVerts = 0;
		for(int i=0; i < MAX_SIZE; i++)
			for(int j=0; j < MAX_SIZE; j++)
				adjMat[i][j] = INFINITY;
		thePQ = new PriorityQ();
	}
	
	public void addVertex(char lab){
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end, int weight){
		adjMat[start][end] = weight;
		adjMat[end][start] = weight;
	}
	
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	
	public void mstw(){
		currentVert = 0;
		
		while(nTree < nVerts-1){
			vertexList[currentVert].isInTree = true;
			nTree++;
			
			for(int i=0; i<nVerts; i++){
				if(i == currentVert)
					continue;
				if(vertexList[i].isInTree == true)
					continue;
				int distance = adjMat[currentVert][i];
				if(distance == INFINITY)
					continue;
				putInPQ(i, distance);
			}
			
			if(thePQ.size() == 0){
				System.out.println(" Graph not connected");
				return;
			}
			
			// remove edge with minimum distance from PQ
			Edge theEdge = thePQ.removeMin();
			int sourceVert = theEdge.srcVert;
			currentVert = theEdge.destVert;
			
			// display edge from source to current
			System.out.print(vertexList[sourceVert].label);
			System.out.print(vertexList[currentVert].label);
			System.out.print(" ");
		} // end while
		
		for(int i=0; i<nVerts; i++){
			vertexList[i].isInTree = false;
		}
	} // end mstw
	
	public void putInPQ(int newVert, int newDist){
		// is there another edge with the same destination vertex?
		int queueIndex = thePQ.find(newVert);
		if(queueIndex != -1){
			Edge tempEdge = thePQ.peekN(queueIndex);
			int oldDist = tempEdge.distance;
			if(oldDist > newDist){
				thePQ.removeN(queueIndex);
				Edge theEdge = new Edge(currentVert, newVert, newDist);
				thePQ.insert(theEdge);
			}
		}
		else{
			Edge theEdge = new Edge(currentVert, newVert, newDist);
			thePQ.insert(theEdge);
		}
	} // end putInPQ()
}
