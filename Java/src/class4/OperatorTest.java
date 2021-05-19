package class4;

import java.awt.desktop.PrintFilesEvent;

public class OperatorTest {
	public static void main(String[] args) {// ºâ³N¹Bºâ
		//operator();
		//increase();
		int a=5,b=5,c=0;
		c=++a+b++;
		System.out.printf("a=%d,b=%d,c=%d",a,b,c);
		operator();
		
	}

	static void operator() {

		System.out.println(10 + 3);// 13
		System.out.println(10 - 3);// 7
		System.out.println(10 * 3);// 30
		System.out.println(10 / 3);// 3
		System.out.println(10 % 3);// 1
		System.out.println("===========");
		System.out.println(-10 / 3);
		System.out.println(-10 / -3);
		System.out.println(-10 % 3);
		System.out.println(-10 % -3);
		System.out.println(10 % -3);
	}
	static void increase () {
		int a=5;
		a=a+2;
		System.out.println(a);//7
		a++;
		System.out.println(a);//8
		System.out.println(++a);//9
		System.out.println(a++);//9
		System.out.println(a);//10
		a=5;
		a+=2;
		System.out.println(a);//7
		++a;
		System.out.println(a);//8
	}
	static void decrease() {
		int b=3;
		b=b-2;
		System.out.println(b);
		b--;
		System.out.println(b);
		--b;
		System.out.println(b);
	}
	static void operator1() {
		int a,b,c;
		c=++a + b++ + ++b + ++a + a + ++b + a++;
		System.out.printf("a=%d,b=%d,c=%d",a,b,c);
		byte d=20,e=10;
		short f;
		f=d+e;
		System.out.println(d+e+f);
	}
}


















