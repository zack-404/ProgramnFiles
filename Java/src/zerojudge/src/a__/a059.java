package a__;

import java.util.Scanner;

public class a059 {
	public static void main(String[] args) {
		sol1();
		
	}

	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt(),d=1;
		while(c>0) {
			int a=sc.nextInt(),b=sc.nextInt(),sum=0;
			for(int i=1;i<b;i++) {
				if(i*i>=a&&i*i<=b)
					sum+=i*i;
			}
			System.out.printf("Case %d: %d\n",d,sum);
			c--;d++;
		}
	}
}
