package apcs;

import java.util.Arrays;
import java.util.Scanner;

public class f605_2021_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
		
	}

	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),d=sc.nextInt(),o1=0,o2=0;//n 數量, d 價差, o 輸出
		for(int i=0;i<n;i++) {
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),arr1[]= {a,b,c};
			Arrays.sort(arr1);
			if(arr1[2]-arr1[0]>=d) {
				o1++;
				o2+=(a+b+c)/3;
			}
			
		}
		System.out.println(o1+" "+o2);
	}

}
