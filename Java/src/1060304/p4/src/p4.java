

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/* 測試資料

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
			//因為要刪除, 需要新的集合
			ArrayList<Integer> nList = new ArrayList<>(list);
			for(int j = 1; j <= K; j++) {
				
				//集合中第一個服務站的座標
				int firstS = nList.get(0);
				
				int s = firstS; //記錄直徑經過的座標
				for(int i = 0; i <= D; i++) { //直徑為三時會經過四個座標
					// i 
					// 是直徑經過的座標數量 , 該位置不一定有服務站
					if(s == nList.get(0)){ //該座標上有服務站
						nList.remove(0); 				
						
						//集合中沒有元素,代表此直徑可以完全覆蓋, 直接進入下一個直徑,
						if(nList.size()==0) {
							D--;
							continue begin;
						}
					}
					s++; //直徑經過的座標加1					
				}
				//System.out.println(nList);
			}
			//上面的迴圈跑完後, 集合中還有元素時,代表沒有全部覆蓋
			if(nList.size()!=0) {
				//前一個直徑才是可以完全覆蓋的直徑
				D++;
				break begin;
			}
			D--;
		}while(true);
		System.out.println(D);

	}

}
