package LinkList;

public class Link {
	public int iData;
	public double dData;
	public Link next;
	public Link previous;
	
	public Link(int i, double d){
		iData = i;
		dData = d;
	}
	public Link(int i){
		iData = i;
		dData = 0;
	}
	
	public Link(double d){
		iData = 0;
		dData = d;
	}
	
	public void displayLink(){
		System.out.println("{" + iData + "," + dData +"}");
	}
}
