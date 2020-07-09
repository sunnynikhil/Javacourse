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
import java.util.Map.Entry;
import static javacourse.countleave.countleaves;
import static javacourse.deleteBST.insert;
public class rightveiw {
    public static void rightviewutil(Tree root,int level,HashMap<Integer,Integer> map){
        if(root==null)
            return;
        if(map.containsKey(level))
            map.put(level, root.data);
        else
            map.put(level, root.data);
        rightviewutil(root.right,level+1,map);
        rightviewutil(root.left,level+1,map);
        return;
        
    }
    public static void rightview(Tree root){
        HashMap<Integer,Integer> map = new HashMap<>();
        rightviewutil(root,0,map);
        for(Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.print(entry.getValue()+" ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        rightview(root);
    }
}
