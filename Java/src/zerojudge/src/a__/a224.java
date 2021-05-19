package a__;

import java.util.Scanner;

public class a224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		String ln=sc.next();
		char arr1[]=ln.toCharArray(),a='0';
		for(int i=0,j=arr1.length-1;i<arr1.length/2;i++,j--) {
			if(arr1[i]==arr1[j])
				continue;
			else {
				a='1';
				break;
			}
		}if(a=='0') {
			System.out.println("yes. . .");
		}else System.out.println("no. . .");
	}

}
