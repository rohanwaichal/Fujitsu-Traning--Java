class Ascdesc
{
   public static void main(String args[])
{
   int arr[]={2,4,1,6,9,7};
   for(int i=0;i<=2;i++)
     {
        for(int j=i;j<=2;j++)
         {
            if(arr[i]>arr[j+1])
               {
                int temp=arr[i];
                     arr[i]=arr[j+1]; 
                     arr[j+1]=temp;    

                }
          }

     }
    for(int i=3;i<5;i++)
   {
       for(int j=i;j<5;j++)
         {
         if(arr[i]<arr[j+1])
          {
               int temp=arr[i];
               arr[i]=arr[j+1]; 
               arr[j+1]=temp;

           }
         }
  
}
for(int i=0;i<6;i++)
  {

System.out.println(arr[i]);

  }


}
}