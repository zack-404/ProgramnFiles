package class11;

import java.util.Scanner;

public class e013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine();
		String arr1[]=ln.split(" ");
		int arr2[]=new int[arr1.length],arr3[]=new int[6];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=Integer.parseInt(arr1[i]);
			if(arr2[i]>100)
				arr3[5]+=1;
			else if(arr2[i]<0)
				arr3[5]+=1;
			else if(arr2[i]>89)
				arr3[0]+=1;
			else if(arr2[i]>79)
				arr3[1]+=1;
			else if(arr2[i]>69)
				arr3[2]+=1;
			else if(arr2[i]>59)
				arr3[3]+=1;
			else 
				arr3[4]+=1;
		}
		for(int x:arr3)
			System.out.println(x);
	}

}
