package forLoop;

public class for1 {
	public static void main(String[] args) {
		/*
		 * for(計數值;布林運算式;除了敘述式都可以){
		 * 		運算或敘述式
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
		for(i=0;i<11;i++) ;//大括號拿掉就執行到下一個分號
		System.out.println(i);
	}
	static void _for4() {
		int i=0;
		for(i=0;i<11;i++) //大括號拿掉就執行到下一個分號
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
