package apcs;

import java.util.Arrays;
import java.util.Scanner;

public class b964_2016_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol2();
	}

	static int sol1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), arr1[] = new int[a];
		for (int i = 0; i < a; i++)
			arr1[i] = sc.nextInt();
		if (a == 1) {
			System.out.println(arr1[0]);
			if (arr1[0] < 60) {
				System.out.println(arr1[0]);
				System.out.println("worst case");
			} else {
				System.out.println(arr1[0]);
				System.out.println("best case");
			}
			return 0;
		}

		Arrays.sort(arr1);
		String ln = "";
		for (int x : arr1)
			ln += x + " ";
		System.out.println(ln.substring(0, ln.length() - 1));
		int i = 0;
		for (; arr1[i] < 60; i++)
			;
		System.out.println(i);
		if (i == arr1.length)
			System.out.println("best case");
		else if (i == 0)
			System.out.println(arr1[0]);
		else
			System.out.println(arr1[i - 1]);
		if (i == 0)
			System.out.println("worst case");
		else
			System.out.println(arr1[i]);
		return 0;
	}

	static int sol2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), arr[] = new int[a];

		for (int i = 0; i < a; i++)// input
			arr[i] = sc.nextInt();
		if (a == 1) {
			System.out.println(arr[0]);
			if (arr[0] < 60) {
				System.out.println(arr[0]);
				System.out.println("worst case");
			} else {
				System.out.println("best case");
				System.out.println(arr[0]);
			}
			return 0;
		}
		Arrays.sort(arr);// sort small to big
		for (int i = 0; i < arr.length - 2; ++i)
			System.out.print(arr[i] + " ");
		System.out.println(arr[arr.length - 1]);
		int i = 0;
		while (arr[i] < 60) {
			// find which num closest to60
			i++;
		}

		out(i, arr);
		return 0;
	}

	static void out(int i, int arr[]) {
		if (i == 0)
			System.out.println("best case");
		else
			System.out.println(arr[i]);
		if (i == arr.length)
			System.out.println("worst case");
		else
			System.out.println(arr[i + 1]);
	}

}
