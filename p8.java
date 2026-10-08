public class p8 
{
  public static void main(String args[])
  {
    System.out.println("Using for loop :");
     for(int i=1;i<=10;i++)
     {
      if (i ==5)
      {
       continue;
      }
      if (i == 8)
      {
       break;
      }
     System.out.print(i+" ");
     }
    System.out.println("\n\nUsing while loop :");
    int j=1;
    while(j<=10)
    { 
     if (j==5)
     {
      j++;
      continue;
     }
     if (j == 8)
     {
       break;
      } System.out.print(j +" ");
       j++;
      
    }
   System.out.println("\n\nUsing do while loop :");
   int k=1;
   do
     { 
      if(k==5)
       {
        k++;
        continue;
       }
      if(k==8)
       {
        break;
       }
     System.out.print(k +" ");
     k++;
     }while(k<=10);
  }
}