

import java.util.Scanner;

/*測試資料
 
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
		//最多九局, 每人最多五次打擊
		int[][] numbers = new int[9][5];
		
		//讀入打擊資料
		for(int i = 0; i < 9; i++) {
			String[] datas = keyboard.nextLine().split(" ");
			
			//因為第一個值是打擊次數, 所以 j 從1開始
			//因為不是每個人都有五次的打擊資料,所以用datas.length
			for(int j = 1; j < datas.length; j++) { 
				//將打擊狀況轉成代號後存入二維陣列
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
		
		
		//題目的總出局數(step 2)
		int outCount = Integer.parseInt(keyboard.nextLine());	
		//分數
		int score = 0;
		
		//計算過程的總出局數(step 2)
		int allOut = 0;		
		
		//記錄壘包是否有人
		boolean base1, base2, base3;
		base1 = base2 = base3 = false;
		
		//記錄是否三人出局
		int out = 0;
		
		begin:
		//最多五輪的打擊(step 2)
		for(int times = 0; times < 5; times++) {
			for(int i = 0; i < 9; i++) {//從第一棒第九棒
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
				//3人出局，壘包清空
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
