package e__;

import java.util.Scanner;

public class e623 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol2();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			String sam[]= {"Pen","Pineapple","Apple","Pineapple pen"};
			if(n<5) {
				System.out.println(sam[n-1]);
			}else if(n>9&&n<13) {
				System.out.println(sam[n/4]);
			}
			else {
				int i=(int)((-1+Math.sqrt(2*n+1))/2);//which round 1
				n-=i*(4+4*i)/2;//8
				System.out.println(sam[n/i]);
			}
		}
	}
	
	static void sol2() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String sam[]= {"Pen","Pineapple","Apple","Pineapple pen"};
		String arr1[]=new String[100];
		
		
			for(int j=1;j<10;j++) {
				for(int i=0;i<j;i++) {
					for(int k=0;k<4;k++) {
					System.out.print(k);
				}
				System.out.println();
			}
		}
		
		
		
		
		
//		int j;
//		for(j=1;j<100;j*=4) {
//			for(int k=0;k<j;k++) {
//				for(int i=0;i<4;i++) {
//					arr1[k]=sam[i];
//					System.out.println(arr1[i]);
//				}
//			}
//		}
//		for(String x:arr1)
//			System.out.println(x);
		
	}

}
