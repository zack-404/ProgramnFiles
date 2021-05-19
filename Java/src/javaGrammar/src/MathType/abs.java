package MathType;

public class abs {
	public static void main(String[] args) {
		int a=Math.abs(-100);
		double b=Math.abs(-0.001);
		System.out.println(a+" "+b);
	}
	
	static int abs(int a) {
		if(a<0)
			return -a;
		else 
			return a;
	}
}
