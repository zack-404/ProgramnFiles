package Element;

public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_Element ele[]=new _Element[10];
		for(int i=0;i<10;i++)
			ele[i]=new _Element(i);
		System.out.println(ele[3].value);
		System.out.println(ele[3].front);
		System.out.println(ele[3].back);
	}
}

class _Element{
	int value;
	_Element front;
	_Element back;
	_Element(int value){
		this.value=value;
	}
}
