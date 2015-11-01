package Algrithm;

public class LowArray {
	private double[] arr;
	
	public LowArray(int size){
		arr = new double[size];
	}
	
	public void setElem(int index, double num){
		arr[index] = num;
	}
	
	public double getElem(int index){
		return arr[index];
	}
	
	public int getLength(){
		return arr.length;
	}
}
