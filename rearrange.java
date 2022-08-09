import java.util.*;
class rearrange
{
    String word;
    String newwrd;
    rearrange()
    {
        word="";
        newwrd="";
    }
    public void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        word=sc.nextLine().toUpperCase();
    }
    public void freq_vow_con()
    {
        int v=0,c=0;
        for(int i=0;i<word.length();i++)
        {
        if(word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U' )
        {
            v++;
        }
        else
        {
            c++;
        }
        }
        System.out.println("No of vowels= ");
        System.out.println(v);
        System.out.println("No of conso= ");
        System.out.println(c);
        }
    public void arrange()
    {
        String rem="";
        for(int i=0;i<word.length();i++)
        {
           if(word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U' )
           {
               newwrd=newwrd+word.charAt(i);
           }
           else
           {
              rem=rem+word.charAt(i); 
           }
        }
        newwrd=newwrd+rem;
    }
    public void display()
    {
        System.out.println("ORIGINAL--->");
        System.out.println(word);
        System.out.println("NEW--->");
        System.out.println(newwrd);
    }
    public static void main(String args[])
    {
        rearrange ob=new rearrange();
        ob.readword();
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}
