

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/* ���ո��

5 2
5 1 2 8 7

5 1
7 5 1 2 8

 */
public class p4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] datas = keyboard.nextLine().split(" ");
		int count = Integer.parseInt(datas[0]);
		int K = Integer.parseInt(datas[1]);
		
		ArrayList<Integer> list = new ArrayList<>();
		datas = keyboard.nextLine().split(" ");
		for(int i = 0; i < count; i++) {
			list.add(Integer.parseInt(datas[i]));
		}
		Collections.sort(list);
		for(int i = 0; i < list.size();) {
			if(list.get(i) == list.get(i+1)) {
				list.remove(i+1);
			}else {
				i++;
			}
		}
		
		
		int D = 0;
		if(K==1) {
			D = list.get(list.size()-1)-list.get(0);
			System.out.println(D);
			return;
		}

		D = (list.get(list.size()-1)-list.get(0) )/ K + 1;
		begin:
		do {
			//�]���n�R��, �ݭn�s�����X
			ArrayList<Integer> nList = new ArrayList<>(list);
			for(int j = 1; j <= K; j++) {
				
				//���X���Ĥ@�ӪA�ȯ����y��
				int firstS = nList.get(0);
				
				int s = firstS; //�O�����|�g�L���y��
				for(int i = 0; i <= D; i++) { //���|���T�ɷ|�g�L�|�Ӯy��
					// i 
					// �O���|�g�L���y�мƶq , �Ӧ�m���@�w���A�ȯ�
					if(s == nList.get(0)){ //�Ӯy�ФW���A�ȯ�
						nList.remove(0); 				
						
						//���X���S������,�N�����|�i�H�����л\, �����i�J�U�@�Ӫ��|,
						if(nList.size()==0) {
							D--;
							continue begin;
						}
					}
					s++; //���|�g�L���y�Х[1					
				}
				//System.out.println(nList);
			}
			//�W�����j��]����, ���X���٦�������,�N��S�������л\
			if(nList.size()!=0) {
				//�e�@�Ӫ��|�~�O�i�H�����л\�����|
				D++;
				break begin;
			}
			D--;
		}while(true);
		System.out.println(D);

	}

}
