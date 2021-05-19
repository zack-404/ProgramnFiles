package apcs;

import java.util.Scanner;

public class e288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		String arr1[]=new String[m];
		for(int i=0;i<m;i++) 
			arr1[i]=sc.next();
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
				char arr2[]=arr1[i].toCharArray(),arr3[]=arr1[j].toCharArray();
				for(int k=0;k<arr2.length;k++) {
					for(int l=0;l<arr3.length;l++) {
						if(arr2[k]!=arr3[l])
							continue;
					}
				}
			}
		}
	}

}
