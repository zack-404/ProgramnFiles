

import java.util.ArrayList;
import java.util.Scanner;

/* 測試資料

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
		
		//初始化串列
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		//記錄幸運人
		int i = 0;
		
		for(int a = 0, b = 0, c = 0; c < M*K; c++) {
			if(b == M-1) {
				if(a == list.size()-1) { //若爆炸人是最後一人
					i = 0; 
				}else {				
					i=a; //幸運人補往爆炸人的位置
				}
				list.remove(a); // 刪掉爆炸人
				a--; //若爆炸一次以上, 這裡先-1, 後面再加1才會留在原來的序號
				b = 0; //若爆炸一次以上, b 要歸零
			}else {
				b++;
			}
			if(a == list.size()-1) { //若是己輪到最後一人
				a = 0;
			}else {
				a++;
			}
		}
		System.out.println(list.get(i));	

	}

}
