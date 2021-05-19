package class6;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Odd_Even();
	}
	static void Odd_Even() {
		System.out.println("Please input a number.");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.printf("Your number is %s",i%2==0?"even":"odd");
	}
}
