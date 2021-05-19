

import java.util.ArrayList;
import java.util.Scanner;

/* 測試資料

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
		
		//接收第一列後的各列資料, 並立刻找出最大值, 並計算所有最大值之總和
		int total = 0;		
		for(int i = 0; i < N; i++) {
			
			//接收一列
			 datas = keyboard.nextLine().split(" ");
			 int[] array = new int[datas.length];
			 //找這一列的最大值
			 int biggest = 0;
			 for(int j = 0; j < array.length; j++) {
				 array[j] = Integer.parseInt(datas[j]);
				 if(array[j]> biggest) {
					 biggest = array[j];
				 }
			 }
			 //將這一列的最大值置於集合中
			 allBiggest.add(biggest);
			 
			 //所有最大值的總和計算
			 total += biggest;
		}
		
		//輸出最大值總和
		System.out.println(total);
		
		//輸出可以被最大值總和整除的各列最大值
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
