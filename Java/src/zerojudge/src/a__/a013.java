package a__;

import java.util.Scanner;

public class a013 {

	private final static String romanNum[]= {"M","DM","D","CD","C","LC","L","XL","X","VX","V","IV","I"};
	
	private final static int aNum[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
	/*
I	1
V	5
X	10
L	50
C	100
D	500
M	1,000
1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in=sc.nextLine();
		
		String inp1 = sc.next(),inp2=sc.next();
		
		int a=toAnum(inp1),b=toAnum(inp2),c=Math.abs(a-b);
		String d="";
		d+=c;
		System.out.println(toRnum(d));
	}
	static void forAll() {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		for(int i=0;i<11;i++) {
			if(in.indexOf(i)>=0)
				toRnum(in);
			else 
				toAnum(in);
		}
	}

	static int explodeString(String in) {
		int num=0;
		StringBuilder Buffer=new StringBuilder(in);
		for(int i=0;Buffer.length()>0&&i<aNum.length;i++) {
			while(Buffer.indexOf(romanNum[i])==0) {
				num=num+aNum[i];
				Buffer.delete(0, romanNum[i].length());
			}			
		}
		return num;
	}
	static String toRnum(String in) {
		String Rnum="";
		int a=Integer.parseInt(in);
		if(a==0)
			return "ZERO";
		else if(a<0||a>4000)
			return "OVER FLOW";
		for(int j=0;j<aNum.length;j++) {
			while(a-aNum[j]>0) {
				Rnum+=romanNum[j];
			}
		}		
		return Rnum;
	}
	static int toAnum(String in) {
		int a=0;
		for(int i=0;i<romanNum.length;i++) {
			while (in.indexOf(romanNum[i])==0) {
				a+=aNum[i];
				in=in.substring(1,in.length());
			}
		}
		return a;
	}
}
