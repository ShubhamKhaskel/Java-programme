import java.util.*;
public class new20
{
    public static void main(String[] args) 
    {
        //         System.out.println("Hello World");
        String w,a="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        w=sc.nextLine().toUpperCase().trim()+" ";
        int n=w.length(),c=0,n1;
        for(int i=0;i<n;i++)
        {
            if(w.charAt(i)!=' ')
            {
               a=a+w.charAt(i); 
            }
            else
            {
                n1=a.length();
               if((a.charAt(0)=='A' || a.charAt(0)=='E' || a.charAt(0)=='I' ||a.charAt(0)=='0' ||a.charAt(0)=='U') && 
               (a.charAt(n1-1)=='A' || a.charAt(n1-1)=='E' || a.charAt(n1-1)=='I' ||a.charAt(n1-1)=='0' ||a.charAt(n1-1)=='U'))
            {
               c=c+1; 
               System.out.println(" "+a); 
            }
            a="";
            }
        }
            
          System.out.println("\nThe no word starting and ending with vowel "+c); 
    }
}
