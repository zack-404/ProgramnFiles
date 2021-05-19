package a__;

import java.util.Scanner;

public class a244 {
	public static void main(String[] args) {
		sol1();
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			long b=sc.nextLong(),c=sc.nextLong();
			switch(a) {
			case 1:
				System.out.println((b+c));
				break;
			case 2:
				System.out.println((b-c));
				break;
			case 3:
				System.out.println((b*c));
				break;
			case 4:
				System.out.println((b/c));
				break;
			}
		}
	}
}
