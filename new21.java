import java.util.*;
public class new21
{
    public static void main(String[] args) 
    {
        //         System.out.println("Hello World");
        String w,a="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        w=sc.nextLine().trim();
        int n=w.length(),c=0,n1,l1,i;
        for(i=0;i<n;i++)
        {
            if(w.charAt(i)!=' ')
            {
               a=a+w.charAt(i); 
            }
            else
            {
               char t=a.charAt(0);
               System.out.print(t+"."); 
               a="";
            }
            
        }
          System.out.print(a); 
        
    }
             
}

