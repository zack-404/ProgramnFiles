package p2;

import java.util.Scanner;

/* ���ո��

1
aBBdaaa

3
DDaasAAbbCC

2
aafAXbbCDCCC

3
DDaaAAbbCC

 */
public class p2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int k = Integer.parseInt(keyboard.nextLine());
		String data = keyboard.nextLine();
		
		
		//�O���̤j����
		int biggestLength = 0;
		
		//�O���ثe�֭p�r��
		String ks = "";
		
		begin:
		for(int i = 0; i < data.length();) {
			String s = "";
			for(int j = 0; j < k; j++) {//�C���걵k�Ӧr��
				if((i+j)>=data.length()) {
					break begin;
				}
				s+=data.charAt(i + j); 
			}
			
			//�Yks�ثe�O�Ū�,��ܥثe�r��j�g�Τp�g���i�H, �u�nŪ�i�Ӫ�k�Ӧr���Y�O���T��,���~��Ūk�Ӧr�� 			
			if(ks.length() == 0) {
				if(sameUpperCase(s) ||  sameLowerCase(s)) {
					ks+=s;
					i+=k;
					if(ks.length() > biggestLength) {
						biggestLength = ks.length();
					}
					continue;
				}
			}
			//�Yks�ثe���O�Ū�, �����ѳ̫�@�Ӧr���P�_�{�b�n�ˬd���O�j�g�٬O�p�g
			if(ks.length()!= 0 && ks.charAt(ks.length()-1) >= 'a' && ks.charAt(ks.length()-1)<='z'&& sameUpperCase(s) ) {
				ks+=s;
				i+=k;
				if(ks.length() > biggestLength) {
					biggestLength = ks.length();
				}
				continue;
			}	
			if(ks.length()!= 0 && ks.charAt(ks.length()-1) >= 'A'&& ks.charAt(ks.length()-1)<='Z' && sameLowerCase(s) ) {
				ks+=s;
				i+=k;
				if(ks.length() > biggestLength) {
					biggestLength = ks.length();
				}
				continue;
			}
			
			
			//�����o��, ��ܳs��r��v���_, �����q�̫�@�� k�Ӧr���e���U�@�ӧǸ��}�lŪk�Ӧr��		
			if(ks.length()!= 0) {
				i-=k;
			}
			i++;						
			ks = "";
		}
		System.out.println(biggestLength);
	}
	public static boolean sameUpperCase(String s) {
		for(int i = 0 ; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c < 'A' || c >'Z'){
				return false;
			}
		}		
		return true;
	}

	public static boolean sameLowerCase(String s) {
		for(int i = 0 ; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c <'a' || c >'z'){ // ���O�p�g
				return false;
			}
		}
		return true;
	}

}
