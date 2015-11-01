package Graph;

public class GraphDFS {
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private StackX theStack;
	
	public GraphDFS(){
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
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
			if(v == -1)
				theStack.pop();
			else{
				vertexList[v].wasVisited = true;
				displayVertex(v);
				theStack.push(v);
			}
		}
		
		for(int i = 0; i < nVerts; i++){
			vertexList[i].wasVisited = false;
		}
	}
	
	public void mst(){
		vertexList[0].wasVisited = true;
		theStack.push(0);
		
		while(!theStack.isEmpty()){
			int currentVertex = theStack.peek();
			int v = getAdjUnvisitedVertex(currentVertex);
			
			if(v == -1)
				theStack.pop();
			else{
				vertexList[v].wasVisited  = true;
				theStack.push(v);
				
				displayVertex(currentVertex);
				displayVertex(v);
				System.out.print(" ");
			}
		}
	}
	
	public int getAdjUnvisitedVertex(int v){
		for(int i = 0; i < nVerts; i++)
			if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false)
				return i;
		return -1;
	}
}
