/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.levelodertransvesal.levelorder;

/**
 *
 * @author oyo
 */
public class LCA {
    static boolean v1,v2;
    public static Tree findlcautil(Tree root,int n1,int n2){
        if(root==null)
            return null;
        Tree temp=null;
        
        if(root.data==n1)
        {
            v1=true;
            temp=root;
        }
        if(root.data==n2)
        {
            v2=true;
            temp=root;
        }
        Tree lca_left=findlcautil(root.left,n1,n2);
        Tree lca_right=findlcautil(root.right,n1,n2);
        if(temp!=null)
            return temp;
        if(lca_left!=null && lca_right!=null)
            return root;
        return (lca_left!=null)?lca_left:lca_right;
        
    }
    public static int findLCA(Tree root,int n1,int n2){
        v1=false;
        v2=false;
        
        Tree lca = findlcautil(root,n1,n2);
        
        if(v1&&v2)
            return lca.data;
        return 0;
            
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.print(findLCA(root,n1,n2));
    }
    
}
