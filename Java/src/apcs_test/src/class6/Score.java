package class6;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		score();
	}
	static void score() {
		System.out.println("Please input your score.");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if (s>89) System.out.println("A");//9X
		else if (s>79) System.out.println("B");//8X
		else if (s>69) System.out.println("C");//7X
		else if (s>59) System.out.println("D");//6X
		else System.out.println("F");
		
	}
}
