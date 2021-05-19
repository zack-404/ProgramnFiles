package a__;

import java.util.Scanner;

public class a007 {
	public static void main(String[] args) {
		sol1();
	}
	static void step1() {
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine(),out="";
		char arr[]=inp.toCharArray();
		for(int i=0;i<inp.length();i++) 
			out+=(int)(arr[i]);
		for(int i:arr) 
			System.out.println(i);
		//-7
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine(),out="";
		char arr[]=inp.toCharArray();
		for(int i=0;i<inp.length();i++) 
			out+=(char)((int)(arr[i])-7);
		System.out.println(out);
	}
}
