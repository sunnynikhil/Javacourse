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
class TopNode{
    int data;
    TopNode left;
    TopNode right;
    TopNode(int d){
        this.data = d;
        left = null;
        right = null;
        
    }
}




public class topviewtree {
    
    public static TopNode insert(TopNode root , int data){
        TopNode new_node = new TopNode(data);
        if(root == null)
           return new_node;
        else
        {
            TopNode cur;
            if( data <= root.data){
                cur = insert(root.left,data);
                root.left=cur;
            }
            else if( data>= root.data){
                cur=insert(root.right,data);
                root.right=cur;
            }
            
            return root;
        }
        
    }
    public static void printtree(TopNode root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        printtree(root.left);
        printtree(root.right);
    }
    public static void topview(TopNode root, int dist,int level,Map<Integer,Pair<Integer,Integer>> map ){
        if(root == null)
            return;
        
        else if(!map.containsKey(dist)|| level<=map.get(dist).second){
            map.put(dist,Pair.of(root.data,level));
            
        }
        topview(root.left,dist-1,level+1,map);
        topview(root.right,dist+1,level+1,map);
    }
    public static void printtopview(TopNode root){
        if(root== null)
            return ;
        Map<Integer , Pair<Integer,Integer>> map = new TreeMap<>();
        topview(root,0,0,map);
        
        for(Pair<Integer,Integer> it : map.values())
            System.out.print(it.first+" ");
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        TopNode root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            int data = in.nextInt();
            root=insert(root,data);
    }
        printtopview(root);
    }
}
