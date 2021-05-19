package class10;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input a string");
		String a=sc.nextLine();
		System.out.printf("%s %s a palidrome.",a,isPalindrome(a)?"is":"isn't");
	}
	static boolean isPalindrome(String a) {
		for(int n=a.length()-1,m=0;n>0;n--,m++) {
			if (a.charAt(n)!=a.charAt(m)) {
				return false;
			}
		}
		return true;
	}

}
