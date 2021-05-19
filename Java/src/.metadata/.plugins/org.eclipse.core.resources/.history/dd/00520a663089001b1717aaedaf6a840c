package class11;

import java.util.Arrays;
import java.util.Scanner;

public class e016_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),arr1[]=new int[a];
		for(int i=0;i<a;i++)
			arr1[i]=sc.nextInt();
		bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
	static void sol1() {
		int arr1[]= {33,44,77,99,11,66,88,22,55};
		for(int i=0;i<arr1.length;i++) {
			int j=i+1;
			for(;arr1[j]>arr1[i];) ;
			int a=arr1[i];
			arr1[i]=arr1[j-1];
			arr1[j-1]=a;
			
		}
		for(int x:arr1)
			System.out.println(x);
	}
	//I@3830f1c0

	static void sol2() {
		int arr1[]= {33,44,77,99,11,66,88,22,55};
		selectionSort1(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
	static int searchSmaellestIndex(int arr1[],int ind) {
		for(int i=1;i<arr1.length;i++) {
			if(arr1[ind]>arr1[i])
				ind=i;
		}
		return ind;
	}
	
	static int searchSmaellestIndex2(int arr1[],int ind) {
		for(int i=1;i<arr1.length;i++) {
			if(arr1[ind]>arr1[i])
				ind=i;
		}
		return ind;
	}
	
	static void selectionSort1(int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			int ind=i;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) ind=j;
			}
			int temp=arr1[ind];
			arr1[ind]=arr1[i];
			arr1[i]=temp;
		}
	}
	
	static int[] insertArrays(int index1,int index2, int arr1[]) {
		int temp=arr1[index1];
		arr1[index1]=arr1[index2];
		arr1[index2]=temp;
		return arr1;
	}
	
	static void insertSort(int arr1[]) {
		for(int i=1;i<arr1.length;i++) {
			if(arr1[i]<arr1[i-1]) {
				int temp=arr1[i];
				arr1[i]=arr1[i-1];
				arr1[i-1]=temp;
				continue;
			}
				
		}
	}
	
	static void insertSort2(int arr1[]) {
		for(int i=1;i<arr1.length;i++) {
			int insert=-1;
			for(int j=0;j<i;j++) {
				if(arr1[i]>arr1[j]) {
					insert=j;
					break;
				}
			}
			if(insert!=-1) {
				int temp=arr1[insert];
				arr1[insert]=arr1[i];
				arr1[i]=temp;
			}
		}
	}
	
	static void insertSort3(int arr1[]) {
		int a=0;//moveIndex
		for(int j=1;j<arr1.length;j++) {
			if(arr1[j]>arr1[j-1])
				continue;
			else {
				a=j;
				for(int i=a-1;i>-1;i--,a--) {
					if(arr1[i]>arr1[a]) {
						int temp=arr1[a];
						arr1[a]=arr1[i];
						arr1[i]=temp;
					}
					else break;
				}
			}
		}
	}
	
	static void bubbleSort(int arr1[]) {
		for(int i=1;i<arr1.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr1[i]<arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
	}
	
}
