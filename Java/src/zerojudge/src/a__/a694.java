package a__;

import java.util.Scanner;

public class a694 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	/*
	 * 

	 */
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt(),m=sc.nextInt(),arr1[][]=new int[n][n],arr2[]=new int[m];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					arr1[i][j]=sc.nextInt();
			for(int k=0;k<m;k++) {
				int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),sum=0;
				for(int i=x1-1;i<x2;i++) {
					for(int j=y1-1;j<y2;j++) {
						sum+=arr1[i][j];
					}
				}
				arr2[k]=sum;
			}
			for(int x:arr2)
				System.out.println(x);
		}
	}

}
