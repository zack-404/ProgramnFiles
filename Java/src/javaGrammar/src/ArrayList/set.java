package ArrayList;

import java.util.ArrayList;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set();
	}
	
	static void set() {//change index of ArrayList to element
		ArrayList<Integer> arr1=new ArrayList<>();
		for(int i=0;i<10;i++) arr1.add(i);
		for(int x:arr1) System.out.print(x+" ");
		System.out.println();
		arr1.set(3, 100);
		for(int x:arr1) System.out.print(x+" ");
	}

}
