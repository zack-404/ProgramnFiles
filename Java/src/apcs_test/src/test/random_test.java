package test;

import java.util.Arrays;
import java.util.Scanner;


public class random_test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ln=sc.next();//131
		int sum1=0,sum2=0;
		char arr1[]=ln.toCharArray();//1 3 1
		for(int i=0;i<arr1.length;i++) {
			if(i%2==0)
				sum1+=(int)(arr1[i]);
			else 
				sum2+=(int)(arr1[i]);
		}
		System.out.println(Math.abs(sum2-sum1));
	}
	
	static void Lottery() {
		int lot[]=new int[6];
		for (int i=0;i<6;i++) {
			lot[i]=(int)(Math.random()*49)+1;
			for(int j=0;j<i;j++) {
				if (lot[i]==lot[j]) break;
			}
		}
		Arrays.sort(lot);
		for(int i:lot) System.out.println(i);
	}
}
