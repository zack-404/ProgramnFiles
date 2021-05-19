package class11;

import java.util.Arrays;
import java.util.Scanner;

public class e017$_search {//Linear search

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarySearch3();
	}
	
	static void LinearSearch() {
		Scanner sc=new Scanner(System.in);
		String ln1=sc.nextLine(),arr1[]=ln1.split(" "),ans=sc.next();
		int index=-1;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i].equals(ans))
				index=i;
		}
		System.out.println(index);
	}

	static void BinarySearch1() {
		Scanner sc=new Scanner(System.in);
		String ln1=sc.nextLine(),arr1[]=ln1.split(" ");
		int arr2[]=new int[arr1.length],ans=sc.nextInt(),index=arr2.length/2,length=arr2.length;
		for(int i=0;i<arr1.length;i++)
			arr2[i]=Integer.parseInt(arr1[i]);
		Arrays.sort(arr2);
		while(ans!=arr2[index]) {
			if(arr2[index]>ans) {
				length=index;
				index=index/2;
			}else {
				index=(index+length)/2;
			}
		}
		System.out.println(index);
	}
	
	static void binarySearch2() {
		Scanner sc=new Scanner(System.in);
		String ln1=sc.nextLine(),arr1[]=ln1.split(" ");
		int arr2[]=new int[arr1.length],ans=sc.nextInt();
		for(int i=0;i<arr2.length;i++)
			arr2[i]=Integer.parseInt(arr1[i]);
		Arrays.sort(arr2);
		int start=arr2.length/2,end=arr2.length,mid=(start+end)/2;
		if(arr2[start]!=ans) {
			if(ans>arr2[start]) {
				while(ans<=arr2[mid]) {
					start=mid-1;
					mid=(start+end)/2;
				}
			}else {
				while(ans>=arr2[mid]) {
					start=mid+1;
					mid=(start+end)/2;
				}
			}
		}
	}
	
	static void binarySearch3() {
		Scanner sc=new Scanner(System.in);
		String ln1=sc.nextLine(),arr1[]=ln1.split(" ");
		int arr2[]=new int[arr1.length],ans=sc.nextInt();
		for(int i=0;i<arr1.length;i++)
			arr2[i]=Integer.parseInt(arr1[i]);
		Arrays.sort(arr1);
		System.out.println(binarySearch(arr2, ans));
	}
	
	static int binarySearch(int arr1[],int ans) {
		int index=-1,mid,start=0,end=arr1.length-1;
		while(start>=end) {
			mid=mid(start, end);
			if(ans==arr1[mid])
				index=mid;
			else if(ans>arr1[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return index;
	}
	
	static int mid(int start,int end) {
		return (start+end)/2;
	}
	
}
//Ħ@ĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦUĦU

