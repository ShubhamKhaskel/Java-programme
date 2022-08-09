import java.util.*;
class prog1
{
  int[] fedback;
  void highestFeedBack(int metlife[],int hardfort[],int size)
  {
     fedback=new int[size];
     for(int i=0;i<size;i++)
     {
         /*if(metlife[i]>hardfort[i])
         {
             fedback[i]=metlife[i];
         }
         else if(metlife[i]<hardfort[i])
         {
           fedback[i]=metlife[i];  
         }
         else if()
         {
             
         }*/
         fedback[i]=(metlife[i]>hardfort[i]?metlife[i]:hardfort[i]);
     }
     for(int i=0;i<size;i++)
     {
         if(fedback[i]!=0)
         {
            System.out.println(i); 
            System.out.println(fedback[i]);
         }
     }
  }
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(n<0)
     {
         System.exit(1);
     }
     int[] MetLife=new int[n];
     int[] Hardfort=new int[n];
     //code with subhramoy
     
     /*for(int i=0;i<n;i++)
     {
        MetLife[i]=0;
     }
     for(int i=0;i<n;i++)
     {
        Hardfort[i]=0;
     }*/
     
     
     for(int i=0;i<n;i+=2)
     {
         int j=sc.nextInt();
        MetLife[j]=sc.nextInt();
        if(MetLife[j]<0)
        {
           System.exit(1); 
        }
     }
     for(int i=0;i<n;i+=2)
     {
         int j=sc.nextInt();
        Hardfort[j]=sc.nextInt();
        if(Hardfort[j]<0)
        {
           System.exit(1); 
        }
     }
     prog1 ob=new prog1();
     ob.highestFeedBack(MetLife,Hardfort,n);
     
     
     //eta kora
     
  }
}