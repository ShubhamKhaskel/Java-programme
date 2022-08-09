/*
     *****
   *****
  *****
 *****
*****


import java.util.*;
class pattern3
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    1     
   2 2    
  3 3 3   
 4 4 4 4  
5 5 5 5 5 


import java.util.*;
class pattern3
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

            *    
           ***   
          *****  
         ******* 
        *********

import java.util.*;
class pattern3
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
               System.out.print("*"); 
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

            1    
           212   
          32123  
         4321234 
        543212345


import java.util.*;
class pattern3
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            if(i>=2)
            {
                  for(int j=2;j<=i;j++)
                {
                    System.out.print(j);
                }  
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

            *    
           ***   
          *****  
         ******* 
        *********
        *********
         ******* 
          *****  
           ***   
            *    

*/

import java.util.*;
class pattern3
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
               System.out.print("*"); 
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
               System.out.print("*"); 
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

