import java.util.*;
        class ten
        {
            String a[];
            int s=5;
            ten()
            {
               a=new String[s]; 
            }
            void set()
            {
                int i;
                Scanner sc=new Scanner(System.in);
                System.out.println("enterrrr....");
                for(i=0;i<s;i++)
                {
                    a[i]=sc.next().toUpperCase();
                }
            }
            void get()
            {
                int i;
                for(i=0;i<s;i++)
                {
                   if(a[i].charAt(0)=='A'&&a[i].charAt(a[i].length()-1)=='A')
                   {
                       System.out.println(a[i]);
                   }
                }
            }
            public static void main(String args[])
            {
                ten ob=new ten();
                ob.set();
                ob.get();
            }
        }
        