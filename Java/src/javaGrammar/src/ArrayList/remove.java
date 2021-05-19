package ArrayList;

import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1=new ArrayList<>();
		
		for(int i=0;i<10;i++)
			arr1.add(i);
		
		arr1.remove(2);//remove index
		
		arr1.remove(new Integer(4));//remove number
		
		for(int x:arr1)
			System.out.println(x);
	}
	
}
