package e__;

import java.util.Scanner;

public class e975 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		String ln1=sc.next();
		char arr1[]=ln1.toCharArray();
		for(int i=0;i<arr1.length-4;i++) {
			if((arr1[i]-arr1[i+1]==-3||arr1[i]-arr1[i+1]==-35)&&arr1[i+2]-arr1[i+1]==7&&arr1[i+3]-arr1[i+2]==-17) {
				System.out.println(test(arr1, i));
				break;
			}
		}
	}
	
	static int test(char arr1[],int index) {
		return Math.abs(arr1[index+1]-'o');
	}

	static void love() {
		char arr1[]= {'l','o','v','e'};
		int arr2[]=new int[4];
		for(int i=0;i<4;i++) {
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		/*
		 	108 3
			111 7
			118 -17
			101

		 */
		
	}
	
	static void Love() {
		char arr1[]= {'L','o','v','e'};
		int arr2[]=new int[4];
		for(int i=0;i<4;i++) {
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		/*
		 	76  35
			111 7
			118 -17
			101

		 */
		
	}
	
}
