package f__;

import java.util.Scanner;

public class f640 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol2();
	}
	
	//System.out.println(h(f(5),g(3,4),3));
	//h f 5 g 3 4 3
	//2 1 0 3 0 0 0
	//0 0 5 0 3 4 3
	//2 0 0 0 0 0 0
	//0 7 5 4 3 4 3
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine();
		int arr1[][]=sortString(ln);
	}
	
	
	static int findNumber1(int arr[],int arr2[]) {//arr[]=1 1 1 0, arr2[]=0 0 0 2
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				arr2[i]=f(arr2[i+1]);
			}else if(arr[i]==2) {
				arr2[i]=g(arr2[i+1], arr2[i+2]);
			}else if(arr[i]==3) {
				arr2[i]=h(arr[i+1], arr2[i+2], arr2[i+3]);
			}else continue;
		}return arr2[0];
	}
	
	//h f 5 g 3 4 3
	//2 1 0 3 0 0 0
	//0 0 5 0 3 4 3
	
	static int[][] findNumber2(int arr1[][]) {
		String ln="";
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i][0]==0) {
				switch (arr1[i-1][0]) {
				case 1:
					arr1[i-1][1]=f(arr1[i][1]);
					for(;i<arr1.length-2;i++)
						arr1[i]=arr1[i+1];
					break;
				case 2:
					arr1[i-1][1]=g(arr1[i][1],arr1[i+1][1]);
					for(;i<arr1.length-3;i++)
						arr1[i]=arr1[i+2];
					break;
				case 3:
					arr1[i-1][1]=h(arr1[i][1],arr1[i+1][1],arr1[i+1][1]);
					for(;i<arr1.length-4;i++)
						arr1[i]=arr1[i+3];
					break;
				}
				arr1[i-1][0]=0;
			}
		}return arr1;
	}
	static void sol2() {
		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine();
		int arr1[][]=sortString(ln);
		while(NumorAbc(ln)) {
			ln=findNumber4(arr1);
			arr1=sortString(ln);
		}
		System.out.println(ln);
	}
	
	static String findNumber3(int arr1[][]) {
		String ln="";
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i][0]==1) {
				if(arr1[i+1][0]==0)
					ln+=f(arr1[i+1][1])+" ";
				else
					ln+="f ";
			}else if(arr1[i][0]==2) {
				if(arr1[i+1][0]==0&&arr1[i+2][0]==0)
					ln+=g(arr1[i+1][1],arr1[i+2][1])+" ";
				else
					ln+="g "+arr1[i+1][1]+" "+arr1[i+2][1];
			}else if(arr1[i][0]==2) {
				if(arr1[i+1][0]==0&&arr1[i+2][0]==0&&arr1[i+3][0]==0)
					ln+=h(arr1[i+1][1],arr1[i+2][1],arr1[i+3][1])+" ";
				else
					ln+="h "+arr1[i+1][1]+" "+arr1[i+2][1]+" "+arr1[i+3][1];
			}else ln+=arr1[i][1]+" ";
		}return ln;
	}
	
	static String findNumber4(int arr1[][]) {
		String ln="";
		for(int i=0;i<arr1.length;i++) {
			switch(arr1[i][0]) {
			case 0:
				ln+=arr1[i][1]+" ";
				break;
			case 1:
				if(arr1[i+1][0]==0&&arr1[i+2][0]==0)
					ln+=g(arr1[i+1][1],arr1[i+2][1])+" ";
				else
					ln+="g "+arr1[i+1][1]+" "+arr1[i+2][1];
				break;
			case 2:
				if(arr1[i+1][0]==0&&arr1[i+2][0]==0)
					ln+=g(arr1[i+1][1],arr1[i+2][1])+" ";
				else
					ln+="g "+arr1[i+1][1]+" "+arr1[i+2][1];
				break;
			case 3:
				if(arr1[i+1][0]==0&&arr1[i+2][0]==0&&arr1[i+3][0]==0)
					ln+=h(arr1[i+1][1],arr1[i+2][1],arr1[i+3][1])+" ";
				else
					ln+="h "+arr1[i+1][1]+" "+arr1[i+2][1]+" "+arr1[i+3][1];
				break;
			}
		}return ln;
	}
	
	
	static int[][] sortString(String ln) {
		String in[]=ln.split(" ");
		int arr1[][]=new int[in.length][2];//[][0]=
		for(int i=0;i<in.length;i++) {
			if(in[i].equals("f")) {
				arr1[i][0]=1;
			}else if(in[i].equals("g")) {
				arr1[i][0]=2;
			}else if(in[i].equals("h")) {
				arr1[i][0]=3;
			}else arr1[i][1]=Integer.parseInt(in[i]);
		}
		return arr1;
	}
	
	static boolean NumorAbc(String ln) {
		char arr1[]=ln.toCharArray();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]=='f'||arr1[i]=='g'||arr1[i]=='h')
				return true;
		}
		return false;
	}
	
	static String resortArray(int arr1[][],int i,int a) {//i運算玩得 a件個多少
		String ln="";
		for(int k=0;k<i+1||(k<arr1.length&&k>i+a);k++) {
			switch(arr1[k][0]) {
			case 1:
				ln+="f"+" ";
				break;
			case 2:
				ln+="g"+" ";
				break;
			case 3:
				ln+="h"+" ";
				break;
			default:
				ln+=arr1[k][1]+" ";
				break;
			}
		}
		return ln;
	}
	
	//function
	static int f(int x) {
		return 2*x-3;
	}
	static int g(int x,int y) {
		return 2*x+y-7;
	}
	static int h(int x,int y,int z) {
		return 3*x-2*y+z;
	}
}
