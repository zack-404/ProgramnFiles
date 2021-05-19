package class11;

public class e001 {
	public static void main(String[] args) {
		//solution2();
		//space5();
		test();
	}
	static void solution1() {
		System.out.println("     *");
		System.out.println("    ***");
		System.out.println("   *****");
		System.out.println("  *******");
		System.out.println(" *********");
		System.out.println("***********");
	}
	static void solution2() {
		for(int i=1;i<11;i+=2) {
			for(int j=1,k=5;j<i&&k>0;j+=2,k--) {
				for(int l=0;l<k;l--)
					System.out.print(" ");
				for(int l=0;l<j;l++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
	static void space5() {
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("s");
			System.out.println();
		}
	}
	static void test() {
		for(int j=1,k=5;j<12&&k>0;j++,k--) {
			for(int l=0;l<k;l--)
				System.out.print(" ");
			for(int l=0;l<j;l++)
				System.out.print("*");
			System.out.println();
		}
	}
}
//     *
//    ***
//   *****
//  *******
// *********
//***********