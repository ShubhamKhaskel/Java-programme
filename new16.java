import java.util.*;
class new16
{
    public static void main(){
        int i,l,n,s=0;
        char x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String w=sc.next();
        n=w.length();
        if(n%2==1)
        {
            w=w+"#";
            n++;
        }
        
            for(i=0;i<(n/2);i++)
            {
                
                System.out.println(w.charAt(i)+" "+w.charAt(n-i-1));
                
            }
       
        
    }
}
