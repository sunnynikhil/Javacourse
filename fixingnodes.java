/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import java.util.Vector;
import static javacourse.deleteBST.insert;
import static javacourse.deleteBST.print;
import static javacourse.isBST.isBST;

/**
 *
 * @author oyo
 */

public class fixingnodes {
    public static void storenode(Tree root, Vector<Integer> v){
        if(root==null)
            return;
        storenode(root.left,v);
        v.add(root.data);
        storenode(root.right,v);
    }
    public static void insertsort(Vector<Integer> v,int n){
        int i,j,key;
        for(i=1;i<n;i++)
        {
            j=i-1;
            key=v.get(i);
            while(j>=0 && v.get(j)>key)
            {
                v.add(j+1, v.get(j));
                j=j-1;
            }
            v.add(j+1, key);
            
        }
    }
    public static void swap(Tree root,int n1 ,int n2){
        if(root==null)
            return;
        swap(root.left,n1,n2);
        
        if(root.data==n1)
        {
            root.data=n2;
        }
        else if(root.data==n2)
        {
            root.data=n1;
        }
        swap(root.right,n1,n2);
    }
    public static Tree fixnode(Tree root){
        Vector<Integer> v = new Vector<>();
        storenode(root,v);
        
        Vector<Integer> v1 = v;
        
        insertsort(v,v.size());
        for(int i=0;i<v.size();i++)
        {
            if(v.get(i)!=v1.get(i)){
                swap(root,v1.get(i),v.get(i));
                break;
            }
        }
        return root;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        root=fixnode(root);
        print(root);
        
    }
}
