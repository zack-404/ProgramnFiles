package c__;

import java.util.Scanner;

public class c317 {
	public static void main(String[] args) {

	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		for(int z=0;z<y;y++) {
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			String ln1="",ln2="";
			for(int i=0,j;i*b<a;i++) {
				if((c-i*b)%a==0) {
					j=c-i*b;
					ln1+=(i+j)+" ";
					ln2+=i+","+j+" ";
				}
			}
			String arr1[]=ln1.split(" ");
			int arr3[]=new int[arr1.length];
			for(int i=0;i<arr1.length;i++) 
				arr3[i]=Integer.parseInt(arr1[i]);
			
			if(ln1.isEmpty())
				System.out.println("-1");
			
		}
	}
	/*
	 * c=ax+by
	 * min(x+y)
	 * 
	 */
}
