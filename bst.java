import java.util.*;
class bst
{
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=this.right=null;
        }
    }
    Node root;
    
    bst()
    {
      root=null;  
    }
    
    Node insertr(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        else
        {
            if(val>root.data)
            {
                root.right=insertr(root.right,val);
            }
            else if(val<root.data)
            {
                root.left=insertr(root.left,val);
            }
            return root;
        }
    }
    
    public void insert(int val)
    {
        root=insertr(root,val);
    }
    
    boolean search(int val)
    {
        root=searchr(root,val);
       if(root==null)
       {
           return false;
       }
       else
       {
           return true;
       }
    }
    
    public Node searchr(Node root,int val)
    {
       if(root==null || val==root.data)
       {
           return root;
       }
       else
           {
              if(val>root.data)
               {
                  return searchr(root.right,val); 
               }
               else if(val<root.data)
               {
                  return searchr(root.left,val);  
               }
           }
       return root;
    }
    
    void inorderr(Node root)
    {
        if(root!=null)
        {
            inorderr(root.left);
            System.out.println(root.data+"-->");
            inorderr(root.right);
        }
    }
    
    public void inorder()
    {
        inorderr(root);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        bst ob=new bst();
        ob.insert(45);
        ob.insert(10);
        ob.insert(7);
        ob.insert(12);
        ob.insert(90);
        ob.inorder();
        System.out.println();
        boolean t=ob.search(91);
        if(t==true)
        {
            System.out.println("FOUND!!!!");
        }
        else
        {
            System.out.println("NOT FOUND////");
        }
    }
}