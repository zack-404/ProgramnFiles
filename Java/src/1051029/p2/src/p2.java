

import java.util.ArrayList;
import java.util.Scanner;

/* ���ո��

3 2
1 5
6 4
1 1


4 3
6 3 2
2 7 9
4 7 1
9 5 3

*/
public class p2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner( System.in);
		
		String[] datas = keyboard.nextLine().split(" ");		
		int N = Integer.parseInt(datas[0]);
		int M = Integer.parseInt(datas[1]);
		
		ArrayList<Integer> allBiggest = new ArrayList<>();			
		
		//�����Ĥ@�C�᪺�U�C���, �åߨ��X�̤j��, �íp��Ҧ��̤j�Ȥ��`�M
		int total = 0;		
		for(int i = 0; i < N; i++) {
			
			//�����@�C
			 datas = keyboard.nextLine().split(" ");
			 int[] array = new int[datas.length];
			 //��o�@�C���̤j��
			 int biggest = 0;
			 for(int j = 0; j < array.length; j++) {
				 array[j] = Integer.parseInt(datas[j]);
				 if(array[j]> biggest) {
					 biggest = array[j];
				 }
			 }
			 //�N�o�@�C���̤j�ȸm�󶰦X��
			 allBiggest.add(biggest);
			 
			 //�Ҧ��̤j�Ȫ��`�M�p��
			 total += biggest;
		}
		
		//��X�̤j���`�M
		System.out.println(total);
		
		//��X�i�H�Q�̤j���`�M�㰣���U�C�̤j��
		boolean x = true;
		String s = "";
		for(int i : allBiggest) {
			if(total % i == 0) {
				s += i + " ";
				x = false;
			}
		}
		if(x) {
			System.out.println(-1);
		}else {
			s = s.substring(0,s.length() -1);
			System.out.print(s);
		}

	}

}
