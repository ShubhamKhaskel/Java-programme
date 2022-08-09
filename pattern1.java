/*
  
        *****
        *****
        *****
        *****

/*import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=5;j++)
            {
               System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}

        *****
        *   *
        *   *
        *****


import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=5;j++)
            {
               if(i==1 || j==1 || i==4 || j==5 )
               System.out.print("*"); 
               else
               System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}


        *
        **
        ***
        ****
        

import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print("*"); 
               
            }
            System.out.println(); 
        }
    }
}


        ****
        ***
        **
        *
        

import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4-i+1;j++)
            {
               System.out.print("*"); 
               
            }
            System.out.println(); 
        }
    }
}


           *
          **
         ***
        ****


import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4-i;j++)
            {
               System.out.print(" "); 
            }
            for(j=1;j<=i;j++)
            {
            System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}


        1
        12
        123
        1234
        12345


import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}


        12345
        1234
        123
        12
        1


import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5-i+1;j++)
            {
               System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}


        1  
        2  3  
        4  5  6  
        7  8  9  10  
        11  12  13  14  15  
        

import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j,k=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print(k+"  ");
               k++;
            }
            System.out.println(); 
        }
    }
}


        1  
        0  1  
        1  0  1  
        0  1  0  1  
        1  0  1  0  1  

forming matrix and checking the index*/
import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                   System.out.print(1+"  ");
                   
                }
               else 
                {
                  System.out.print(0+"  "); 
                  
                }
            }
            System.out.println(); 
        }
    }
}