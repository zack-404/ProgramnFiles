package class11;

import java.util.Scanner;

public class e008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=0;
		for(;b>=a;c++)b/=a;
		System.out.println(c);
	}

}
