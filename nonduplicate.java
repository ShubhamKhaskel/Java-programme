import java.util.*;
class nonduplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int[] arr=new int[10];
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        //System.out.println("The uncommon elements are:-");
        for(i=0;i<10;i++)
        {
            //int x=arr[i];
            int count=0;
            for(int j=0;j<10;j++)
            {
                if(arr[j]==arr[i])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
            }
        }
        
        }
    }
