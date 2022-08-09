import java.util.Scanner;

public class new9 {

    public static void main(String[] args) {
       String a,s="";

       int i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        a=sc.nextLine();
        int l=a.length();
        for(i=0;i>=l-1;i++)
        {
            for(j=i;j>=0;j--)
            {
            s=a.substring(j);
            }
            System.out.println(s);
        }

    }
}