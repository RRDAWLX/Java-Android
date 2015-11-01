
class Student {
	private String stuno;
	private String name;
	private float math;
	private float english;
	private float computer;
	
	public void setStuno(String s){
		stuno = s;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setMath(float m){
		math = m;
	}
	
	public void setEnglish(float e){
		english = e;
	}
	
	public void setComputer(float c){
		computer = c;
	}
	
	public String getStuno(){
		return stuno;
	}
	
	public String getName(){
		return name;
	}
	
	public float getMath(){
		return math;
	}
	
	public float getEnglish(){
		return english;
	}
	
	public float getComputer(){
		return computer;
	}
	
	public float sum(){
		return math + english + computer;
	}
	
	public float avg(){
		return (math + english + computer) / 3;
	}
	
	public float max(){
		float max = math;
		if(english > max)
			max = english;
		if(computer > max)
			max = computer;
		return max;
	}
	
	public float min(){
		float min = math;
		if(english < min)
			min = english;
		if(computer < min)
			min = computer;
		return min;
	}
	
	public Student(){
		
	}
	
	public Student(String stuno, String name, float math, float english, float computer){
		this.stuno = stuno;
		this.name = name;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
}
