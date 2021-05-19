package a__;

import java.util.Scanner;

public class a003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=(2*a+b)%3;
		switch (c) {
		case 0:
			System.out.println("´¶³q");
			break;
		case 1:
			System.out.println("¦N");
			break;
		default:
			System.out.println("¤j¦N");
			break;
		}
	}

}
