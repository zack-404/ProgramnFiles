package vocabularyCard;

import java.util.Scanner;

public class proTest {
	
	private static String stor1="";
	private static String stor2="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void storage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please imput how many words do you want to starage.");
		System.out.println("Ex: English ­^¤å");
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			stor1+=sc.next()+" ";
			stor2+=sc.next()+" ";
		}
	}
	
	static void test1() {
		int arr[]= {0,1,2,3,4,5};
		String arr1[]= {"1","2","3"};
	}
	
	static void test2(String arr[]) {
		
	}
	
	static int[] test2() {
		int arr[]= {0,1,2,3,4,5};
		return arr;
	}
} 
