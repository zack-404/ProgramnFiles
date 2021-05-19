package ArrayList;

import java.util.ArrayList;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue();
	}
	
	static void queue() {
		ArrayList<Integer> arr1=new ArrayList<>();
		for(int i=0;i<10;i++)
			arr1.add(i);
		
		while(arr1.size()!=0) {
			int i=arr1.get(0);
			arr1.remove(0);
			System.out.println(i);
		}
	}

}
