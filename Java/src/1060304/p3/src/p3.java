

import java.util.Scanner;
/*���ո��

5
0
3 4 2 1 4
4 2 3 8 9
2 1 9 5 6
4 2 3 7 8
1 2 6 4 3

3
1
4 1 2
3 0 5
6 7 8

*/
public class p3 {


	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int length = Integer.parseInt(keyboard.nextLine());
		int way = Integer.parseInt(keyboard.nextLine());
		
		int[][] a = new int[length][length];
		for(int i = 0; i < length ; i++) {
			String[] datas = keyboard.nextLine().split(" ");
			for(int j = 0; j < length ;j++) {
				a[i][j]= Integer.parseInt(datas[j]);
			}
		}
		
		switch(way) {
		case 0:
			left(a);
			break;
		case 1:
			up(a);
			break;
		case 2:
			right(a);
			break;
		case 3:
			down(a);
			break;
		}
		
	}
	/* ���R�C�L����(�Ѥ����~)
	 *	 
	 * a[i][j]
	 * 
	 * a[i][j-1] //���� 
	 * 
	 * a[i-1][j-1]//���W �Ĥ@��,���W�@�B
	 * 
	 * a[i-1][j] //���k 
	 * a[i-1][j+1]
	 * 
	 * a[i][j+1] //���U
	 * a[i+1][j+1]
	 * 
	 * a[i+1][j] //����
	 * a[i+1][j-1]     
	 */
	// �Ѥ����~
	// ���R�Ĥ@��C�L���� ���@,�W�@,�k�G,�U�G,���G   
	// ���R�ĤG��C�L���� ���@,�W�T,�k�|,�U�|,���|
	// ���R�Ĥ@��j��p�ƾ�����W�L�����ȥ[�δ� 1
	// ���R�ĤG��j��p�ƾ�����W�L�����ȥ[�δ� 2
	public static void left(int[][] a) {
		//�O���L�C�L��m
		//����
		int center = a.length /2;
		int i = center;
		int j = center;
		System.out.print(a[i][j]);
		
		//�O���C�L�ĴX��
		int k = 1;
		while(k <= center) {
			while(j > center - k) {
				j--;
				System.out.print(a[i][j]);				
			}
			while(i > center -k) {
				i--;
				System.out.print(a[i][j]);		
			}
			while(j < center + k){				
				j++;
				System.out.print(a[i][j]);				
			}
			while(i < center + k) {
				i++;
				System.out.print(a[i][j]);				
			}
			while(j > center - k) {
				j--;
				System.out.print(a[i][j]);				
			}
			k++;
		}
	}
	public static void up(int[][] a) {
		int center = a.length /2;
		int i = center;
		int j = center;
		System.out.print(a[i][j]);
		int k = 1;
		while(k <= center) {
			while(i > center -k) {
				i--;
				System.out.print(a[i][j]);		
			}
			while(j < center + k){				
				j++;
				System.out.print(a[i][j]);				
			}
			while(i < center + k) {
				i++;
				System.out.print(a[i][j]);				
			}
			while(j > center - k) {
				j--;
				System.out.print(a[i][j]);				
			}
			while(i > center -k) {
				i--;
				System.out.print(a[i][j]);		
			}
			
			k++;
		}
	}

	public static void down(int[][] a) {
		int center = a.length /2;
		int i = center;
		int j = center;
		System.out.print(a[i][j]);
		int k = 1;
		while(k <= center) {
			while(i < center + k) {
				i++;
				System.out.print(a[i][j]);				
			}
			while(j > center - k) {
				j--;
				System.out.print(a[i][j]);				
			}
			while(i > center -k) {
				i--;
				System.out.print(a[i][j]);		
			}
			while(j < center + k){				
				j++;
				System.out.print(a[i][j]);				
			}
			while(i < center + k) {
				i++;
				System.out.print(a[i][j]);				
			}			
			k++;
		}
	}
	public static void right(int[][] a) {
		int center = a.length /2;
		int i = center;
		int j = center;
		System.out.print(a[i][j]);
		
		//�O���C�L�ĴX��
		int k = 1;
		while(k <= center) {
			while(j < center + k){				
				j++;
				System.out.print(a[i][j]);				
			}
			while(i < center + k) {
				i++;
				System.out.print(a[i][j]);				
			}
			while(j > center - k) {
				j--;
				System.out.print(a[i][j]);				
			}
			while(i > center -k) {
				i--;
				System.out.print(a[i][j]);		
			}
			while(j < center + k){				
				j++;
				System.out.print(a[i][j]);				
			}
			k++;
		}
	}
}
