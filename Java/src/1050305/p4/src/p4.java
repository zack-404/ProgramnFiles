

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*���ո��
8
0 1
0 2
0 3
7 0
1 4
1 5
3 6


4
0 1
0 2
2 3
 */
public class p4 {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		MyTree tree = new MyTree();
		
		//�����Ĥ@�檺��J��K�i�H�إߩҦ���������,�øm�J�𪫥󪺦�C��
		int lines = Integer.parseInt(keyboard.nextLine());
		for(int i = 0; i < lines; i++) {
			Element e = new Element(i);
			tree.add(e);
		}
		
		//������L��J, �ëإߩҦ����󪺤��l���Y
		for(int i = 1; i < lines; i++) {
			String[] datas = keyboard.nextLine().split(" ");
			int a = Integer.parseInt(datas[0]);
			int b = Integer.parseInt(datas[1]);
			Element A = tree.get(new Element(a));
			Element B = tree.get(new Element(b));
			A.children.add(B);
			B.parent = A;
		}
		
		
		//���o�Ҧ����`�I
		ArrayList<Element> leaves = tree.getAllLeaf();
		//�p��Ҧ����`�I���Z��, ���X�ñƧ�
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < leaves.size() -1; i++) { //�C�@�Ӥ����P�᭱���Ҧ��������
			for(int j = i + 1; j < leaves.size(); j++) {
				int far = tree.getFar(leaves.get(i),leaves.get(j));
				list.add(far);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}

}

class Element{
    int value;
    Element parent;
    ArrayList<Element> children = new ArrayList<>();
    Element(int value){
        this.value = value;
    }
    public ArrayList<Element> getParents(){
            ArrayList<Element> parents = new ArrayList<>();

            Element e = parent;
            while(e != null) {
                    parents.add(0,e); //�V�W�h�����`�I�ƶV�e��
                    e = e.parent;
            }
            return parents;
    }
    public boolean equals(Object o) {
            Element e = (Element)o;
            if(value == e.value) {
                    return true;
            }
            return false;
    }
    public int hashCode() {
            return value;
    }
}
class MyTree{
	ArrayList<Element> list = new ArrayList<>();
	
	public void add(Element e) {
		list.add(e);
	}
	public Element get(Element e) {
		int index = list.indexOf(e);
                if(index < 0){
                    return null;
                }
		return list.get(index);
	}	
    //���o�Ҧ����`�I
	public ArrayList<Element> getAllLeaf(){
		ArrayList<Element> allLeaf = new ArrayList<>();
		for(Element e : list) {
			//�S���l�`�I�̬����`�I
			if(e.children.size() == 0) {
				allLeaf.add(e);
			}
		}
		return allLeaf;
	}
	
	//���o��Ӹ��`�I�����Z��
	public int getFar(Element e1, Element e2) {
		//���o��Ӥ����ѤW���U�ƦC�����`�I���X
		ArrayList<Element> p1 = e1.getParents(); //7 0 1 => 5 
		ArrayList<Element> p2 = e2.getParents(); //7 0 3 => 6	
		
		int far = 0;
		
		//���Ĥ@�Ӥ��@�˪����`�I���e���@�Ӹ`�I�K�O�@�P�����`�I		
		int sameParentCount = 0; // �O���O�ĴX�Ӥ������@�P���`�I
		int length = p1.size() < p2.size() ? p1.size():p2.size(); //���`�I�ƶq���@�ˮ�, �H�֪����D
		for(int i = 0; i < length; i++) {
			if(!p1.get(i).equals(p2.get(i))) {
				break;
			}
			sameParentCount++;
		}
		
		//�p���Ӹ��`�I�������Z��
		//p1 -> sameParent
		far = p1.size() - sameParentCount + 1;
		//sameParent -> p2
		far += p2.size() - sameParentCount + 1;
		
		return far;
	}
	public String toString() {
		return list.toString();
	}
}