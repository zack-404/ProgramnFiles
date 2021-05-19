package a__;

import java.util.Scanner;

public class a065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String a=sc.next(),o="";
			int sum;
			char arr[]=a.toCharArray();
			for(int i=0;i<a.length()-1;i++) {
				int k=arr[i],l=arr[i+1];
				o+=Math.abs(k-l);
			}System.out.println(o);
		}
	}
	static void test() {
		int m=65,n=73;
		String o="";
		o+=Math.abs(m-n);
		System.out.println(o);
	}
	static void test2() {
		String a="POKEMON",o="";
		char arr[]=a.toCharArray();
		
		for(int i=0;i<a.length();i++) {
			int k=arr[i],l=arr[i+1];
			o+=Math.abs(k-l);
		}System.out.println(o);
	}

}
