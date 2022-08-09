import java.util.*;
class New4{
    public static void main(String args[])
    {
       double s1=0,a,b,s=0,c=0,h,z,arr,f=0;
       int ch,i;
       Scanner sc = new Scanner(System.in);

                   for(i=1;i<=5;i++){
                       
                    System.out.println("enter number");
                    arr=sc.nextDouble();
                    
                    if(arr>f){
                        f=arr;
                    }
                    if(arr%2==0)
                    {
                        s=s+arr;
                    }
                    else if(arr%2==1)
                    {
                        c=c+arr;
                    }
                }
                
                   System.out.println("the highest is= "+f);
                   System.out.println("the even is= "+s);
                   System.out.println("the odd is= "+c);
                     
           
       }
       
       
    }
