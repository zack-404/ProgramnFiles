package a__;

import java.util.Arrays;
import java.util.Scanner;

public class a104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),arr1[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		Arrays.sort(arr1);
		for(int x:arr1)
			System.out.println(x);
	}
	
	static void sol2() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),arr1[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		for(int i=0,a;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr1[i]<arr1[j]) {
					a=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=a;
				}
			}
		}
		for(int x:arr1)
			System.out.println(x);
	}
}
