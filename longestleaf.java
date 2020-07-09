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
public class longestleaf {
    public static int height_of_tree(Tree root,int ans , Tree k , int lh,int rh,int f){
        if(root==null)
            return 0;
        int left_height = height_of_tree(root.left,ans,k,lh,rh,f);
        int right_height = height_of_tree(root.right,ans,k,lh,rh,f);
        if(ans<left_height+right_height){
            ans =1+left_height+right_height;
            k=root;
            lh=left_height;
            rh=right_height;
        }
        
        return 1+Integer.max(left_height, right_height);
        
    }
    public static void printPath(Tree root, int path[],int pathlen,int max,int f){
        if(root==null)
            return ;
        path[pathlen++]=root.data;
        if(root.left==null && root.right==null){
            if(pathlen==max && f==0 ||f ==1){
                printarray(path,pathlen,f);
                f=2;
            }
        }
        else
        {
            printPath(root.left,path,pathlen,max,f);
            printPath(root.right,path,pathlen,max,f);
        }
    }
    public static void printArray(int ints[], int len, int f) 
{ 
    int i; 
  
    // print left part of the path in reverse order 
    if (f == 0) { 
        for (i = len - 1; i >= 0; i--) { 
            System.out.print(ints[i]);
        } 
    } 
  
    // print right part of the path 
    else if (f == 1) { 
        for (i = 0; i < len; i++) { 
            System.out.print(ints[i]); 
        } 
    } 
} 
    public static void diameter(Tree root){
        
        int ans = Integer.MIN_VALUE,lh=0,rh=0;
        int f=0;
        Tree k=null;
        int height_of_tree=height_of_tree(root,ans,k,lh,rh,f);
        int lpath[] = new int[100];
        int pathlen=0;
        printPath(k.left,lpath,pathlen,lh,f);
        System.out.print(k.data);
        int rpath[] = new int[100];
        f=1;
        printPath(k.right,lpath,pathlen,rh,f);
        
        
        
        
    }
   public static void main(String[] args){
       Tree root = new Tree(1);
       
       root.left=new Tree(2);
       root.right = new Tree(3); 
    root.left.left = new Tree(4); 
    root.left.right = new Tree(5); 
    root.left.right.left = new Tree(6); 
    root.left.right.right = new Tree(7); 
    root.left.left.right = new Tree(8); 
    root.left.left.right.left = new Tree(9);
    diameter(root);
    
   } 
}
