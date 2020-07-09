/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */import java.util.*;
import static javacourse.deleteBST.insert;
public class topview {
    public static void collecttopveiw(Tree root,int dist,int level,Map<Integer , Pair<Integer,Integer>> map){
        if(root==null)
            return;
        else if(!map.containsKey(dist)||level<=map.get(dist).second){
            map.put(dist, Pair.of(root.data,level));
        }
        collecttopveiw(root.left,dist-1,level+1,map);
        collecttopveiw(root.right,dist+1,level+1,map);
    }
    public static void topveiw(Tree root){
        if(root==null)
            return;
        Map<Integer,Pair<Integer,Integer>> map = new HashMap<>();
        collecttopveiw(root,0,0,map);
        for(Pair<Integer,Integer> it : map.values())
            System.out.print(it.first+" ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        topveiw(root);
        
    }
}
