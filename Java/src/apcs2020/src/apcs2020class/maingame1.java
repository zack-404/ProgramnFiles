package apcs2020class;

import java.util.Scanner;

import javax.swing.JOptionPane;

import test1.Math;

public class maingame1 {
	//static String temp = JOptionPane.showInputDialog("please input a number between 1-100.");

	public maingame1() {
		// TODO Auto-generated constructor stub
		part2();
	}
	static void part2() {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt(),a=(int)(Math.random());
		if (i==a) System.out.println("You're right.");
		else if (i>a) System.out.println("it's too large.");
		else if (i<a) System.out.println("it's too small.");
	}
	static void part1() {
		int ans = (int) (Math.random() * 100 + 1);
		int i = Integer.parseInt(temp);
		do {
			if (i == ans)
				System.out.println("You're right.");
			else if (i < ans)
				System.out.println("it' too small.");
			else if (i < ans)
				System.out.println("it' too large.");
		} while (ans != i);
		
	}
}
