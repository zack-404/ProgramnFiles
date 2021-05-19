package MathType;

public class mutiplyType {
	public static void main(String[] args) {
		int a=Math.multiplyExact(3, 4);//3*4
		long b=Math.multiplyExact(2,0);//2*0
		System.out.println(a+" "+b);//12 0
	}
	
	static int multiplyInt(int a,int b) {
		return a*b;
	}
	
	static long multiplyLong(int a,int b) {
		return a*b;
	}
}
