import java.util.*;
class sum_matrix
{
  int mat[][];
  int m,n;
  sum_matrix(int x,int y)
  {
      this.m=x;
      this.n=y;
      this.mat=new int[this.m+1][this.n+1];
      int i,j;
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              mat[i][j]=0;
          }
      }
  }
  public void read_row_column(int x,int y)
  {
      this.m=x;
      this.n=y;
  }
  public void readmatrix()
  {
      int i,j;
      Scanner sc=new Scanner(System.in);
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
             mat[i][j]=sc.nextInt(); 
          }
      }
  }
  public void show_mat()
  {
      int i,j;
      for(i=0;i<=m;i++)
      {
          for(j=0;j<=n;j++)
          {
              System.out.print(mat[i][j]+"\t");
          }
          System.out.println();
      }
  }
  public void summatrix()
  {
     int i,j,s=0,c=0;
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
         {
           s=s+mat[i][j];
         }
         mat[i][n]=s;
         s=0;
     }
     for(j=0;j<n;j++)
      {
         for(i=0;i<m;i++)
         {
           c=c+mat[i][j]; 
         }
         mat[m][j]=c;
         c=0;
      }
  }
}
public class summatrix
{
    public static void main(String args[])
    {
        sum_matrix ob=new sum_matrix(3,4);
        ob.read_row_column(3,4);
        ob.readmatrix();
        ob.summatrix();
        ob.show_mat();
    }
}
