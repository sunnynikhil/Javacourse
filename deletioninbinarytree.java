/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
import static javacourse.deleteBST.insert;
public class deletioninbinarytree {
    public static void printtree(Tree root){
        if(root==null)
            return ;
        printtree(root.left);
        System.out.print(root.data+" ");
        printtree(root.right);
    }
    public static void deletekey(Tree root,int key){
        int val = deepestnodeval(root);
        Tree keynode = findkeynode(root,key);
        keynode.data=val;
    }
    public static int deepestnodeval(Tree root){
        if(root==null)
            return 0;
        Tree temp=root,prev=null;
        while(temp.right!=null)
        {
            prev=temp;
            temp=temp.right;
        }
        int val = temp.data;
        temp=null;
        prev.right=null;
        return val;
    }
    public static Tree findkeynode(Tree root,int key)
    {
        if(root==null)
            return root;
        if(root.data==key)
            return root;
        Tree left = findkeynode(root.left,key);
        Tree right = findkeynode(root.right,key);
        return (left!=null)?left:right;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int key = in.nextInt();
        deletekey(root,key);
        printtree(root);
    }
}
