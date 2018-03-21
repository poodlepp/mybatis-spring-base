package app01a;

public class TransferDemo {
	public static void main(String[] args) {
		String str1 = "aa'ggg";
		String str2 = str1.replaceAll("'","\\\\\\\\");
		System.out.println(str2);
	}
}
