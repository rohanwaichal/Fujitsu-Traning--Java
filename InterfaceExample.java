import java.util.Scanner;
interface SimpleInterest
{

public void calculate(int p,int n,int r);

}
class InterfaceExample implements SimpleInterest
{

public void calculate(int p,int n,int r){

System.out.println("The simple interst is:"+(p*n*r)/100);

}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for P ,n,R:");
int p=sc.nextInt();
int n=sc.nextInt();
int r=sc.nextInt();
InterfaceExample ex=new InterfaceExample();
ex.calculate(p,n,r);

}



}