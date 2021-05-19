package class11;

import java.util.Scanner;

public class e009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
//		long sum=factorial(n);
//		for(int i=1;i<n;i++)
//			sum*=i;
//		System.out.println(sum);
	}
	
	static long factorial(int n) {
		long sum=1;
		for(int i=1;i<n;i++)
			sum*=i;
		return sum*n;
	}

}
