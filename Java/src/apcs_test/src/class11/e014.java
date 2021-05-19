package class11;

import java.util.Scanner;

public class e014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	public static String arr1[][]= {
			{"iiii", "9999"},{"cccc", "3333"},{"dddd", "4444"},
			{"eeee", "5555"},{"aaaa", "2222"},{"ffff", "6666"},
			{"gggg", "7777"},{"hhhh", "8888"},{"bbbb", "1111"}
	};
	
	public static String arr[]={
		
	};

	static void sol1() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),r=0,w=0;
		for(int i=0;i<a;i++) {
			String acc=sc.next(),pas=sc.next();
			int j=findAccount(acc);
			if(j==10)
				continue;
			if(arr1[j][1].equals(pas))
				r++;
			else w++;
		}
		System.out.println(r+" "+w);
//		for(int i=0;i<a;i++)
//			for(int j=0;j<b;j++)
//				arr1[i][j]=sc.nextInt();
	}
	
	static int findAccount(String acc) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i][0].equals(acc))
				return i;
		}
		return 10;
	}

}

//新增類別class
class AccountPasswords{
	String account;
	String passwords;
	//建構方法
	AccountPasswords(String account,String passwords){
		this.account=account;
		this.passwords=passwords;
	}
}

class AccountPasswords2{
	String account;
	String passwords;
	//建構方法
	AccountPasswords2(String account,String passwords){
		this.account=account;
		this.passwords=passwords;
	}
	
	public void test() {
		
	}
}
/*
 * AccountPasswords(String account,String passwords){
		this.account=account;
		this.passwords=passwords;
	}
	
	AccountPassword(String account,String passwords){
		this.account=account;
		this.passwords=passwords;
	}
 */

