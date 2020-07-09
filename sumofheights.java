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
public class sumofheights {
    static int sum;
    public static int sumhiegthutil(Tree root){
        if(root==null)
            return 0;
        int lh=sumhiegthutil(root.left);
        int rh=sumhiegthutil(root.right);
        int height = Math.max(lh, rh)+1;
        
        sum=sum+height;
        return height;
    }
    public static int sumheight(Tree root){
        sum=0;
        sumhiegthutil(root);
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        System.out.print(sumheight(root));
    }
    
}
