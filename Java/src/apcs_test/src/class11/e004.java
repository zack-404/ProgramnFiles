package class11;

import java.util.Scanner;
public class e004 {
	public static void main(String[] args) {
		solution2();
	}
	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	// solution2();
//		int c = (int) ((-0.5 + Math.sqrt(0.25 + 2 * 55)));
//		System.out.println(c );
//		if ((c * (c - 1) / 2) == 55)
//			System.out.println(55 + ",");
//		for (int i=1;i<10;i++) {
//			int c=(int)((-0.5+Math.sqrt(0.25+2*i)));
//			if((c*c/2-c/2)==i)
//				System.out.println(i+",");
//		}
//		int c=(int)((-0.5+Math.sqrt(0.25+2*55)));
//		System.out.println(c);
//		System.out.println((c*c/2+c/2));}

	static void solution2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		String n = "";

		for (int i = a; i < b + 1; i++) {
			int c = (int) ((-0.5 + Math.sqrt(0.25 + 2 * i)));
			if ((c * (c + 1) / 2) == i)
				
			 n+=i+" ";
		}
		n=n.substring(0,n.length()-1);
		System.out.println(n);
	}

	static void solution3() {
		boolean b = false;
		int i = 66, k = i;
		for (int j = 1; k > 0; j++) {
			k -= j;
		}
		if (k == 0)
			System.out.println(i + ",");

	}

	static void solution1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),arr[]=new int[b-a+1];
		String n="";
		
		for(a;a<b+1;a++) {
			for(int i=1;i<a/2;i++) 
				if(a==i*(i+1)/2)
					n+=a+",";;;
		System.out.println(n);
		
		
//		for (int i=a,j=0;i<b+1;i++,j++) 
//			arr[j]=i;
//		
//		for(int j=0,k=0;j<arr.length;j++) 
//			for(int i=1;i<arr[j/2];i++) 
//				if (arr[j]==i*(i+1)/2) 
//					n+=arr[j]+",";;
//		if(n.isEmpty())
//			System.out.println("None");
//		else {
//			n.endsWith(",");
//		}
		
//		if(arr1.length==0) {
//			System.out.println("None");
//		}for(int x=0;x<arr1.length-1;x++){
//			System.out.print(arr1[x]+",");
//		}System.out.println(arr1[arr1.length-1]);
			
		
		
	}
	/*
	 * n(n+1)/2
	 * n*n/2+n/2-i
	 * 0.5*n*n+0.5*n-i
	 * -1/2+sqrt(1/4-2
	 * 
	 * String n=" "
	 * 
	 * 
	 */

}
