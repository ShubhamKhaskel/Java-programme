import java.util.*;
        class merge
        {
            int arr[];
            int s;
            merge(int n)
            {
                arr=new int[n];
                s=n;
            }
            void accept()
            {
              int i;
              Scanner sc=new Scanner(System.in);
              System.out.println("enterrrrrr....");
              for(i=0;i<s;i++)
              {
                  arr[i]=sc.nextInt();
              }
            }
            void display()
            {
                int i;
                for(i=0;i<s;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            void mergeArray(merge ob1,merge ob2)
            {
                int i;
                for(i=0;i<(ob1.s+ob2.s);i++)
                {
                   if(i<ob1.s)
                   {
                   arr[i]=ob1.arr[i]; 
                   }
                   else
                   arr[i]=ob2.arr[i-ob1.s];
                }
                
            }
        
        public static void main(String args[])
    {
        merge ob1=new merge(5);
        ob1.accept();
        merge ob2=new merge(3);
        ob2.accept();
        merge ob3=new merge(8);
        ob3.mergeArray(ob1,ob2);
        ob1.display();
        ob2.display();
        ob3.display();
    }
}   
