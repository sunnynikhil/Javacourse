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
public class rightview {
   
    public static void rigthveiw(Tree root){
        Map<Integer,Integer> map = new HashMap<>();
        rightveiwutil(root,1,map);
        for(int i=1;i<=map.size();i++)
            System.out.print(map.get(i)+" ");
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        rigthveiw(root);
    }

    private static void rightveiwutil(Tree root, int level, Map<Integer, Integer> map) {
         //To change body of generated methods, choose Tools | Templates.
        if(root==null)
            return;
        map.put(level, root.data);
        rightveiwutil(root.right,level+1,map);
        rightveiwutil(root.left,level+1,map);
    }
}
