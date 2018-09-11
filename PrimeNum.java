package Programs12;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		int temp;
		int f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		sc.close();
		for(int i=2;i<=num/2;i++){
			temp=num%i;
			if(temp==0){
				f=1;
				break;
			}
		}
			if(f==0){
				System.out.println(num+"is a Prime NUmber");
			}
			else{
				System.out.println(num+" is not a Prime Number");
			}
			
		}

}
