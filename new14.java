import java.util.*;
class new14
{
    boolean isPrime(int n)
    {
        int i,c=0;
        boolean k=true,l=false;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==1)
        {
            return k; 
        }
        else
        {
            return l; 
        }
    }

    int sum(int n)
    {
        int t,s=0;
        while(n>0)
        {
            t=n%10;
            s=s+t;
            n=n/10;
        }
        return s;
    }

    public static void main(){
        int i,a,b,c,flag,n,temp,r,least=10,sum=0;
        new14 ob=new new14();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers ei lekh lekh ........\n");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {    flag=0;
            a=sc.nextInt();
            temp=a;
            if(a>=100)
            {
                while(temp>0)
                {
                    r=temp%10;
                    temp=temp/10;
                    if(r==3 || r==2 || r==5 || r==7)
                    {
                        if(r<least)
                        {
                            least=r;  
                        }
                        flag=1;
                    }

                }
                if(flag==0)
                {
                    sum=sum+ob.sum(a);
                }
                else
                {
                    sum=sum+least;
                }
            }

        }
        
        System.out.println("sum is ........="+sum);
    }     

}

