package class10;

import javax.swing.JOptionPane;

public class NumberGame {
	public static void main(String[] args) {
		int ans[]=new int[4];
		int gus[]=new int[4];
		for(int i=0;i<ans.length;i++) {
			ans[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<gus.length;j++) {
				if (ans[i]==gus[j]) {
					i--;
					break;
				}
			}
		}
		for(int x:ans) {
			System.out.print(x);
		}
		System.out.println();
		String a=JOptionPane.showInputDialog("Please input a 4 numbers number.");
		for (int i=0;i<a.length();i++) {
			gus[i]=a.substring(i,i+1);
		}
		for(int x:gus) {
			System.out.print(x);
		}
	}
}
