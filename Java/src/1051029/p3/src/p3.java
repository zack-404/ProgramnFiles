

import java.util.ArrayList;
import java.util.Scanner;

/* ���ո��

5 2 4

8 3 6

 */

public class p3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String[] datas = keyboard.nextLine().split(" ");
		int N = Integer.parseInt(datas[0]);
		int M = Integer.parseInt(datas[1]);
		int K = Integer.parseInt(datas[2]);
		
		//��l�Ʀ�C
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		//�O�����B�H
		int i = 0;
		
		for(int a = 0, b = 0, c = 0; c < M*K; c++) {
			if(b == M-1) {
				if(a == list.size()-1) { //�Y�z���H�O�̫�@�H
					i = 0; 
				}else {				
					i=a; //���B�H�ɩ��z���H����m
				}
				list.remove(a); // �R���z���H
				a--; //�Y�z���@���H�W, �o�̥�-1, �᭱�A�[1�~�|�d�b��Ӫ��Ǹ�
				b = 0; //�Y�z���@���H�W, b �n�k�s
			}else {
				b++;
			}
			if(a == list.size()-1) { //�Y�O�v����̫�@�H
				a = 0;
			}else {
				a++;
			}
		}
		System.out.println(list.get(i));	

	}

}
