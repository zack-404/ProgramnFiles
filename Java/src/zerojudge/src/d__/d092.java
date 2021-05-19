package d__;

import java.util.*;

public class d092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void sol1() {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt(),arr1[]=new int [a],arr2[]=new int[a];
		for(int i=0;i<a;i++) {
			int s=sc.nextInt(),d=sc.nextInt();
			arr1[i]=s+d;
			if(s>d) 
				arr2[i]=2;
			else if(s==d)
				arr2[i]=1;
			else 
				arr2[i]=0;
		}
		for(int k=0;k<a;k++) {
			for(int i=0,j;i<a-1;i++) {
				if(arr1[k]<arr1[i]) {
					j=arr1[i];
					arr1[i]=arr1[k];
					arr1[k]=j;
				}
			}
		}
		Arrays.sort(arr1);		
		for(int i=0;i<a;i++) {
			
		}
	}
	

}
