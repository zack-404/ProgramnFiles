package class11;

import java.util.Arrays;
import java.util.Scanner;

public class e019_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine(),arr[]=ln.split(" ");
		int arr1[]=new int[arr.length],index=sc.nextInt(),num=sc.nextInt();
		for(int i=0;i<arr.length;i++)
			arr1[i]=Integer.parseInt(arr[i]);
		int arr2[]=insert1(arr1,index,num);
		System.out.println(Arrays.toString(arr2));
	}
	
	static int[] insert1(int arr1[],int index,int num) {
		int arr2[]=new int[arr1.length+1];
		for(int i=0;i<index-1;i++)
			arr2[i]=arr1[i];
		arr2[index-1]=num;
		for(int i=index;i<arr2.length;i++)
			arr2[i]=arr1[i-1];
		return arr2;
	}

}
