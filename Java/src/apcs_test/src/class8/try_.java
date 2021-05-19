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
		System.out.println(a+b+(a==b));//"=="判斷stack是否一樣
		System.out.println(c+d+(c==d));//stack Heap的座標
		System.out.println(a+c+(c==a));//一樣就會指向一樣的地方
		System.out.println("========");
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(a.equals(c));
	}
	static void char_to_String_1() {
		char a[]= {'j','a','v','a'};
		String b="";
		for(int m=0;m<a.length;m++) {
			b+=a[m];//字元丟到字串
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
		System.out.println(a.charAt(3));//索引值為n的值
		//System.out.println(a.charAt(5));//超出索引值
		System.out.println(a.equals(b));//true	
		System.out.println(a.equals(c));//false
		System.out.println(a.equalsIgnoreCase(c));//true
		System.out.println(a.compareTo(b));//0
		System.out.println(a.compareTo(c));//32 大寫65 小寫97
		System.out.println(a.compareTo(d));//-5
		System.out.println(f.startsWith("https://"));//true 通訊協定
		System.out.println(f.startsWith("ftp://"));//false 檔案傳輸的通訊協定
		System.out.println(f.endsWith(".tw"));//true 臺灣的
		System.out.println(a.length());//String長度 4
		System.out.println(a.indexOf("a"));//1
		System.out.println(a.lastIndexOf("a"));//3
		System.out.println(a.isEmpty());//false
		System.out.println(e.isEmpty());//true
		System.out.println("get"+b+"100");
		System.out.println("get"+b.trim()+"100");//去空白
		System.out.println("get"+b.replace(" "," ")+"100");//補字
		System.out.println(d.substring(5,7));//選取 第五個元素到第七個元素
		System.out.println(d.substring(5));//選取 第五個以後的元素
		System.out.println("===========");
		String[] name=f.split("/");//以"/"分開
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
		 * %d_數字 %s_字串 %b_布林值 %f_浮點數 %c_字元
		 * 1$調用不同參數
		 * <以前一個內容輸出
		 * o八進位
		 * x十六進位
		 * 0以'0'補多餘空白 
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








