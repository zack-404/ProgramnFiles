package class6;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {
		
	}
	static void function() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Scanner sb=new Scanner(System.in);
		int b=sb.nextInt();
		Scanner sa=new Scanner(System.in);
		int c=sa.nextInt();
		int x=(int)(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		int y=(int)(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		int D=b*b-4*a*c;
		if (D<0) System.out.println("No real root");
		else if (x==y) System.out.printf("Two same roots x=%d",x);
		else if (x>y) System.out.printf("Two different roots x1=%d , x2=%d",x,y);
		else System.out.printf("Two different roots x1=%d , x2=%d",y,x);
	}
}
