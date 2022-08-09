import java.util.Scanner;

public class new6 {

    public static void main(String[] args) {
       String a,s="";

       int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        a=sc.nextLine();
        int l=a.length();
        for(i=l-1;i>=0;i--)
        {
            s=a.substring(i);
            System.out.println(s);
        }

    }
    
    
}