

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 
 3 4 5
 
 101 100 99
 
 10 100 10
 
 */
public class p1 {

	public static void main(String[] args) {
		//������J
				Scanner keyboard = new Scanner(System.in);
				String[] datas = keyboard.nextLine().split(" ");
				
				//�m�J���X
				ArrayList<Integer> numbers = new ArrayList<>();
				for(String s : datas) {
					numbers.add(Integer.parseInt(s));
				}
				//�Ƨ�
				Collections.sort(numbers);
				
				//��X���e�걵
				String s ="";
				for(int i : numbers) {
					s += i + " ";
				}
				s = s.substring(0,s.length()-1);		
				System.out.println(s);
				
				//�̷ӱ����X1
				int a = numbers.get(0);
				int b = numbers.get(1);
				int c = numbers.get(2);
				
				if((a+b)<=c) {
					System.out.println("No");
				}else if(a*a+b*b<c*c) {
					System.out.println("Obtuse");
				}else if(a*a+b*b==c*c) {
					System.out.println("Right");			
				}else if(a*a+b*b>c*c) {
					System.out.println("Acute");		
				}
	}

}
