/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.roottoleafsum.sum;

/**
 *
 * @author oyo
 */
public class kthanscetor {
    public static int kthans(Tree root,int n1,int k){
        ArrayList<Tree> path = new ArrayList<>();
        if(!findpath(root,n1,path))
            return -1;
        for(int i=0;i<path.size();i++)
            System.out.print(path.get(i).data+" ");
            
        return path.get(path.size()-k-1).data;
    }
    public static boolean findpath(Tree root,int n,ArrayList<Tree> path){
        
        if(root==null)
            return false;
        path.add(root);
        if(root.data==n)
            return true;
        if(root.left!=null &&findpath(root.left,n,path) )
            return true;
        if(root.right!=null && findpath(root.right,n,path))
            return true;
        
        path.remove(path.size()-1);
        return false;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int n1=in.nextInt();
        int k = in.nextInt();
        System.out.println(kthans(root,n1,k));
    }
}
