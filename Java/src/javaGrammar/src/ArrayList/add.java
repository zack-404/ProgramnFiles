package ArrayList;

import java.util.*;

public class add {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr1=new ArrayList<>();
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
			arr1.add(sc.nextInt());
		
		arr1.add(2);
		arr1.add(3, 3);
		
		for(int x:arr1)
			System.out.println(x);
	}
	
	
	
	

}
