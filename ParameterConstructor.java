import java.util.Scanner;
public class ParameterConstructor {
	
	public ParameterConstructor(){
		System.out.println("Within Default constructor");
	}
	public ParameterConstructor(String s){
		System.out.println("i="+s);
		System.out.println("Within Prameterize constructor");

	}
	public static void main(String args[]){
		ParameterConstructor parameterConstructor1 = new ParameterConstructor();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		ParameterConstructor parameterConstructor2 = new ParameterConstructor(str);

	}

}
