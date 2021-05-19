

import java.util.ArrayList;
import java.util.Scanner;

/*���ո��

7
0
2 6 7
2 1 4
0
2 3 2
0
0




9
1 6
3 5 3 8
0
2 1 7
1 9
0
1 2
0
0

 */

public class p3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		MyTree tree = new MyTree();
		
		//�إߩҦ��`�I
		int lines = Integer.parseInt(keyboard.nextLine());
		for(int i = 1; i <= lines; i++) {
			Element e = new Element(i);
			tree.add(e);
		}
		
		//�إߩҦ����l�`�I�����Y
		for(int i = 1; i <= lines ; i++) {
			String[] datas = keyboard.nextLine().split(" ");
			int j = Integer.parseInt(datas[0]); //���o�`�Ii���l�`�I��
			if(j == 0) {
				continue;
			}
			Element parent = tree.get(new Element(i)); //���o������
			for(int k = 1; k <= j; k++) {
				int value = Integer.parseInt(datas[k]);
				Element child = tree.get(new Element(value)); //���o�l����
				parent.children.add(child);
				child.parent = parent;				
			}
		}
		
		//�p��C�@�Ӹ`�I������
		tree.setHeight();
		
		System.out.println(tree.findRoot().value);
		System.out.println(tree.getHT());

	}

}

class Element{
    int value;
    Element parent;
	int height;
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

	public Element findRoot() {
		Element e = null;
		for(Element ee : list) {
			if(ee.parent == null) {
				e = ee;
				break;
			}
		}
		return e;
	}
	//�ѤU���W�O���h�ż�, ���� parent == null
	//�ƹ�W�i�H�ΩҦ����`�I�Ӻ�N�i�H�F
	public void setHeight() {
		for(Element e : list) {
			//�ڸ`�I
			if(e.parent == null) {
				continue;
			}
			
			//i �O�����W�]���h�ż�
			int i = 0;
			Element parent = e.parent;
			do {
				i++;
				//�Y�ثe�����O���O�������פ���p
				if(i > parent.height) {
					parent.height = i;
				}
				parent = parent.parent;
			}while(parent!=null);
		}
	}
	
	//�p���`����
	//�ƹ�W�p��D���`�I�Y�i
	public int getHT() {
		int ht = 0;
		for(Element e : list) {
			ht += e.height;
		}
		return ht;
	}
}