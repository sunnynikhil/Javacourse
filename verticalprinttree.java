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
import java.util.TreeMap; 
import java.util.Vector;
import static javacourse.deleteBST.insert;
import java.util.Map.Entry;
public class verticalprinttree {
    public static void printverticalveiwutil(Tree root,int dist,TreeMap<Integer,Vector<Integer>> map){
        if(root==null)
            return;
        
            Vector<Integer> get = map.get(dist);
            if(get==null){
                get = new Vector<>();
                get.add(root.data);
            }
            else
            {
                get.add(root.data);
            }
           map.put(dist, get);
        printverticalveiwutil(root.left,dist-1,map);
        printverticalveiwutil(root.right,dist+1,map);
    }
    public static void printverticalveiw(Tree root){
        TreeMap<Integer,Vector<Integer>> map = new TreeMap<>();
        printverticalveiwutil(root,0,map);
        
        for(Entry<Integer,Vector<Integer>> it : map.entrySet()){
            System.out.println(it.getValue());
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        printverticalveiw(root);
    }
}
