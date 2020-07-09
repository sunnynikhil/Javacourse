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
public class normaltreetobst {
    public static void print(Tree root){
        if(root==null)
            return;
        print(root.left);
        print(root.right);
        System.out.print(root.data+" ");
    }
    public static void sortnodes(Tree root,Vector<Tree> nodes){
        if(root==null)
            return;
        sortnodes(root.left,nodes);
        nodes.add(root);
        sortnodes(root.right,nodes);
        
    }
    public static Tree constructBST(Vector<Tree> nodes,int start,int end){
        if(start>end)
            return null;
        int mid =(start+end)/2;
        Tree node = nodes.get(mid);
        node.left=constructBST(nodes,start,mid-1);
        node.right=constructBST(nodes,mid+1,end);
        return node;
    }
    public static Tree buildBST(Tree root){
        Vector<Tree> nodes = new Vector<>();
        sortnodes(root,nodes);
        root=constructBST(nodes,0,nodes.size()-1);
        return root;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        root=buildBST(root);
        print(root);
    }
}
