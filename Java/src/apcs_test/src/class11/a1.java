package class11;
import java.util.Scanner;
public class a1 {
	public static void main(String[] args) {
		//solution1();
		solution2();
		//solution3();
		//solution4();
	}
	static void parse() {//盢﹃锣传Θ计
		Scanner sc=new Scanner(System.in);
		String ln=sc.next();
		int a=Integer.parseInt(ln,2);//(﹃,ぶ秈)
		System.out.println(a);
	}
	static void solution1() {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String word[]=line.split(" ");
		int start=Integer.parseInt(word[0]);
		int end=Integer.parseInt(word[1]);
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		for(int i=end;i<=start;i++) {
			sum+=i;
		}
		if (start==end) {
			
			sum-=end;
		}
		
		System.out.println(sum);
	}
	static void solution2() {//15
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),sum=0;
		if (a>b) {
			for(int i=b;i<a+1;i++) {
				sum+=i;
			}
		}else if(a==b) {
			sum=a;
		}else {
			for(int i=a;i<b+1;i++) {
				sum+=i;
			}
		}System.out.println(sum);
	}
	static void solution3() {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String word[]=line.split(" ");
		int start=Integer.parseInt(word[0]);
		int end=Integer.parseInt(word[1]);
		int sum=0;
		
		if (start<end) {//跑计跑传
			int a=start;
			start=end;
			end=a;
		}
		for(int i=end;i<=start;i++) {
			sum+=i;
		}
		if (start==end) {
			sum-=end;
		}
		
		System.out.println(sum);
	}
	static void solution4() {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String word[]=line.split(" ");
		int start=Integer.parseInt(word[0]);
		int end=Integer.parseInt(word[1]);
		int sum=0;
		
		for(int i=end>start?start:end;i<=(end>start?end:start);i++) {
			sum+=i;
		}
		if (start==end) {
			sum-=end;
		}
		
		System.out.println(sum);
	}
}
