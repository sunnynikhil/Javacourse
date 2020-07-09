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
public class pruing {
 
    public static Tree prue(Tree root , int sum){
        
        
        if(root==null)
            return null;
        root.left=prue(root.left,sum-root.data);
        root.right=prue(root.right,sum-root.data);
        
        if(isLeaf(root))
        {
            if(sum>root.data)
                root=null;
        }
        return root; 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        int sum = in.nextInt();
        root = prue(root,sum);
        print(root);
    }
    public static void print(Tree root){
        if(root==null)
            return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
    private static boolean isLeaf(Tree root) {
         //To change body of generated methods, choose Tools | Templates.
        if(root.left==null && root.right==null)
            return true;
        return false;
    }
}
