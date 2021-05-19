package a__;

import java.util.Scanner;

public class a121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),n=0;
		if(a==1) a++;
		for(;a<=b;a++) {
			if(test(a))
				System.out.println(a);
		}
		System.out.println(n);
	}
	
	static boolean test(int a) {
		for(int i=2;i<=Math.sqrt(a);i++)
				if(a%i==0) 
					return false;
		return true;
	}
//31 37 41 43 47 2147483647
}
