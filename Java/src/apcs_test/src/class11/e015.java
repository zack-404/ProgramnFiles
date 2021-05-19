package class11;

import java.util.Arrays;
import java.util.Scanner;

public class e015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
		
	}
	
	static void sol1() {
		int arr2[]=scChoose();
		int a=0,b=0;double c=0;
		for(int i=0;arr2[i]==arr2[0];i++)	a++;
		for(int i=arr2.length-1;arr2[i]==arr2[arr2.length-1];i--)	b++;
		for(int x:arr2) c+=x;
		System.out.println(arr2[arr2.length-1]+" "+b);
		System.out.println(arr2[0]+" "+a);
		System.out.println(c/arr2.length);
	}
	
	static int[] scChoose() {
		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine(),ln2="",arr1[]=ln.split(" ");
		for(int i=0;i<arr1.length;i++) {
			int a=Integer.parseInt(arr1[i]);
			if(a<100&&a>0)
				ln2+=a+" ";
		}
		arr1=ln2.split(" ");
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) 
			arr2[i]=Integer.parseInt(arr1[i]);
		Arrays.sort(arr2);
		return arr2;
	}
}
