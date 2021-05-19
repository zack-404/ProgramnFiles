package a__;
import java.util.Scanner;
public class a010 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a>1) {
			int i=2;
			int j=0;
			if (a%i==0) {
				while (a%i==0) {
					a/=i;
					j++;
				}
				System.out.print(i+"^"+j+"*");
			}
			else {
				System.out.print(i+"*");
				i++;
				j=0;
			}
		}
	}
}
