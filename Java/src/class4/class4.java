package class4;

import java.time.LocalDate;
import java.util.Scanner;



public class class4 {
	public static void main(String[] args) {
//		System.out.println(Math.random());
//		Scanner sc=new Scanner(System.in);
//		String saySomething=sc.next();
//		System.out.println(saySomething);
		/*
		 * 物件宣告
		 *  宣告 類別 物件參考名稱
		 *  產生實體
		 */
		Person p1;//two
		p1=new Person();//line
		Person p2=new Person();//one line
		p1.name="Mike";
		p1.nickName="404";
		p1.objectMethod1();
		p1.objectMethod2();
		p1.brain=100;
		System.out.println("p1's brain is "+p1.brain);
		p1.staticMethod1();
		Person.staticMethod2();
		p2.brain=2147;
		System.out.println("p2's brain is "+p2.brain);
		Person.brain=1;
		System.out.println("Person's brain is "+p1.brain);
		System.out.println("p1's name is "+p1.brain+" p2's brain is "+p2.brain+" Person's brain is "+p1.brain);
	}
	
}

class Person {
	Person (){//無參數建構子
		System.out.println("new的時候會呼叫這人");
	}
	String name,nickName;//物件變數
	static int brain;//類別變數 global
	void objectMethod1() {
		//宣告物件方法 無回傳
		System.out.println("這是物件方法一");
	}
	void objectMethod2() {
		System.out.println("這是物件方法二");
	}
	static void staticMethod1() {//宣告類別方法 無回傳
		System.out.println("這是類別方法一");
	}
	static void staticMethod2() {
		System.out.println("這是類別方法二");
	}
	
}
