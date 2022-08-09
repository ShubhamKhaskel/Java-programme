import java.util.*;//find whether the arry is sorted or not
class arr2
{
    public static void main(String args[])
    {
        int[] arr={2,6,7,3,2};
        int i,flag=0;
        for(i=0;i<4;i++)
        {
           if(arr[i]<arr[i+1]) 
           {
               flag=1;
           }
           else
           {
               flag=0;
               break;
           }
        }
        if(flag==1)
        {
            System.out.println("Sorted in ascending order");
        }
        else
        {
            System.out.println("not sorted at all");
        }
    }
}