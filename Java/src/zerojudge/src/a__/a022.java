package a__;

import java.util.Scanner;

public class a022 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.printf(isPalindrome(a) ? "yes" : "no");
	}

	static boolean isPalindrome(String a) {
		for (int n = a.length() - 1, m = 0; n > 0; n--, m++) {
			if (a.charAt(n) != a.charAt(m)) {
				return false;
			}
		}
		return true;
	}
}
