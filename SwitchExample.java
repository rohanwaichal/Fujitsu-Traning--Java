import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int choice;
		System.out.println("1. Addition.");
		System.out.println("2. Subtraction.");
		System.out.println("3. Multiplication.");
		System.out.println("Enter your choice : ");
		choice=scan.nextInt();
		System.out.println("Enter First number: ");
		int first =scan.nextInt();
		System.out.println("Enter Second number: ");
		int second=scan.nextInt();
		switch(choice){
			case 1:
				System.out.println("Result :"+addNumbers(first,second));
				break;
			case 2:
				System.out.println("Result :"+subNumbers(first,second));
				break;
			case 3:
				System.out.println("Result :"+mulNumbers(first,second));
				break;
			default:
				System.out.println("Invalid Input");
									
		};
	scan.close();	
	}
	private static int addNumbers(int a, int b){
		int c=a+b;
		return c;
	}
	private static int subNumbers(int a1, int b1){
		int c1=a1-b1;
		return c1;
	}
	private static int mulNumbers(int a2, int b2){
		int c2=a2*b2;
		return c2;
	}

}
