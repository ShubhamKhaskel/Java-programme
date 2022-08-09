import java.util.*;
class new7
{
    public static void main(String args[])
    {
        String  a,b="";
        int j=0,i,v=0,d=0,c=0,s=0;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        a=sc.nextLine().toLowerCase();
        int l=a.length();
        
        for(i=0;i<l;i++)
        {
            char x=a.charAt(i);
            if(Character.isLetter(x)){
                if(x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u')
            {
                v=v+1;
            }
            else{
                c=c+1;
            }
                
            }
            
            else if(Character.isDigit(x)){
                d=d+1;
            }
            else if(x!=' '){
                s=s+1;
            }
        }
        System.out.println("no of vowels"+v);
        System.out.println("no of digits"+d);
        System.out.println("no of consonent"+c);
        System.out.println("no of special character"+s);
        
        

    }
}