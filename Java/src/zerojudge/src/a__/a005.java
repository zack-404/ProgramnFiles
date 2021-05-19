package a__;

import java.util.Scanner;

public class a005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),arr1[]=new int[5];
		for(int i=0;i<t;i++) {
			for(int j=0;j<4;j++)
				arr1[j]=sc.nextInt();
			arr1=test(arr1);
			for(int x:arr1)
				System.out.print(x+" ");
			System.out.println();
		}
	}
	
	static int[] test(int arr1[]) {
		if(arr1[1]-arr1[0]==arr1[2]-arr1[1])
			arr1[4]=arr1[3]+arr1[2]-arr1[1];
		else
			arr1[4]=arr1[3]*arr1[2]/arr1[1];
		return arr1;
	}

}
