package ArrayList;

import java.util.ArrayList;

public class get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get();
	}
	
	static void get() {//value of index of ArrayList
		ArrayList<Integer> arr1=new ArrayList<>();
		for(int i=0;i<10;i++)
			arr1.add(i);
		
		System.out.println(arr1.get(0));
	}

}
