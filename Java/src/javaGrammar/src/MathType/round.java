package MathType;

public class round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		round();
	}
	
	static void round() {
		double d=3.14159;
		System.out.println(Math.round(d));
		System.out.println(Math.round(d*10.0)/10.0);//3.1
		System.out.println(Math.round(d*100.0)/100.0);//3.14
		System.out.println(Math.round(d*1000.0)/1000.0);//3.145
	}

}
