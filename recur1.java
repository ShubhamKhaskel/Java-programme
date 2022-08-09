import java.util.*;//find whether the arry is sorted or not
class recur1
{
    static int fact(int n)
    {
        int s=0;
      if(n==0 || n==1)  
      {
          return 1;
      }
      else
      {
        return n*fact(n-1);
      }
    }
    public static void main(String args[])
    {
       int s=fact(5); 
       System.out.println(s);
    }
}