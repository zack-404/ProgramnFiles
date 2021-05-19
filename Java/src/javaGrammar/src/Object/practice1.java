package Object;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static student[] studentID;
	
	static void sol1() {
		
	}
}

class student implements Comparable<student>{
	String name;
	int height;
	int weight;
	float BMI;
	student(String name,int height,int weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
		BMI();
	}
	void BMI() {
		BMI=(height/100)*(height/100)/weight;
	}
	
	public String compareTO(student o) {
		if(BMI>26)
			return "too fat";
		else if(BMI<17)
			return "too light";
		else return "very good";
	}
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
