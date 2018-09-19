import java.util.Scanner;
class ArmPalinStr
{
	
   	public static void main(String args[])
    	{
		Scanner sc=new Scanner(System.in);
	        while(true)
      		{
                	System.out.println("*******************Menu********************");
        		System.out.println("1.ArmStrong\n2.Palindrome\n3.Stringreverse\n4.exit\n enter your choice:");
        		int ch=sc.nextInt();
 			switch(ch)
      			{
       			 case 1:ArmStrong();break;
       			 case 2:Palindrome();break;
      			 case 3:StringRev1();break;
      			 case 4:break;
       			 default:System.out.println("Invalid choice....");
			}
	      
   		 }



     	}
  

 static void ArmStrong()
 {
	   Scanner sc=new Scanner(System.in);	
 	   int sum=0;
 	   System.out.println("enter  the number:");
 	   int num=sc.nextInt();
 	   int num1=num;
 	   while(num>0)
   	   {
    	     int rem=num%10;
  	     sum=sum+(rem*rem*rem);
             num=num/10;
	   }

  	if(sum==num1)
	{
   
      System.out.println("The number is ArmStrong");
 	}
	else
 	{
     System.out.println("The number is  not ArmStrong");
	}

 }

  static void Palindrome()
  {
	Scanner sc=new Scanner(System.in);
    int sum=0;
    System.out.println("enter  the number:");
    int num=sc.nextInt();
    int num1=num,rem;
    while(num>0)
   {
    rem=num%10;
    sum=(sum*10)+rem;
    num=num/10;


   }
 
  	if(sum==num1)
  	{
   
      System.out.println("The number is palindrome");
 	}
	else
 	{	
 	    System.out.println("The number is  not palindrome");
	}
}

 static void StringRev1()
 {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter  the String:");
    String str=sc.next();
    String str1="";
    for(int i=str.length()-1;i>=0;i--)
   {

    str1=str1+str.charAt(i);

   }

   System.out.println("The string reverse is:"+str1);
  }


}