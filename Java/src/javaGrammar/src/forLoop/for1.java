package forLoop;

public class for1 {
	public static void main(String[] args) {
		/*
		 * for(�p�ƭ�;���L�B�⦡;���F�ԭz�����i�H){
		 * 		�B��αԭz��
		 * }
		 */
		for1();
		for2();
		for3();
		for4();
		_for4();
		for5();
		for6();
	}
	static void for1() {
		int i=0;
		for(i=0;i<11;i++) {
		System.out.println(i);
		}	
	}
	static void for2() {
		int i=0;
		for(i=0;i<11;) {
			i++;
		}System.out.println(i);
	}
	static void for3() {
		int i=0;
		for(i=0;i<11;) 
			i++;
		System.out.println(i);
	}
	static void for4() {
		int i=0;
		for(i=0;i<11;i++) ;//�j�A�������N�����U�@�Ӥ���
		System.out.println(i);
	}
	static void _for4() {
		int i=0;
		for(i=0;i<11;i++) //�j�A�������N�����U�@�Ӥ���
		System.out.println(i);
	}
	static void for5() {
		int i=0,j=0;
		for(i=0;i<11;i++,j++) ;
		System.out.println(i+" "+j);
	}
	static void for6() {
		int i=0,j=0;
		for(i=0;i<11&&j<11;i++,j++) ;
		System.out.println(i+" "+j);
	}
}
