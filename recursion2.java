/*
 
 input->shubham
 output->mahbuhs
 
*/

import java.util.*;
class recursion2
{
  public static void reverse(String s,int len)
  {
     if(len==0)
     {
        //System.out.print(s.charAt(0)+" "); 
        return;
     }
     System.out.print(s.charAt(len-1)+" ");
     reverse(s,len-1);
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int len=s.length();
      reverse(s,len);
  }
}