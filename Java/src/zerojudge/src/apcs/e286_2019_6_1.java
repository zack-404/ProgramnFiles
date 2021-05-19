package apcs;

import java.util.Scanner;

public class e286_2019_6_1 {
	
	public static void main(String[] args) {
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int arr2[]=new int[4];
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				arr2[i]+=sc.nextInt();
		System.out.println(arr2[0]+":"+arr2[1]);
		System.out.println(arr2[2]+":"+arr2[3]);
		if(arr2[0]+arr2[2]>arr2[1]+arr2[3])
			System.out.println("Win");
		else if(arr2[0]+arr2[2]<arr2[1]+arr2[3]) 
			System.out.println("Lose");
		else System.out.println("Tie");
	}
}
