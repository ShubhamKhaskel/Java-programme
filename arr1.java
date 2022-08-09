import java.util.*;
class arr1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter some nos\n");
        for(int i=0;i<5;i++)
        {
          arr[i]=sc.nextInt();  
        }
        System.out.println("\nenter the finding value");
        int n=sc.nextInt();
        
        for(int i=0;i<5;i++)
        {
           if(n==arr[i])
           {
           System.out.println("foundddddd"); 
           }
    }
}
}