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
		 * ����ŧi
		 *  �ŧi ���O ����ѦҦW��
		 *  ���͹���
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
	Person (){//�L�Ѽƫغc�l
		System.out.println("new���ɭԷ|�I�s�o�H");
	}
	String name,nickName;//�����ܼ�
	static int brain;//���O�ܼ� global
	void objectMethod1() {
		//�ŧi�����k �L�^��
		System.out.println("�o�O�����k�@");
	}
	void objectMethod2() {
		System.out.println("�o�O�����k�G");
	}
	static void staticMethod1() {//�ŧi���O��k �L�^��
		System.out.println("�o�O���O��k�@");
	}
	static void staticMethod2() {
		System.out.println("�o�O���O��k�G");
	}
	
}
