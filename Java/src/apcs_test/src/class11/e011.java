package class11;

import java.util.Scanner;

public class e011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
		
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c;
		System.out.println(gcd_2(a, b));
	}
	
	static int bigToSmall(int a,int b) {
		int c=a;a=b;b=c;
		return a&b;
	}
	
	static int gcd_1(int a,int b) {
//		if(a%b==0)
//			return b;
//		else if(b%a==0)
//			return a;
//		else {
			while(a!=0&&b!=0) {
				if(a>b)
					a%=b;
				else
					b%=a;
			}
			if(a==0)
				return b;
			else 
				return a;
		//}
	}
	
	static int gcd_2(int a,int b){
		int t;
		while(a>0&&b>0) {
			t=a;
			a%=b;
			t=b;
		}
		return b;
	}
	/*         a<b
	 * a/b | a      b |
	 *          a*a/b |
	 * ----------------
	 *     | a  c=a%b |
	 * c/a |    
	 * ----------------
	 *  |
	 *  |
	 *  |
	 */
	
	static int gcd_3(int a,int b) {
		if(a%b==0)
			return b;
		else {	
			for(int i=b;i<=b;i--) {
				if(a%i==0&&b%i==0) {
					return i;
				}
				
			}
			return 0;
		}
	}

}
