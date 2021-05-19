package a__;

import java.util.Scanner;

public class a004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int y=sc.nextInt();
			if((y%4==0&&y%100!=0)||(y%400==0))
				System.out.println("¶|¦~");
			else System.out.println("¥­¦~");
		}
	}

}
