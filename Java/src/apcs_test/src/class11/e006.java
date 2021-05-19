package class11;

import java.util.Scanner;

public class e006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
		
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong(),j=n;
		for(int i=0;i<10;i++,j*=n) {
			System.out.print(j+" ");
		}
	}

}
