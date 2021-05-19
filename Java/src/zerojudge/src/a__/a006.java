package a__;
import java.util.Scanner;
public class a006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=(b*b-4*a*c);
		if (d<0) {
			System.out.println("No real root");
		}else if(d==0) {
			System.out.printf("Two same roots x=%d",(int)(-b+Math.sqrt(d))/(2*a));
		}else {
			System.out.printf("Two different roots x1=%d , x2=%d",(int)(-b+Math.sqrt(d))/(2*a),(int)(-b-Math.sqrt(d))/(2*a));
		}
	}

}
