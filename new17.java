import java.util.*;
public class new17
{
    public static void main(String[] args) 
    {
        // 		System.out.println("Hello World");
        String w,a="",s="",t="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        w=sc.nextLine().toLowerCase();
        int n=w.length(),c=0,shortest=n,temp;
        for(int i=0;i<n;i++)
        {
            if(w.charAt(i)==' ')
            {
                if(c<shortest)
                {
                    shortest=c;
                    s=a;
                }

                a="";
                c=0;
            }
            else
            {
                a+=w.charAt(i);
                c+=1;
            }
        }

        System.out.println("\nThe shortest word is"+" "+s);

        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'))
            {
                t+=s.charAt(i);
            }
        } 
        System.out.println("\nThe consonants are:"+" "+t);

    }
}