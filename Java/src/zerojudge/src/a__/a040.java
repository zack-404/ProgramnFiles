package a__;
import java.util.Scanner;
public class a040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
		
	}
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=0;
		String ln1="";
		for(String ln="";a<b;a++) {
			ln+=a;
			char arr[]=ln.toCharArray();
			int arr2[]=new int[arr.length],k=a;
			for(int i=arr.length;i>0;i--)
				k-=Math.pow(arr[i],arr.length);
			if(k==0)
				ln1+=a+" ";
		}
		System.out.println(ln1.substring(0,ln1.length()-1));
	}
	static void test() {
		int a=123,z=0,p=0;
		for(;a>0;a/=10,z++);
		for(int j=10;a*10>j;j*=10)
			p+=Math.pow(a%j, z);
		System.out.println(p);
	}
	static void test2() {
		String ln1="",ln="";
		int a=2333,
		k=a;
		ln+=a;
		char arr[]=ln.toCharArray();
		for(int i=arr.length;i>0;i--)
			System.out.println(Math.pow(arr[i],arr.length));
//		if(k==0)
//			ln1+=a+" ";
//		System.out.println(ln1);
	}

}
