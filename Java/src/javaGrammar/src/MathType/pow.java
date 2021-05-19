package MathType;

public class pow {
	public static void main(String[] args) {
		double a=Math.pow(2, 3);
		int b=(int)Math.pow(4,3);
		System.out.println(a+" "+b);
	}
	
	static int pow(int a,int b) {
		int j=a;
		for(int i=0;i<b;i++) {
			a*=j;
		}
		return a;
	}
}
