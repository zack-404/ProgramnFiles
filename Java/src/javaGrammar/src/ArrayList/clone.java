package ArrayList;

import java.util.ArrayList;

public class clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clone();
	}
	
	static void Clone() {//make a copy(?
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		for(int i=0;i<10;i++) arr1.add(i);
		System.out.println(arr1.toString());
		System.out.println(arr1.clone());
		System.out.println(arr1.toString());
		arr2=(ArrayList<Integer>) arr1.clone();
		System.out.println(arr2.toString());
	}

}
