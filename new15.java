import java.util.*;
class new15
{
    public static void main(){
        int i,l,n,s=0;
        char x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String w=sc.next();
        n=w.length();
        if(w.length()%2==0)
        {
            for(i=0;i<(w.length()/2);i++)
            {
                l=w.length()/2;
                System.out.println(w.charAt(i)+" "+w.charAt(n-i));
                
            }
        }
        else
        {
           w=w+"#";
           for(i=0;i<(w.length()/2);i++)
            {
                l=w.length()/2;
                System.out.println(w.charAt(i)+" "+w.charAt(n-i));
            } 
        }
        
    }
}
