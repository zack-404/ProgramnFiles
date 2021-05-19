package class8;

public class open_close_door {
	public static void main(String[] args) {
		boolean oc[] = new boolean[100];
		for(int i=0;i<101;i++) {
			for (int j=1;i*j<101;j++) {
				oc[i*j]=!oc[i*j];
			}
		}
	}
}
