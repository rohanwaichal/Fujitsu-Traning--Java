package Threeclasses;

import java.util.Scanner;

public class Actual {

	public static void main(String[] args) {
		Addition addition = new Addition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int result1 = addition.addition(num1, num2);
		System.out.println("The addition of two numbers=" + result1);
		System.out.println("Enter the two numbers:");
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		Multiplication multiplication = new Multiplication();
		int result2 = multiplication.multiplication(num3, num4);
		System.out.println("The multiplication of two numbers=" + result2);

	}

}
