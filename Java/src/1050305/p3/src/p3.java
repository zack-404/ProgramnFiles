

import java.util.ArrayList;
import java.util.Scanner;
/* �{�����խ�

5
160 180
150 200
280 300
300 330
190 210

1
120 120

*/
public class p3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int line = Integer.parseInt(keyboard.nextLine());
		
		ArrayList<A> list = new ArrayList<>();
		
		outer:
		for(int i = 0; i < line; i++) {
			String[] datas = keyboard.nextLine().split(" ");
			int start = Integer.parseInt(datas[0]);
			int end = Integer.parseInt(datas[1]);
			
			//�إ߷s����e, ���T�{��ȬO�����W��
			//(�S������ثe���X�������󪺰_�l�P�����Ȥ���)
			for(A aa : list) {
				//�Ystart�j��v�s�b����end
				if(start > aa.end) {
					continue; //�ˬd���X�����U�@�Ӫ���
				}
				//�Y end �p��v�s�b���� start
				if(end < aa.start) {
					continue; //�ˬd���X�����U�@�Ӫ���
				}
				//�Ystart�p��v�s�b���� start
				if(start <= aa.start) {
					//�ӥBend�j��v�s�b����end
					if(end > aa.end) {
						aa.start = start;
						aa.end = end;
						continue outer; //�ק�v�s�b���󪺭�, �����A�ˬd���X�����U�@�Ӫ���
					}else {
						aa.start = start;
						continue outer; //�ק�v�s�b���󪺭�, �����A�ˬd���X�����U�@�Ӫ���
					}
				}
				//�Ystart ����v�s�b����start�Pend����
				if(start >= aa.start && start <= aa.end) {
					//�Yend ����v�s�b����start�Pend����
					if(end >= aa.start && end <= aa.end) {
						continue outer; //�ק�v�s�b���󪺭�, �����A�ˬd���X�����U�@�Ӫ���
					}else {
						aa.end = end;
						continue outer; //�ק�v�s�b���󪺭�, �����A�ˬd���X�����U�@�Ӫ���
					}
				}
			}
			//�Y�S������ continue outer;
			//��ܨS���ק�v�s�b�������, �����إ߷s���W�ߪ���øm�J���X��
			A a = new A(start, end);
			list.add(a);
		}
		
		int allLength = 0;
		for(A a : list) {
			allLength += a.getLength();
		}
		System.out.println(allLength);
	}

}
class A{
	int start;
	int end;
	int length;
	public A(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public int getLength() {
		return end - start;
	}
	public String toString() {
		return start + ":" + end;
	}
}