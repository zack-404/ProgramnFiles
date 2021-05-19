

import java.util.ArrayList;
import java.util.Scanner;

/*

10
4 7 2 9 6 0 8 1 5 3

3
0 2 1

 */

public class p2 {

	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		br.nextLine();
		String[] datas = br.nextLine().split(" ");
		
		//������J�ëإߪ���m�J���X
		ArrayList<Student> students = new ArrayList<>();
		for(int i = 0; i < datas.length; i++) {
			Student s = new Student();
			s.value = i;
			s.friend = Integer.parseInt(datas[i]);
			students.add(s);
		}
		
		//�O���s�ռ�
		int groupCount = 0;
		
		for(int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if(s.hasGroup) { //�v�g�ݩ�Y�@�Ӥp�s��
				continue;
			}
			
			int startValue = s.value;
			s.hasGroup = true;
			groupCount++;
			while(s.friend != startValue) { //���X�򦨤@�Ӥp�s��
				s = students.get(s.friend); 
				s.hasGroup = true;
			}
		}
			
		System.out.println(groupCount);
	}

}

//�إ����O, ����ݰO�� value, friend, hasGroup
class Student{
	int value;
	int friend;
	boolean hasGroup;
	public String toString() {
		return value +":" + friend + ":" + hasGroup;
	}
}