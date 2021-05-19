

import java.util.Scanner;

/*

263541

131

 */

public class p1 {

	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		String data = br.nextLine();
		
		int a, b;
		a = b = 0;
		for(int i = 0; i < data.length(); i++) {
			if(i % 2 == 0) {
				a += data.charAt(i) - 48;	//0的字元碼為48, 1 為49			
			}else {
				b += data.charAt(i) - 48;
			}
		}
		int c = a > b ? a - b : b - a;
		System.out.println(c);	
	}

}
