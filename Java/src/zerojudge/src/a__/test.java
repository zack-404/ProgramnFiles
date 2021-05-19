package a__;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		test3();
	}

	static void test1() {
		String a = "POKEMON", o = "";
		char arr[] = a.toCharArray();

		for (int i = 0; i < a.length() - 1; i++) {
			int k = arr[i], l = arr[i + 1];
			o += Math.abs(k - l);
		}
		System.out.println(o);
	}

	static void test2() {
		String ln1 = "", ln = "";
		int a = 2333, k = a;
		ln += a;
		char arr[] = ln.toCharArray();
		for (int i = arr.length; i > 0; i--)
			System.out.println(Math.pow(arr[i], arr.length));
		if (k == 0)
			ln1 += a + " ";
		System.out.println(ln1);
	}
	static void test3() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt(),sum=0;
			for(int i=0;i<a;i++) {
				int b=sc.nextInt();
				sum+=b;
			}if(sum/a>60)
				System.out.println("no");
			else 
				System.out.println("yes");
		}

	}
}
