package vocabularyCard;

import java.util.Scanner;

/*
 one 一
  two 二
 three 三
  four 四
  five 五
  six 六
  seven 七
  eight 八
  nine 九
  ten 十
  dog 狗
  cat 貓
  burn 燒
  born 出生
  beat 節奏
 */

public class pro1 {
	
	private int i=0;
	
	public static String stor1="";//Eng
	public static String stor2="";//Chi
	public static String wtEng="";//wtEng
	public static String wtChi="";//wtChi
	public static String wwEng="";//wwEng
	public static String wwChi="";//wwChi
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[][]=new String [1][2];
		arr[0][0]="ans";
		arr[0][1]="que";
		leeMec2(arr);
		//control1();
	}
	
	static void control1() {
		System.out.println("Input 0 if you want to storage words.");
		System.out.println("Input 1 if you want to test words.");
		if(sc()==0)
			storage();
		else if(sc()==1)
			test();
		else {
			System.out.println("error input");
			System.out.println("Please input again.");
			control1();
		}
	}
	
	static int sc() {
		Scanner sc=new Scanner(System.in);
		int cont=sc.nextInt();
		return cont;
	}
	
	static void storage() {//input info English and Chinese
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input how many words do you want to starage.");
		int a=sc.nextInt();
		//String arr1[][]=new String [a][2];
		System.out.println("Please input your words, and use space to split English and Chinese.");
		System.out.println("Ex: English 英文.");
		System.out.println("Input \"#\" to break.");
		for(int j=0;j<a;j++) {
			String ln1=sc.next(),ln2=sc.next();
			if(ln1=="#"||ln2=="#")
				break;
			stor1+=ln1+",";
			stor2+=ln2+",";
//			arr1[j][0]=ln1;
//			arr1[j][1]=ln2;
		}
		stor1+=";";
		stor2+=";";
		main(null);
	}
	
	static String[][] buildWordArrays(int a) {//字卡陣列
		String arr1[]=stor1.split(";");
		String arr2[]=stor2.split(";");
//		String arr3[]=new String[6];
//		String arr4[]=new String[6];
		arr1=arr1[a].split(",");
		arr2=arr2[a].split(",");
		String arr[][]=new String [arr1.length][2];
		for(int i=0;i<arr1.length;i++) {
			arr[i][0]=arr1[i];
			arr[i][1]=arr2[i];
		}
		return arr;
	}
	
	static int[] makeRandom(int a) {//unfinish
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=i;
		}
		return arr;
	}
	
	static void test() {
		System.out.println("Which mode do you want to test, Chinese or English.");
		System.out.println("Input 0 if you want to test Chinese.");
		System.out.println("Input 1 if you want to test English.");
		control2();
		
	}
	
	static void control2() {
		if(sc()==0)
			testCard(0,1);
		else if(sc()==1)
			testCard(1,0);
		else {
			System.out.println("error input");
			System.out.println("Please input again.");
			control2();
		}
	}
	
	static void testCard(int con1,int con2) {
		System.out.println("Please input which word list do you want to test.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String arr1[][]=buildWordArrays(a-1);
		int b=arr1.length,c=0;
		int arr2[]=makeRandom(b);
		System.out.println("Input \"#\" to break.");
		for(int i=0;i<b;i++) {
			System.out.println(arr1[arr2[i]][con1]);
			String ln=sc.next();
			if(ln.equalsIgnoreCase(arr1[arr2[i]][con2])) {
				c++;
				continue;
			}
			else {
				System.out.println(arr1[arr2[i]][0]+" "+arr1[arr2[i]][0]);
				leeMec1(arr1[arr2[i]][con1], arr1[arr2[i]][con2]);
			}
		}
		System.out.println(c+"/"+b);
		main(null);
		
	}
	
	
//	static boolean testTrueFalse(String in, String ans, String que) {//ans,que
//	}
	
	public static int z=0;
	
	static void leeMec1(String ans,String que) {
		String arr[][]=new String[7][2];
		arr[z][0]=ans;//0: c, 1: e
		arr[z][1]=que;//0: e, 1: c
		System.out.println(arr[z][0]);
		System.out.println(arr[z][1]);
		System.out.println(z);
		z++;
		if(z==6) {
			leeMec2(arr);
		}
	}
	
	static void leeMec2(String wrong[][]) {//三疊紀 錯
		int arr1[]=makeRandom(z);
		for(int i=0;i<z;i++) {
			System.out.println(wrong[arr1[i]][1]);
			Scanner sc=new Scanner(System.in);
			String ln=sc.next();
			if(ln.equalsIgnoreCase(wrong[arr1[i]][1])) {
				storageWrong(wrong[arr1[i]][1], 0);
				storageWrong(wrong[arr1[i]][0], 0);
			}else {
				storageWrong(wrong[arr1[i]][1], 1);
				storageWrong(wrong[arr1[i]][0], 1);
			}
		}
		z=0;
	}
	
	static void storageWrong(String ln,int j) {
		char arr[]=ln.toCharArray();
		int i=(int)(arr[0]);
		if(((i>64&&i<91)||(i>96&&i<123))) {//65 90 97 122
			if(j==0) {
				wtEng+=ln;
			}else
				wwEng+=ln;
		}else {
			if(j==0)
				wtChi+=ln;
			else
				wwChi+=ln;
		}
	}
	
// 	static void buildArrays() {//build Eng.arr Chi.arr
//		String arr1[]=stor1.split(";");
//		String arr2[]=stor2.split(";");
//		String arr3[]=new String[6];
//		String arr4[]=new String[6];
//		System.out.println("Please input which word list do you want to test.");
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		arr1=arr1[a].split(",");
//		arr2=arr2[a].split(",");
//		//random arrays
//		
//		//which mode
//		System.out.println("Input 0 if want to test Chinese.");
//		System.out.println("Input 1 if want to test English.");
//		int b=sc.nextInt(),c=0,d=0;
//		if(b==1) {
//			for(int j=0;j<arr1.length;j++) {
//				System.out.println(arr2[j]);
//				String ans=sc.next();
//				if(arr1[j].equals(ans)) {
//					c++;
//					break;
//				}
//				else {
//					System.out.println(arr1[j]+" "+arr2[j]);
//					arr3[d]=arr1[j];
//					arr4[d]=arr2[j];
//					d++;
//				}
//				if(d>6) {
//					for(int k=0;k<6;k++) {
//						
//					}
//				}
//			}
//			System.out.printf("Your score is %d/%d",arr1.length-c,arr1.length);
//		}else if(b==0) {
//			for(int j=0;j<arr1.length;j++) {
//				System.out.println(arr1[j]);
//				String ans=sc.next();
//				if(arr2[j].equals(ans)) {
//					c++;
//					break;
//				}
//				else {
//					System.out.println(arr2[j]+" "+arr1[j]);
//					
//				}
//			}
//			System.out.printf("Your score is %d/%d",c,arr1.length);
//			
//		}else {
//			System.out.println("error num. Please input again.");
//			b=sc.nextInt();
//		}
//		
//		//checkAnswer
//		
//	}
//	
//	static void checkAnswer() {
//		
//	}
	

}
