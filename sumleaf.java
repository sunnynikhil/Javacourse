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
import static javacourse.deleteBST.print;
import static javacourse.sumk.isleaf;
public class sumleaf {
    public static Tree findsum(Tree root,int sum){
        if(root==null)
            return null;
        boolean flag = false;
        root.left=findsum(root.left,sum-root.data);
        root.right=findsum(root.right,sum-root.data);
        if(isleaf(root)==true)
        {
            if(sum>root.data)
            {
                root=null;
                
            }
        }
        return root;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root  = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int sum = in.nextInt();
        findsum(root,sum);
        print(root);
    }
}
