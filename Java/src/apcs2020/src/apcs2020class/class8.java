package apcs2020class;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.tools.javac.code.Attribute.Array;

public class class8 {
	public static void main(String[] args) {
		// Fibonacci();
		// Prime_or_Composite_num();
		// Poker();
		Lottery();

	}

	static void Fibonacci() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		arr[0] = arr[1] = 1;
		int i = sc.nextInt();
		for (int a : arr)
			System.out.println(a);
//		for (int j=3;j<i;j++) {
//			arr[j]=arr[j-1]+arr[j-2];
//		}
//		System.out.println(arr[i]);
	}

	static void Prime_or_Composite_num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "Composite number." : "Prime number.");
	}

	static void Poker() {
		int arr1[] = new int[13];
		for (int i = 0; i < 13; i++) {
			arr1[i] = (int) (Math.random() * 13) + 1;
			System.out.println(arr1[i]);
		}
		int arr2[] = new int[] { 1, 2, 3, 4, 5 };
		for (int i : arr2)
			System.out.println(i);
		int arr3[] = { 1, 2, 3, 4, 5 };
		for (int i : arr3)
			System.out.println(i);
	}

	static void Lottery() {
		int lot[]=new int[6];
		
		for(int i=0;i<6;i++) {
			lot[i]=(int)(Math.random()*)+1;
		}
		for(int i:lot)
			System.out.println(i);
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<i;j++) {
				if (lot[i]==lot[j]) {
					Arrays.sort(lot);
					for(int k:lot)
						System.out.println(k);
					Lottery();
				}
				else {
					Arrays.sort(lot);
					for(int k:lot)
						System.out.println(k);
				}
			}
		}
		
	}

}
