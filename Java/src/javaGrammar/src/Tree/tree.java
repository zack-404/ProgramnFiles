package Tree;

import java.util.ArrayList;

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Element{
	int value;
	Element parent;
	ArrayList<Element> children=new ArrayList<>();
	
	public Element(int value) {
		this.value=value;
	}
//	public ArrayList<Element> getParents(){}
//	public boolean equals(Object o){}
//	public int hashCode(){}
}

class Tree{
	ArrayList<Element> allElement=new ArrayList<>();
	Element root;
	public void add(Element e) {}//add node
	//public Element get(Element e) {}
	
}
