package apcs;

import java.util.Arrays;
import java.util.Scanner;

public class f312_2020_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
		
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt(),b1=sc.nextInt(),c1=sc.nextInt();
		int a2=sc.nextInt(),b2=sc.nextInt(),c2=sc.nextInt();
		int n=sc.nextInt(),y1=0,y2=0,arr1[]=new int [n+1];
		
		for(int i=0,j=n;i<=n;i++,j--) {
			y1=a1*i*i+b1*i+c1;
			y2=a2*j*j+b2*j+c2;
			arr1[i]=y1+y2;
		}
		Arrays.sort(arr1);
		System.out.println(arr1[n]);
		
	}
	
}
