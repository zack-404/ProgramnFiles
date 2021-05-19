package class6;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		If_Else();
	}
	static void If_Else() {
		System.out.println("Please input your score.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i > 59)
			System.out.println("pass");
		else
			System.out.println("failed");
	}
}
