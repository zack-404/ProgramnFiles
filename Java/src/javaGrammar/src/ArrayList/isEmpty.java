package ArrayList;

import java.util.ArrayList;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isEmpty();
	}
	
	static void isEmpty() {
		ArrayList<Integer> arr1=new ArrayList<>();
		System.out.println(arr1.isEmpty());
		for(int i=0;i<10;i++) arr1.add(i);
		System.out.println(arr1.isEmpty());
	}

}
