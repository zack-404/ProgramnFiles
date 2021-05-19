package class6;

import java.util.Scanner;

public class Leap_Nomarlyear {
	public static void main(String[] args) {
		Leap_Nomarlyear();
	}
	static void Leap_Nomarlyear() {
		System.out.println("please input year.");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if (y%400==0||(y%4==0&&y%100!=0)) System.out.printf("%d is leapyear.",y);
		else System.out.println(y+" is normalyear.");
	}
}
