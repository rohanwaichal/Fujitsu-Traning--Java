package Day3Acc;

import java.util.Scanner;
public class StringOperation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string :");
		String word=scan.next();
		System.out.println("The length of the endered string is :"+findLength(word));
		System.out.println("The uppercase form of the entered string is : "+convertUpper(word));
		scan.close();
	}
	private static int findLength(String a){
		int len=a.length();
		return len;
	}
	private static String convertUpper(String b){
		String c=b.toUpperCase();
		return c;
	}
}
