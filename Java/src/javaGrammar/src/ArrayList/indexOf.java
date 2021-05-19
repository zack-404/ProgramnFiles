package ArrayList;

import java.util.ArrayList;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		indexOf();
	}
	
	static void indexOf() {//return index of element
		ArrayList<Integer> arr1=new ArrayList<>();
		for(int i=1;i<10;i++) arr1.add(i);
		System.out.println(arr1.indexOf(0));//-1 not found
		System.out.println(arr1.indexOf(3));//2
	}

}
