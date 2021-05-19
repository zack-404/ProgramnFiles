package a__;

import java.util.Arrays;
import java.util.Scanner;

public class a014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
		
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),y=sc.nextInt(),arr1[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			arr1[i][0]=sc.nextInt();
			arr1[i][1]=sc.nextInt();
		}
		Arrays.sort(arr1);
		for(int i=0;i<n;i++)
			System.out.println(arr1[i][0]);
	}
	
	static void catchDoll(int y) {
		
	}

}
