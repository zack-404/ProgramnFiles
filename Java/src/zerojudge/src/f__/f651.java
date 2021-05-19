package f__;

import java.util.Scanner;

public class f651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt(),ans=a/3+1;
			if(a%3==0)
				ans=a/3;
			System.out.println(ans);
		}
	}

}
