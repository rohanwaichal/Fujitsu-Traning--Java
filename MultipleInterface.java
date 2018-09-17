import java.util.Scanner;

interface discount10
{

public void calculatedis1(double price);

}
interface discount20 extends discount10
{

public void calculatedis2(double price);

}





class MultipleInterface implements discount10,discount20
{

public void calculatedis1(double price)
{
  double result;
  if(price>500)
  { 
   result=(0.10)*price;
   System.out.println("discounted price:"+result);
   }
  else 
   {
     System.out.println("for less 500 no discount");
   }


 }
public void calculatedis2(double price)
{
  double result;
  if(price>1000)
  { 
   result=(0.05)*price;
   System.out.println("discounted price:"+result);
   }
  else 
   {
     calculatedis1(price);
   }


 }

  public static void main(String args[])
{

   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the price:");
   double price=sc.nextDouble();
   
  MultipleInterface m=new MultipleInterface();
  m.calculatedis2(price);
}


}