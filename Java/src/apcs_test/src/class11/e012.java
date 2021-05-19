package class11;

import java.util.Arrays;
import java.util.Scanner;

public class e012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int d=gcd1(a, b, c);
		System.out.println(d);
		lcm2(a, b, c, d);
	}
	
	static int gcd1(int a,int b,int c) {
		int d=0;
		for(int i=2;i<=a;i++){
			if(a%i==0&&b%i==0&&c%i==0)
				d=i;
		}
		return d;
	}
	
	static int gcd2(int a,int b,int c) {
		int d=1;
		for(int i=2;i<=a&&i<=b&&i<=c;) {
			if(a%i==0&&b%i==0&&c%i==0) {
				a/=i;
				b/=i;
				c/=i;
				d*=i;
			}else {
				i++;
			}
		}
		return d;
	}
	
	static int lcm(int a,int b,int c,int d) {
		int arr[]= {a,b,c},e=0;
		Arrays.sort(arr);
		if(d==a||d==c||d==b) {
			return arr[2]*arr[1]/d/d*arr[0];
		}else {
			return a/d*b/d*c;
		}
			
	}
	
	static void lcm2(int a,int b,int c,int d) {
		int e=1;
		for(int i=2;i<=a;i++){
			if((a%i==0&&b%i==0)||(a%i==0&&c%i==0)||(c%i==0&&b%i==0))
				e*=i;
		}
		System.out.println(a*b*c/e);
	}
	

}
