package StringType;

public class split {
	public static void main(String[] args) {
		String f="sdf/sd/sd/werfg/sd/scv/g/e";
		String[] name=f.split("/");//�H"/"���}
		for(String x:name) {
			System.out.print(x+"\t");
		}
	}
}
