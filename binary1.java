import java.util.*;
public class binary1
{
    static class Node
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
    
    static class BinaryTree
    {
        static int idx=-1;
        public static Node buildTree(int nodes[]) //to return the root node
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            
            return newNode;
            
        }
    }
    
    public static void Preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    
    public static void Postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }
    
    public static void main(String args[])
    {
        int nodes[]={1 ,2 ,4 ,-1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        Preorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        Postorder(root);
    }
}