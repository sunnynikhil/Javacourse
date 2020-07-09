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
public class countleave {
    public static int countleaves(Tree root){
        int count=0;
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        count+=countleaves(root.right);
        count+=countleaves(root.left);
        return count;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        System.out.print(countleaves(root));
    }
}
