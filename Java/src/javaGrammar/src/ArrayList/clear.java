package ArrayList;

import java.util.ArrayList;

public class clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clear();
	}
	
	static void clear() {//delete ArrayList
		ArrayList <Integer> arr1=new ArrayList<>();
		for(int i=0;i<10;i++) arr1.add(i);
		for(int x:arr1) System.out.print(x+" ");
		arr1.clear();
		for(int x:arr1) System.out.print(x);
	}

}