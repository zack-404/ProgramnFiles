

import java.util.Scanner;

/*���ո��
 
5 1B 1B FO GO 1B
5 1B 2B FO FO SO 
4 SO HR SO 1B
4 FO FO FO HR
4 1B 1B 1B 1B
4 GO GO 3B GO
4 1B GO GO SO
4 SO GO 2B 2B
4 3B GO GO FO
3

5 1B 1B FO GO 1B
5 1B 2B FO FO SO 
4 SO HR SO 1B
4 FO FO FO HR
4 1B 1B 1B 1B
4 GO GO 3B GO
4 1B GO GO SO
4 SO GO 2B 2B
4 3B GO GO FO
6

 */

public class p4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//�̦h�E��, �C�H�̦h��������
		int[][] numbers = new int[9][5];
		
		//Ū�J�������
		for(int i = 0; i < 9; i++) {
			String[] datas = keyboard.nextLine().split(" ");
			
			//�]���Ĥ@�ӭȬO��������, �ҥH j �q1�}�l
			//�]�����O�C�ӤH�����������������,�ҥH��datas.length
			for(int j = 1; j < datas.length; j++) { 
				//�N�������p�ন�N����s�J�G���}�C
				int k = 0;
				switch(datas[j]) {
				case "1B":
					k = 1;
					break;
				case "2B":
					k = 2;
					break;
				case "3B":
					k = 3;
					break;
				case "HR":
					k = 4;
					break;
				}
				numbers[i][j-1] = k;					
			}					
		}
		
		
		//�D�ت��`�X����(step 2)
		int outCount = Integer.parseInt(keyboard.nextLine());	
		//����
		int score = 0;
		
		//�p��L�{���`�X����(step 2)
		int allOut = 0;		
		
		//�O���S�]�O�_���H
		boolean base1, base2, base3;
		base1 = base2 = base3 = false;
		
		//�O���O�_�T�H�X��
		int out = 0;
		
		begin:
		//�̦h����������(step 2)
		for(int times = 0; times < 5; times++) {
			for(int i = 0; i < 9; i++) {//�q�Ĥ@�βĤE��
				switch(numbers[i][times]) {
				case 0:
					allOut++;
					if(allOut == outCount) {
						break begin;
					}
					out++;
					break;
				case 1:
					if(base3) {
						score++;
						base3=false;
					}
					if(base2) {
						base3 = true;
						base2 = false;
					}
					if(base1) {
						base2 = true;
						base1 = false;					
					}
					base1 = true;
					break;
				case 2:
					if(base3) {
						score++;
						base3 = false;
					}
					if(base2) {
						score++;
						base2=false;
					}
					if(base1) {
						base3=true;
						base1=false;
					}
					base2=true;
					break;
				case 3:
					if(base3) {
						score++;
						base3 = false;
					}
					if(base2) {
						score++;
						base2=false;
					}
					if(base1) {
						score++;
						base1=false;
					}
					base3=true;
					break;
				case 4:
					if(base3) {
						score++;
						base3 = false;
					}
					if(base2) {
						score++;
						base2=false;
					}
					if(base1) {
						score++;
						base1=false;
					}
					score++;				
				}
				//3�H�X���A�S�]�M��
				if(out == 3) {
					base1=base2=base3=false;
					out=0;
				}
				//System.out.println(i+":"+base1+":"+base2+":"+base3+"->"+score);				
			}
		}			
		System.out.println(score);

	}

}
