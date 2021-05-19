

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*���ո��

2
20 10
1 1

3
3 4 5
1 2 3

 */
public class p4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int count = Integer.parseInt(keyboard.nextLine());
		
		ArrayList<A> list = new ArrayList<>();
		String[] ws = keyboard.nextLine().split(" ");
		String[] fs = keyboard.nextLine().split(" ");

		for(int i = 0; i < count; i++) {
			A a = new A();
			a.w = Integer.parseInt(ws[i]);
			a.f = Integer.parseInt(fs[i]);
			list.add(a);
			
		}
		Collections.sort(list);

		int value = getValue(list);
		System.out.println(value);		
	}
	//�p��ثe�ƧǪ����ӭ�
	public static int getValue(ArrayList<A> list) {
		int value = 0;
		//�q�̫�@�Ӷ}�l
		//�̫�@�Ӫ�����  * �W�����󭫶q���`�M
		//�Ĥ@�Ӥ��κ�
		for(int index = list.size()-1;index> 0; index--){			
			A a = list.get(index);

			//�p��W�����󭫶q���`�M
			int allW = 0;
			for(int i = 0; i < index; i++) {
				allW += list.get(i).w;
			}
			
			//�C�@�Ӫ�����Ӷq���`�M
			value += allW * a.f;
		}		
		return value;				
	}	

}
class A implements Comparable<A>{
	int w;
	int f;
	/*
	//���Ƥ@����, �γo�ӱƧǧY�i
	public int compareTo(A a) {
		return w - a.w;
	}
	*/
	public int compareTo(A a) {
		return w*a.f - a.w*f;
	}
	public String toString() {
		return w + ":" + f ;
	}
}