package a__;


import java.util.Scanner;

public class a148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt(),sum=0;
			for(int i=0;i<n;i++)
				sum+=sc.nextInt();
			if(sum/n>58)
				System.out.println("no");
			else System.out.println("yes");
		}
	}

}
