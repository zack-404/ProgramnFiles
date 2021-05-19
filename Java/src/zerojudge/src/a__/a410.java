package a__;

import java.util.Scanner;

public class a410 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	int f=sc.nextInt();
	if (a/d==b/e) {
		if (a/d==c/f) {
			System.out.println("Too many");
		}else {
			System.out.println("No answer");
		}
	}else {
		System.out.println("asdf");
//		System.out.printf("x=%.2f\n",(float)(d*c-a*f)/(a*e-b*d));
//		System.out.println((double)(d*c-a*f)/(b*d-a*e));
//		System.out.printf("y=%.2f",(float)((d*c-a*f)/(b*d-a*e)));
	}
	
	
	}
}
/*
 * ax+by=c
 * dx+ey=f
 * 
 * adx+dby=dc
 * adx+aey=af
 * (db-ae)y=dc-af
 * y=(dc-af)/(bd-ae)
 * 
 * x=c-by
 * 
 */
