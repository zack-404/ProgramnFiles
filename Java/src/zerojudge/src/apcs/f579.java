package apcs;

import java.util.Scanner;

public class f579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="1234 345 2343 898 765 ",b[]=a.split(" ");
//		int c[]=new int[b.length];
//		for(int i=0;i<b.length;i++)
//			c[i]=Integer.parseInt(b[i]);
//		for(int x:c)
//			System.out.println(x);
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt(),count=0;
		for(int i=0;i<n;i++) {
			String ln=sc.nextLine(),arr1[]=ln.split(" ");
			int /*count1=0,count2=0,*/arr2[]=new int[arr1.length];
			for(int j=0;j<arr2.length;j++)
				arr2[i]=Integer.parseInt(arr1[j]);
			for(String x:arr1)
			System.out.println(x);
//			for(int j=0;j<arr1.length;j++) {
//				arr2[j]=Integer.parseInt(arr1[j]);
//				System.out.println(arr2[j]);
//				if(takeOrNot(a, arr2[j])==1) 
//					count1++;
//				else if(takeOrNot(a, arr2[j])==0)
//					count1--;
//				else if(takeOrNot(b, arr2[j])==1) 
//					count2++;
//				else if(takeOrNot(b, arr2[j])==0)
//					count2--;
			//}
			//if(count1>0&&count2>0) count++;
		}
		//System.out.println(count);
	}
	
	static int takeOrNot(int a,int x) {
		if(a==x)
			return 1;
		else if(a==-x)
			return 2;
		else return 0;
			
	}

}
