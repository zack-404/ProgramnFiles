

import java.util.Scanner;
/*測試資料

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
	/* 分析列印順序(由內往外)
	 *	 
	 * a[i][j]
	 * 
	 * a[i][j-1] //往左 
	 * 
	 * a[i-1][j-1]//往上 第一圈,往上一步
	 * 
	 * a[i-1][j] //往右 
	 * a[i-1][j+1]
	 * 
	 * a[i][j+1] //往下
	 * a[i+1][j+1]
	 * 
	 * a[i+1][j] //往左
	 * a[i+1][j-1]     
	 */
	// 由內往外
	// 分析第一圈列印次數 左一,上一,右二,下二,左二   
	// 分析第二圈列印次數 左一,上三,右四,下四,左四
	// 分析第一圈迴圈計數器不能超過中間值加或減 1
	// 分析第二圈迴圈計數器不能超過中間值加或減 2
	public static void left(int[][] a) {
		//記錄印列印位置
		//中間
		int center = a.length /2;
		int i = center;
		int j = center;
		System.out.print(a[i][j]);
		
		//記錄列印第幾圈
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
		
		//記錄列印第幾圈
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
