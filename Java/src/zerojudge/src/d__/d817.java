package d__;

import java.util.Scanner;

public class d817 {
	
	public static int pascal[][]={
			{0},
			{1,1},
			{1,2,1},
			{1,3,3,1},
			{1,4,6,4,1}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void sol1() {
		int arr1[][]= new int[5][6];
		for(int i=0;i<5;i++) {
			arr1[i][0]=1;
			arr1[i][i]=1;
		}
	}

}
