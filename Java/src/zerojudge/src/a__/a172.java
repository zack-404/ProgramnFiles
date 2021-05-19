package a__;

import java.util.Scanner;

public class a172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			String ln=sc.nextLine();
			System.out.println(check(ln));
		}
	}
	
	static int check(String ln) {
		String arr1[]=ln.split(" ");
		int arr2[]=new int[arr1.length],b=0,c=0;
		for(int i=0;i<arr1.length;i++)
			arr2[i]=Integer.parseInt(arr1[i]);
		for(int i=1;i<arr2.length;i++) {
			for(int j=i;j<arr2.length;j++) {
				if(arr2[j]>arr2[j-1]) {
					b=1;
				}
			}
			if(b>0)
				c++;
		}
		return c;
	}

}
