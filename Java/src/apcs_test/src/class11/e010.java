package class11;

import java.util.Scanner;

public class e010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
		
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(prime_num1(n));
	}
	
	static String prime_num1(int n) {
		String ln="";
		int arr[]=new int[n];
		for(int i=2;i<=n;i++) {
			boolean tf=false;
			for(int j=2;j<=Math.sqrt(i);j++)
				if(i%j==0) {
					tf=true;
					break;
				}
			if(tf==false)
				ln+=i+", ";
		}
		return ln.substring(0,ln.length()-2);
	}

	static String prime_num2(int n) {
		String ln="";
		int arr[]=new int[n];
		for(int i=2;i<=n;i++) {
			boolean tf=false;
			for(int j=2;j<i;j++)
				if(i%j==0) {
					tf=true;
					break;
				}
			if(tf==false)
				ln+=i+", ";
		}
		return ln.substring(0,ln.length()-2);
	}
	
	static void prime_num3(int n) {
		int arr1[]=new int[1000];
		for(int i=0,j=1;i<1000;i++,j++) {
			arr1[i]=j;
		}
		for(int i=1;i<1001;i++) {
			for(int j=1;j<Math.sqrt(arr1[i]);j++) {
				if(i%j==0) {
					arr1[i*j]=0;
				}
			}
		}
	}
}
