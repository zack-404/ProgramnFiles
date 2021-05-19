package class11;
import java.util.Scanner;
public class e005 {
	public static void main(String[] args) {
		sol2();
	}
//	static void solution1() {
//		Scanner sc=new Scanner(System.in);
//		String ln=sc.nextLine(),arr[]=ln.split(" ");
//		int arr1[]=new int [arr.length];
//		for(int i=0;i<arr.length;i++) {
//			int arr1[i]=arr[i];
//		}
//		System.out.println(arr[arr.length/2]);
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=Integer.parseInt(arr[i]);
//		}System.out.println((double)(sum/arr.length));
//		for(int i=0;i<arr.length-1;i++) {
//			int max=0;
//			if(arr[i]>arr[i+1])
//				max=arr[i];
//		}
//	}
	
	static void sol2() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),arr[]=new int [b],sum=a;
		arr[0]=a;
		String ln="";
		ln+=a+",";
		for(int i=1;i<b;i++) {
			arr[i]=arr[i-1]+c;
			ln+=arr[i]+",";
			sum+=arr[i];
		}
		ln=ln.substring(0, ln.length()-1);
		System.out.println(ln);
		System.out.println(arr[b/2-1]);
		System.out.println(arr[b-1]);
		System.out.println((double)(sum/b));
		
	}
}
