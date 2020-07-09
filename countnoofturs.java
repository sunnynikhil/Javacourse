/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.minmumbntwonodes.minimumdist;

/**
 *
 * @author oyo
 */
public class countnoofturs {
    static int count;
    public static Tree findlca(Tree root,int n1,int n2){
        if(root==null)
            return root;
        if(root.data==n1 || root.data==n2)
            return root;
       
        Tree left = findlca(root.left,n1,n2);
        Tree right = findlca(root.right,n1,n2);
        if(left!=null && right!=null)
             return root;
        return (left!=null)?findlca(root.left,n1,n2):findlca(root.right,n1,n2);
        
    } 
    public static boolean countTurnsUtil(Tree root,int n,boolean flag){
        if(root==null)
            return false;
        if(root.data==n)
            return true;
        if(flag==true)
        {
            if(countTurnsUtil(root.left,n,flag))
               return true;
            if(countTurnsUtil(root.right,n,!flag))
                count+=1;
             return true;
                
        }
        else
        {
            if(countTurnsUtil(root.right,n,flag))
               return true;
            if(countTurnsUtil(root.left,n,!flag))
            { count+=1;
             return true;}
            
        }
        return false;
    }
    public static int countTurns(Tree root,int n1,int n2){
        Tree lca = findlca(root,n1,n2);
        
        if(lca==null)
            return -1;
        count=0;
        if(lca.data!=n1 && lca.data!=n2){
            if(countTurnsUtil(lca.right,n2,false)||countTurnsUtil(lca.left,n2,true) );
            if(countTurnsUtil(lca.right,n1,false)||countTurnsUtil(lca.left,n1,true) );
            return count+1;
        }
        if(lca.data==n1)
        {
            countTurnsUtil(lca.right,n2,false);
            countTurnsUtil(lca.left,n2,true);
            return count;
        }
        else
        {countTurnsUtil(lca.right,n1,false);
        
            countTurnsUtil(lca.left,n1,true);
            return count;
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root  = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.print(countTurns(root,n1,n2));
    }
}
