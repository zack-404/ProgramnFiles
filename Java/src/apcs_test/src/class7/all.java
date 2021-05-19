package class7;

import java.util.Scanner;

public class all {
	public static void main(String[] args) {
		//Years();
		//Ticket();
		//Forloops();
		//Forloops2();
		//times();
		//Triangle();
		//Square();
		Forloop_continue_break();
	}
	static void Years() {
		System.out.println("Please input year.");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt(),days=0;
		System.out.println("Please input month.");
		int m=sc.nextInt();
		switch(m){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			if (y%400==0||y%100!=0&&y%4==0) days=29;
			else days=28;
			break;
		}
		System.out.printf("%d's %d is %d days.",y,m,days);
	}
	static void Ticket() {
		System.out.println("Please input which ticket you want.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),ticket=0;
		switch(a) {
		case 1:
			ticket=300;
		case 2:
			ticket=240;
		case 3:
			ticket=24*8;
		}
		System.out.printf("Ticket is %d dollars.",ticket);
	}
	static void Forloops() {
		for(;;) {
			System.out.println("*");
		}
	}
	static void Forloops1() {
		int sum=0;
		for (int i=1;i<11;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	static void Forloops2() {
		for (int k=0;k<101;k+=5) {
			System.out.println(k);
		}
	}
	static void times() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input long.");
		int l=sc.nextInt();
		System.out.println("Please input wide.");
		int w=sc.nextInt();
		for (int i=1;i<l+1;i++) {
			for (int j=1;j<w+1;j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
	static void Triangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input how tall you want.");
		int l=sc.nextInt();
		for (int i=0;i<l;i++) {
			for (int k=l;k>i;k--)
				System.out.print(" ");
			char a=(char)(i+'A');
			for (int j=0;j<i;j++)
				System.out.print(a+" ");
			System.out.println();
		}
	}
	static void Square() {
		System.out.println("Please input len,wid.");
		Scanner sc=new Scanner (System.in);
		int len=sc.nextInt(),wid=sc.nextInt();
		for (int i=0;i<len;i++) {
			for (int j=0;j<wid;j++)
				System.out.print("@");
			System.out.println();
		}
	}
	
	static void Forloop_continue_break() {
		outbreak:
		for (int i=0;i<10;i++){
			if (i==5) break outbreak; 
			System.out.println(i);
			
		}
	}
}
