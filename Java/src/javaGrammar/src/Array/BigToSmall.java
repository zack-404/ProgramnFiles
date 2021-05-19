package Array;

import java.util.Arrays;

public class BigToSmall {
	public static void main(String[] args) {
		arraySort();
		
	}
	static void withoutFunction() {
		int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nAfter Sorting...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	static void arraySort() {
		int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nAfter Sorting...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	static void parallelSort1() {
		int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		Arrays.parallelSort(arr);
		System.out.println("\nAfter Sorting...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	static void paralleSort2() {
		int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		Arrays.parallelSort(arr, 0, 5);//(array,start,end)
		System.out.println("\nAfter Sorting...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
