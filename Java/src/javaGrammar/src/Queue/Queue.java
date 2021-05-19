package Queue;

public class Queue {//first-in-first-out

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Element arr1[]=new Element[a];
		for(int i=0;i<a;i++)
			arr1[i].value=i;
		System.out.println(arr1[3].back);
		System.out.println(arr1[3].front);
		while(true) {
			//ELement e=arr1.g
		}
	}

}

class Element{
	int value;
	Element front;
	Element back;
	Element(int value){
		this.value=value;
	}
}

class _Queue{
	Element first;
	Element last;
	public void add(Element e) {
		if(first==null) {
			first=e;
			last=e;
			return;
		}
		last.back=e;
		e.front=last;
		last=e;
	}
	
	public Element getAndRemove() {
		if(first==null)
			return null;
		if(first==last) {
			Element e=first;
			first=null;
			return e;
		}
		Element e=first;
		first=e.back;
		return e;
	}
}




