package apcs;


import java.util.Scanner;

public class c290_2017_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	static void sol1() {
		
		Scanner sc=new Scanner(System.in);
		String ln=sc.next();
		char arr1[]=ln.toCharArray();
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
			arr2[i]=Character.getNumericValue(arr1[i]);
		int sum1=0,sum2=0;
		for(int i=0;i<arr1.length;i+=2) {
			sum1+=(arr2[i]);
		}
		for(int i=1;i<arr1.length;i+=2) {
			sum2+=(arr2[i]);
		}
		System.out.println(Math.abs(sum2-sum1));
	}
	static void sol2() {
		Scanner sc=new Scanner(System.in);
		String ln=sc.next();
		char arr1[]=ln.toCharArray();
		int sum1=0,sum2=0;
		for(int i=arr1.length-1;i>-1;i--) {
			if(i%2!=0)
				sum1+=Character.getNumericValue(arr1[i]);
			else
				sum2+=Character.getNumericValue(arr1[i]);
		}
		System.out.println(Math.abs(sum2-sum1));
		
	}
	static void sol3() {
		Scanner sc=new Scanner(System.in);
		String ln=sc.next();
		char arr1[]=ln.toCharArray();
		int a=ln.length(),sum1=0,sum2=0;
		if(a%2==0) {
			for(int i=0;i<a;i++) {
				if(i%2==0)
					sum2+=(int)(arr1[i]);
				else 
					sum1+=(int)(arr1[i]);
			}
		}else {
			for(int i=0;i<a;i++) {
				if(i%2!=0)
					sum2+=(int)(arr1[i]);
				else 
					sum1+=(int)(arr1[i]);
			}
			
		}
		System.out.println(Math.abs(sum2-sum1));
	}
	
	/*
	 * 
	 * i=2
	 * 0 1 2
	 * 1 3 1
	 */

}
