package class11;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class e007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		long arr1[]=new long[b>c?b+1:c+1];
//		if(b>0||c>0)
		if(arr1.length>1)
		arr1[0]=0;arr1[1]=1;
		for(int i=2;i<arr1.length;i++) {
			arr1[i]=arr1[i-1]+arr1[i-2];
		}
		String ln="";
		for(int i=a;i<b+1;i++) {
			ln+=arr1[i]+", ";
		}
		System.out.println(ln.substring(0,ln.length()-2));
		System.out.println(arr1[c]);
	}
	
	static void sol2() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		String ln="";
		int x=0,y=1;
		for(int i=0;i<b;) {
			
		}
		
	}

}
