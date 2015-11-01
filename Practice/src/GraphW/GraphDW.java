package GraphW;

public class GraphDW {
	private final int MAX_VERTS = 20;
	private final int INFINITY = 1000000;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private int nTree;
	private DistPar[] sPath;
	private int currentVert;
	private int startToCurrent;
	
	public GraphDW(){
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		for(int i=0; i < MAX_VERTS; i++)
			for(int j=0; j < MAX_VERTS; j++)
				adjMat[i][j] = INFINITY;
		nVerts = 0;
		nTree = 0;
		sPath = new DistPar[MAX_VERTS];
	}
	
	public void addVertex(char lab){
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end, int weight){
		adjMat[start][end] = weight;
	}
	
	public void path(){  // find all shortest paths
		int startTree = 0;
		vertexList[startTree].isInTree = true;
		nTree = 1;
		
		// transfer row of distances from adjMat to sPath
		for(int i=0; i < nVerts; i++){
			int tempDist = adjMat[startTree][i];
			sPath[i] = new DistPar(startTree, tempDist);
		}
		
		// until all vertices are in the tree
		while(nTree < nVerts){
			int indexMin = getMin();  // get minimum from sPath
			int minDist = sPath[indexMin].distance;
			
			if(minDist == INFINITY){
				System.out.println("There are unreachable vertices");
				break;
			}
			else{
				currentVert = indexMin;
				startToCurrent = sPath[indexMin].distance;
			}
			// put current vertex in tree
			vertexList[currentVert].isInTree = true;
			nTree++;
			adjust_sPath();
		} // end while
		
		displayPaths();
		
		nTree = 0; 
		for(int i=0; i < nVerts; i++)
			vertexList[i].isInTree = false;
	} // end path()
	
	public int getMin(){
		int minDist = INFINITY;
		int indexMin = 0;
		for(int i=0; i < nVerts; i++){
			if(!vertexList[i].isInTree && sPath[i].distance < minDist){
				minDist = sPath[i].distance;
				indexMin = i;
			}
		}
		return indexMin;
	}
	
	public void adjust_sPath(){
		// adjust values in shortest-path array sPath
		int column = 1;
		while(column < nVerts){
			// if this column's vertex already in tree, skip it
			if(vertexList[column].isInTree){
				column++;
				continue;
			}
			
			int currentToFringe = adjMat[currentVert][column];
			int startToFringe = startToCurrent + currentToFringe;
			int sPathDist = sPath[column].distance;
			
			// compare distance from start with sPath entry
			if(startToFringe < sPathDist){
				sPath[column].parentVert = currentVert;
				sPath[column].distance = startToFringe;
			}
			column++;
		} // end while
	}
	
	public void displayPaths(){
		for(int i=0; i < nVerts; i++){
			System.out.print(vertexList[i].label + "=");
			if(sPath[i].distance == INFINITY)
				System.out.print("inf");
			else
				System.out.print(sPath[i].distance);
			char parent = vertexList[sPath[i].parentVert].label;
			System.out.print("(" + parent + ") ");
		}
		System.out.println();
	}
}
