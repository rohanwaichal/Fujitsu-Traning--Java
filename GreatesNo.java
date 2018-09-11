package Programs12;
import java.util.Scanner;
public class GreatesNo {
	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("Enter the 10 elements :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
		if(max<arr[i]){
			max=arr[i];
		}
		}
		System.out.println("Ther greatest number is :"+max);
	}
}
