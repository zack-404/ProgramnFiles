package class8;

public class try_ {
	public static void main(String[] args) {
		//char_to_String_1();
		//char_to_String_2();
		//String_method();
		//split();
		print_format_2();
		
		
	}
	static void String_Test() {
		String a="java";
		String b="java";
		a.concat("apcs");//immutable
		//a=a.concat("apcs");
		System.out.println(a);
		StringBuilder sb=new StringBuilder("java");
		sb.append("apcs");//mutable
		System.out.println(sb);
		String c=new String("java");
		String d=new String("java");
		System.out.println(a+b+(a==b));//"=="�P�_stack�O�_�@��
		System.out.println(c+d+(c==d));//stack Heap���y��
		System.out.println(a+c+(c==a));//�@�˴N�|���V�@�˪��a��
		System.out.println("========");
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(a.equals(c));
	}
	static void char_to_String_1() {
		char a[]= {'j','a','v','a'};
		String b="";
		for(int m=0;m<a.length;m++) {
			b+=a[m];//�r�����r��
		}
		System.out.println(b);
	}
	static void char_to_String_2() {
		char a[]= {'j','a','v','a'};
		String b=new String(a);
		System.out.println(b);
	}
	static void write_into_String() {
		String a="";
		a+='a';
		System.out.println(a);
	}
	static void String_method() {
		String a="java",b=" j a v a ",c="jAva",d="java apcs",e="",f="https://www.pcschoolonline.com.tw";
		System.out.println(a.charAt(3));//���ޭȬ�n����
		//System.out.println(a.charAt(5));//�W�X���ޭ�
		System.out.println(a.equals(b));//true	
		System.out.println(a.equals(c));//false
		System.out.println(a.equalsIgnoreCase(c));//true
		System.out.println(a.compareTo(b));//0
		System.out.println(a.compareTo(c));//32 �j�g65 �p�g97
		System.out.println(a.compareTo(d));//-5
		System.out.println(f.startsWith("https://"));//true �q�T��w
		System.out.println(f.startsWith("ftp://"));//false �ɮ׶ǿ骺�q�T��w
		System.out.println(f.endsWith(".tw"));//true �O�W��
		System.out.println(a.length());//String���� 4
		System.out.println(a.indexOf("a"));//1
		System.out.println(a.lastIndexOf("a"));//3
		System.out.println(a.isEmpty());//false
		System.out.println(e.isEmpty());//true
		System.out.println("get"+b+"100");
		System.out.println("get"+b.trim()+"100");//�h�ť�
		System.out.println("get"+b.replace(" "," ")+"100");//�ɦr
		System.out.println(d.substring(5,7));//��� �Ĥ��Ӥ�����ĤC�Ӥ���
		System.out.println(d.substring(5));//��� �Ĥ��ӥH�᪺����
		System.out.println("===========");
		String[] name=f.split("/");//�H"/"���}
		for(String x:name) {
			System.out.print(x+"\t");}
		System.out.println();
		System.out.println("===========");
		
		
	}
	static void split() {
		String f="https://www.facebook.com/kghmrock";
		String[] name=f.split("");
		for(String x:name) {
			System.out.print(x+"\t");}
		System.out.println();
	}
	static void print_format_1() {
		/*
		 * %d_�Ʀr %s_�r�� %b_���L�� %f_�B�I�� %c_�r��
		 * 1$�եΤ��P�Ѽ�
		 * <�H�e�@�Ӥ��e��X
		 * o�K�i��
		 * x�Q���i��
		 * 0�H'0'�ɦh�l�ť� 
		 */
		String name="Zack";
		int age=16;
		boolean gender=true;
		char blood='O';
		double heigh=176.5;
		String output=String.format("My name is %s, age is %d type,blood type is %c, heigh is %8.1f, my gender is %s.",name,age,blood,heigh,gender?"male":"female");
		System.out.println(output);
	}
	static void print_format_2() {
		int a=10,b=50,c=90;
		System.out.printf("%d\n",a,b);
		System.out.printf("%1$d,%o\n",a,c);
	}
}








