package Programs12;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int f=1;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int j=str.length()-1;
		int n=str.length();
		int k=j;
		for(int i=0;i<n/2;i++,j--){
			if(str.charAt(i)==str.charAt(j)){
				break;
			}
			f++;
		}
		if(f==k){
			System.out.println("String is not Palindrome.");
		}
		else
			System.out.println("String is a Palindrome.");
	}

}
