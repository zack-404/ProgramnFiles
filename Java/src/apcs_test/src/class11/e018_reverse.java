package class11;

import java.util.Arrays;
import java.util.Scanner;

public class e018_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ln=sc.next(),arr1[]=ln.split(" ");
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
			arr2[i]=Integer.parseInt(arr1[i]);
		Arrays.sort(arr2);
		reverse2(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	
	static void reverse1(int arr2[]) {
		int arr3[]=new int[arr2.length];
		for(int i=0,j=arr2.length-1;i<arr2.length;j--,i++) 
			arr3[i]=arr2[j];
		System.out.println(Arrays.toString(arr3));
	}

	static void reverse2(int arr2[]) {
		for(int i=0;i<arr2.length/2;i++) {
			int temp=arr2[i];
			arr2[i]=arr2[arr2.length-i];
			arr2[arr2.length-i]=temp;
		}
	}
	
}
