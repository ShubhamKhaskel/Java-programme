/*
     5
     4
     3
     2
     1
 

import java.util.*;
class recursion1
{
    public static void printnumber(int n)
    {
        if(n==0)
        {
            return;
        }
          System.out.println(n);
          printnumber(n-1);
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     printnumber(n);
  }
} 

        1
        2
        3
        4
        5
        
import java.util.*;
class recursion1
{
    public static void printnumber(int n)
    {
        if(n==6)
        {
            return;
        }
          System.out.println(n);
          printnumber(n+1);
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     printnumber(n);
  }
} 


        1
        2
        3
        4
        5

import java.util.*;
class recursion1
{
    public static void printnumber(int n)
    {
        if(n==0)
        {
            return;
        }
          printnumber(n-1);
          System.out.println(n);
         
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     printnumber(n);
  }
} 


     SUM= 15 

import java.util.*;
class recursion1
{
    public static void printsum(int i,int n,int sum)
    {
        if(i==n)
        {
            sum=sum+n;
            System.out.println("SUM= "+sum);
            return;
        }
        sum=sum+i;
        printsum(i+1,n,sum);
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     //int n=sc.nextInt();
     printsum(1,5,0);
  }
}


FACTORIAL=>120


import java.util.*;
class recursion1
{
    public static void printfactorial(int n,int f)
    {
       if(n==1)
       {
          System.out.println("FACTORIAL=>"+f);
          return;
       }
       f=f*n;
       printfactorial(n-1,f);
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     printfactorial(n,1);
  }
}


FACTORIAL=>120

import java.util.*;
class recursion1
{
    public static void printfactorial(int n,int f)
    {
       if(n==1)
       {
          System.out.println("FACTORIAL=>"+f);
          return;
       }
       f=f*n;
       printfactorial(n-1,f);
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     printfactorial(n,1);
  }
}

0->1->1->2->3->5->


import java.util.*;
class recursion1
{
    
    public static void printfibonacci(int a,int b,int n)
    {
      if(n==0)
      {
          return;
      }
      int c=a+b;
      System.out.print(c+"->");
      printfibonacci(b,c,n-1);
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a=0,b=1;
     System.out.print(a+"->"+b+"->");
     printfibonacci(a,b,n-2);
  }
}

POWER: 81
*/
import java.util.*;
class recursion1
{
    
    public static void power(int a,int n,int s)
    {
      if(n==0)
      {
          System.out.println("POWER: "+s);
          return;
      }
      s=s*a;
      power(a,n-1,s);
    }
    
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a=sc.nextInt();
     power(a,n,1);
  }
}


