package class11;

import java.util.Scanner;

public class e020_insertAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine(),arr[]=ln.split(" ");
		int arr1[]=new int[arr.length],num=sc.nextInt();
		for(int i=0;i<arr.length;i++)
			arr1[i]=Integer.parseInt(arr[i]);
		System.out.println(binarySort(arr1, num));
	}
	
	static void insertSort1(int arr1[],int num) {
		
	}
	
	static int binarySort(int arr1[],int num) {
		int start=0,end=arr1.length-1,n=0;
		while(start-end<1) {
			int mid=(start+end)/2;
			if(arr1[mid]==num)
				return mid;
			else if(num>arr1[mid])
				start=mid+1;
			else end=mid-1;
		}
		
		
		
		return n;
	}

}
