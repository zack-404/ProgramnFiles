package class5;

import java.util.Scanner;

public class all {
	public static void main(String[] args) {
		// Logic_and_or();
		// Logic_andand_oror();
		// Logic1();
		// bit();
		// displacement();
		// Assignment_Operator();
		Conditional_Operator();

	}

	static void Logic_and_or() {
		System.out.println(10 > 20 & 10 > 5);// 從頭執行到尾的and
		System.out.println(10 > 20 | 10 > 5);// 從頭執行到尾的or
		System.out.println(10 > 20 ^ 10 > 5);// "=="->true;"!="->false
		System.out.println(!(10 > 20));// "!"->not
		System.out.println(10 > 20 && 10 > 5);// 會選擇的and
		System.out.println(10 > 20 || 10 > 5);// 會選擇的or

	}

	static void Logic_andand_oror() {
		int a = 5, b = 10, c = 20;
		System.out.println(b < a | ++a > c);// 快
		System.out.println(a);
		System.out.println(b > a || ++a > c);// 慢
		System.out.println(a);

	}

	static void Logic1() {
		int a = 10;
		System.out.println(a++ > 10);
		System.out.println(a++ > 10);
	}

	static void bit() {// 位元運算
		byte a = 5/* 101 */, b = 6/* 110 */;
		System.out.println(a & b);// 100
		System.out.println(a | b);// 111
		System.out.println(a ^ b);// 011
		System.out.println(~a);// 010,"~"->not

	}

	static void displacement() {// 位移
		System.out.println(32 >> 2);
		System.out.println(32 << 2);// 32*2^2
	}

	static void Assignment_Operator() {
		byte a = 0, b, c = 0;
		a /= c;
		System.out.println(a);
		a = (byte) (a + 2);
		a += 2;
		a = (byte) (a - 2);
		a -= 2;
		a = (byte) (a / 2);
		a /= 2;
		a = (byte) (a * 2);
		a *= 2;
	}

	static void Conditional_Operator() {// 三元運算子
		// boolean運算式?true():false();
		System.out.println("Please input score.");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		// System.out.println(score>79?score>89?"A":"B":score<60?"D":"C");
		System.out.println(score > 89 ? "A" : score > 79 ? "B" : score > 69 ? "C" : "D");
	}
}
