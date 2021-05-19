package class6;

import java.util.Scanner;

public class Farenheit_to_Celcius {
	public static void main(String[] args) {
		Farenheit_to_Celcius();
	}
	static void Farenheit_to_Celcius() {
		double c,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("please input Celius.");
		c=sc.nextDouble();
		f=9/5*c+32;
		System.out.printf("It's %.2fFarenheit.",f);
	}
}
