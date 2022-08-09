import java.util.*;
class bfs
{
    public static void BFS(int a[][],int visited[],int start)
    {
       Scanner sc=new Scanner(System.in);
       int queue[]=new int[10];
       int front=-1,rear=-1;
       
       queue[++rear]=start;
       ++front;
       visited[start]=1;
       
       while(rear>=front)
       {
           start=queue[front++];
           System.out.print(start+" ");
           
           for(int i=0;i<7;i++)
           {
             if(a[start][i]==1 && visited[i]==0)
             {
                 queue[++rear]=i;
                 visited[i]=1;
             }
           }
       }
    }
    public static void main(String args[])
    {
        
        int visited[]={0,0,0,0,0,0,0};
        int a[][]={
         {0,1,1,1,0,0,0},
         {1,0,1,0,0,0,0},
         {1,1,0,1,1,0,0},
         {1,0,1,0,1,0,0},
         {0,0,1,1,0,1,1},
         {0,0,0,0,1,0,0},
         {0,0,0,0,1,0,0},
       };
       BFS(a,visited,0);
    }
}