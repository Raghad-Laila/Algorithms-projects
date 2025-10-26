

package com.mycompany.binary_search_tree_application;
class Node{
    int data;
    Node left;
    Node right;
}
class binarysearchtree{
    public Node insert(Node node,int val){
        if(node==null){
        return creatnewnode(val);
    }
        if(val>node.data){
            node.right=insert(node.right,val);
            
        }
        else
            if(val<node.data){
            node.left=insert(node.left,val);}
            else 
                if(val==node.data){
                    System.out.println("no duplicate");
                }
    return node;
    }
   public Node creatnewnode(int val){
   Node newnode=new Node();
   newnode.data=val;
   newnode.left=null;
   newnode.right=null;
   return newnode;
   
   }
    public void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data+"");
        inorder(node.right);
    }
    public int getheight(Node node){
        if(node==null){
            return -1;
            }
        return Math.max(getheight(node.left),getheight(node.right))+1;
    }
}
public class Binary_search_tree_application {

    public static void main(String[] args) {
        binarysearchtree BST=new binarysearchtree();
        Node root=null;
       root=BST.insert(root,8);
       root=BST.insert(root,3);
       root=BST.insert(root,6);
       root=BST.insert(root,10);
       root=BST.insert(root,4);
       root=BST.insert(root,7);
       root=BST.insert(root,1);
       root=BST.insert(root,14);
       root=BST.insert(root,13);

        BST.inorder(root);
        
       System.out.println("\n height="+BST.getheight(root)+" ");
    }
}
