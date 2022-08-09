import java.util.*;
class prims
{
    public static int findminvertex(int w[],int visit[],int v)
    {
    	int minv=-1,i;              //0 r ekta parent dorlm -1
    	for(i=0;i<v;i++)
    	{
    		if(visit[i]==0 && (minv==-1 || w[i]<w[minv]))
    			minv=i;
    		
    	}
    	return minv;
    }
    public static void prims(int adj[][] ,int v)
    {
            Scanner sc=new Scanner(System.in);
            int[] p=new int[v]; 
            int[] visit=new int[v];
            int[] w=new int[v];
            
            int i,j,cost=0;
            for(i=0;i<v;i++)
            {
              visit[i]=0;
              w[i]=999;
            }
            p[0]=-1;
            w[0]=0;
            for(i=0;i<v;i++)
            {
               int minv=findminvertex(w,visit,v);  
               visit[minv]=1;
        		for(j=0;j<v;j++)               //changing the value of weight array with the adj matrix value
        		{
        			if(adj[minv][j]!=0 && visit[j]==0)    //visit[j]==0 ie not visited
        			{
        				if(adj[minv][j]<w[j])
        				{
        					w[j]=adj[minv][j];
        					p[j]=minv;
        				}
        			}
        		} 
            }
            System.out.println("Source\tDestination\tWeight");
            for(i=1;i<v;i++)
        	{
        		//cost=cost+w[i];
        		if(i<p[i])                  //for making source smaller than destination
        		System.out.print(i+" "+p[i]+" "+w[i]);
        		else
        		{
        		 System.out.print(p[i]+" "+i+" "+w[i]);	
        		}
        		System.out.println();
        	}
        	//("\ncost=%d",cost); 
        
               
    }
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int source,desti,weight,v=5,e=7;
            int[][] adj=new int[10][10];
            int i,j;
            for(i=0;i<v;i++)
            {
                for(j=0;j<v;j++)
                {
                    adj[i][j]=0;
                }
            }
            for(i=0;i<e;i++)
            {
                System.out.println("Source\tDestination\tWeight\n");
                source=sc.nextInt();
                desti=sc.nextInt();
                weight=sc.nextInt();
                adj[source][desti]=weight;
                adj[desti][source]=weight;
            }
            prims(adj,v);	
    }
}