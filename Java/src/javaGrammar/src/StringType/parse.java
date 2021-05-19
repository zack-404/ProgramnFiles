package StringType;

import java.util.Scanner;

public class parse {
	public static void main(String[] args) {
		//將字串轉換成數字
			Scanner sc=new Scanner(System.in);
			String ln=sc.next();
			int a=Integer.parseInt(ln,2);//(字串,多少進位制)
			System.out.println(a);
	}
}
