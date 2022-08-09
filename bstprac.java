import java.util.*;
class bstprac
{
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    bstprac()
    {
        root=null;
    }
    
    public Node insertr(Node root,int data)
    {
        Node newnode=new Node(data);
        if(root==null)
        {
            root=newnode;
            return root;
        }
        else if(newnode.data>root.data)
        {
            root.right=insertr(root.right,data);
        }
        else if(newnode.data<root.data)
        {
            root.left=insertr(root.left,data);
        }
        return root;
    }
    
    public void insert(int data)
    {
        root=insertr(root,data);
    }
    
    public void inorderr(Node root)
    {
       if(root!=null)
       {
           inorderr(root.left);
           System.out.print(root.data+"->");
           inorderr(root.right);
       }
    }
    
    public void inorder()
    {
        inorderr(root);
    }
    
    public Node searchr(Node root,int data)
    {
       if(root==null || root.data==data)
       {
           return root;
       }
       else
       {
           if(data<root.data)
           {
               return searchr(root.left,data);
           }
           else if(data>root.data)
           {
              return searchr(root.right,data); 
           }
       }
       return root;
    }
    
    public boolean search(int data)
    {
      root=searchr(root,data);
      if(root==null)
      {
          return false;
      }
      else
      {
          return true;
      }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        bstprac ob=new bstprac();
        ob.insert(7);
        ob.insert(9);
        ob.insert(17);
        ob.insert(10);
        ob.insert(3);
        ob.insert(1);
        ob.insert(19);
        ob.inorder();
        System.out.println();
        if(ob.search(17)==true)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}