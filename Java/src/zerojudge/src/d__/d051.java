package d__;

import java.util.Scanner;

public class d051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		a=(a-32)*5/9;
		if(Math.round(a)==a){
			System.out.println(Math.round(a*1000.0)/1000.0+"00");
		}else
			System.out.println(Math.round(a*1000.0)/1000.0);
	}

}
