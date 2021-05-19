package class11;

import java.util.Scanner;

public class e004_2 {
	public static void main(String[] args) {
		solution2();
	}
	static void solution1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		String n = "";
		for (int i = a; i < b + 1; i++) {
			int c = (int) ((-0.5 + Math.sqrt(0.25 + 2 * i)));
			if ((c * (c + 1) / 2) == i)
				n+=i+",";
		}
		if(n.isEmpty())
			System.out.println("None");
		else 
			System.out.println(n.substring(0,n.length()-1));
	}
	static void solution2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		String n = "";
		for(int c=a;a<b+1;a++) 
			for (int i=a;c>0;c-=i++) 
				if(c==0)
					n+=a+",";
		if(n.isEmpty())
			System.out.println("None");
		else 
			System.out.println(n.substring(0,n.length()-1));
	}
	static void solution3() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=0;
		String n="";
		for(int i=1;i<b+1;i++) {
			c+=i;
			if(c>=a&&c<=b)
				n+=c;
		}
		if(n.isEmpty())
			System.out.println("None");
		else 
			System.out.println(n.substring(0,n.length()-1));
	}
}





