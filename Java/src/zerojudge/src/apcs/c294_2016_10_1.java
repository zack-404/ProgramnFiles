package apcs;

import java.util.*;

public class c294_2016_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int arr1[]=new int[3];
			for(int i=0;i<3;i++)
				arr1[i]=sc.nextInt();
			Arrays.sort(arr1);
			String ln="";
			for(int s:arr1)
				ln+=s+" ";
			System.out.println(ln.substring(0,ln.length()-1));
			int a=arr1[0],b=arr1[1],c=arr1[2],d=a*a+b*b,C=c*c;
			if(a+b<=c)
				System.out.println("No");
			else if(d<C)
				System.out.println("Obtuse");
			else if(d>C)
				System.out.println("Acute");
			else
				System.out.println("Right");
		}
	}

}
