

import java.util.Scanner;

/*
3 2 3
1 1
3 1
1 2
1 0 0


3 2 2
3 3
2 1
1 2
0 1
*/
public class p2 {

public static void main(String[] args){
		
		//������J
		Scanner keyboard = new Scanner(System.in);
		String[] datas = keyboard.nextLine().split(" ");
		int R = Integer.parseInt(datas[0]); //�}�C����
		int C = Integer.parseInt(datas[1]); //�}�C�e��
		int M = Integer.parseInt(datas[2]); //���O��
		
		int[][] array = new int[R][C];
		int[] compute = new int[M];
		
		for(int i = 0; i < R; i++) {
			datas = keyboard.nextLine().split(" ");
			for(int j = 0; j < C ; j++) {
				array[i][j] = Integer.parseInt(datas[j]);
			}
		}
		datas = keyboard.nextLine().split(" ");
		for(int j = 0; j < C ; j++) {
			compute[j] = Integer.parseInt(datas[j]);
		}
		
		
		//�N���O���ϦV����		
		for(int i = compute.length - 1 ; i >= 0 ; i--) {
			if(compute[i] == 0) {
				array = y(array);
			}else {
				array = x(array);
			}
		}
		
		//��X
		System.out.println(array.length + " " + array[0].length);
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length ; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
			
	}	
	
	//�D�جO���ɰw��V����, �{�b�O�n�٭�, �ҥH�g�f�ɰw��V����
	//�إ߷s�}�C, �N�Ƚƻs��A����m
	public static int[][] y(int[][] array){
		int[][] newArray = new int[array[0].length][array.length];
		
		for(int i = 0; i < newArray.length; i++) {
			for(int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = array[j][array[0].length - i - 1];
			}
		}		
		return newArray;
	}
	
	//�W�U½��
	public static int[][] x(int[][] array){
		int[][] newArray = new int[array.length][array[0].length];
		
		for(int i = 0; i < newArray.length; i++) {
			for(int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = array[array.length -i -1][j];
			}
		}
		return newArray;
	}

}
