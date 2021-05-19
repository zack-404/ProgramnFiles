package a__;

import java.util.Scanner;

public class a053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt(),b=0;
			if (a<10) {
				b+=a*6;
			}else {
				b+=60;
				if(a<20) {
					b+=(a-10)*2;
				}else {
					b+=20;
					if(a>39)
						b=100;
					else
						b+=(a-20);
			}
		}
		System.out.println(b);
		}
	}

}
