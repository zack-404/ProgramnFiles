package apcs2020class;

import java.util.Scanner;

import test1.Math;

public class class6 {
	public static void main(String[] args) {
		//Transformation();
		//Farenheit_to_Celcius();
		Index();
		//Odd_Even();
		//If_Else();
		//score();
		//Leap_Nomarlyear();
		//function();
		//minigame();
		//abs();
	}
	static void Transformation() {
		long a=123;
		int c=12345;
		a=c;
		float b=22;
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(3+4+"str");
		System.out.println("str"+3+4);
	}
	static void Farenheit_to_Celcius() {
		double c,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("please input Celius.");
		c=sc.nextDouble();
		f=9/5*c+32;
		System.out.printf("It's %.2fFarenheit.",f);
	}
	static void Index() {
		int a=2,b=3,c=4,d,e,f,g,h,i,j,k;
		d=Math.pow(2,3);
		System.out.println(d);
//		System.out.println(Math.pow(2,3));
//		System.out.println(Math.exp(2));
//		System.out.println(Math.log(2));
//		System.out.println(Math.log10(2));
//		System.out.println(Math.sqrt(2));
		
	}
	static void Odd_Even() {
		System.out.println("Please input a number.");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.printf("Your number is %s",i%2==0?"even":"odd");
	}
	static void If_Else() {
		System.out.println("Please input your score.");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if (i>59) System.out.println("pass");
		else System.out.println("failed");
	}
	static void score() {
		System.out.println("Please input your score.");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if (s>89) System.out.println("A");//9X
		else if (s>79) System.out.println("B");//8X
		else if (s>69) System.out.println("C");//7X
		else if (s>59) System.out.println("D");//6X
		else System.out.println("F");
		
	}
	static void Leap_Nomarlyear() {
		System.out.println("please input year.");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if (y%400==0||(y%4==0&&y%100!=0)) System.out.printf("%d is leapyear.",y);
		else System.out.println(y+" is normalyear.");
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
	static void minigame() {
		for (int j=0;j<20;j++) {
		System.out.println((char)((Math.random()*26)+65));
	}}
	static void abs() {
		int i=-1,j;
		j=Math.abs(i);
		System.out.println(j);
	}
}
