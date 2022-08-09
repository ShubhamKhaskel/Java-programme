import java.util.*;
class New2{
    public static void main(String args[])
    {
       double s1=0,a,b,s=0,c=0,h,z;
       int ch;
       Scanner sc = new Scanner(System.in);
       
       do{
           System.out.println("\n1-area of rectangle");
           System.out.println("\n2-area of square \n");
           System.out.println("\n3-area of triangle \n");
           
           System.out.println("\n-enter the choice\n");
           ch=sc.nextInt();
           
           switch(ch){
               case 1:
                   System.out.println("Enter length and bredth");
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    c=a*b;
                   System.out.println("area of rectangle\n"+c);
                   break;
                   
               case 2:
                   System.out.println("Enter side");
                   a=sc.nextInt();
                   s=a*a;
                   System.out.println("area of square\n"+s);
                   break;
                    
               case 3:
                   System.out.println("Enter height");
                   h=sc.nextInt();
                   System.out.println("Enter base");
                   z=sc.nextInt();
                   s1=(1/2.0)*h*z;
                   System.out.println("area of triangle\n"+s1);
                   
    
           }
           
       }while(ch!=4);
    }
}