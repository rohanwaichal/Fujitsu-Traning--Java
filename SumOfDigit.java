package Programs12;
import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		int s=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!='\0')
				{
			int rev=num%10;
			s=s+rev;
			num=num/10;
						
				}
		System.out.println("The sum of digits is="+s);
	}

}
