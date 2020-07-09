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
public class mirrortree {
    public static boolean mirror(Tree a,Tree b){
        if(a.data!=b.data)
            return false;
        boolean ans;
        ans=mirror(a.left,b.right);
        ans=mirror(a.right,b.left);
        return ans;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        Tree a=null,b=null;
        for(int i=0;i<n;i++)
            a=insert(a,in.nextInt());
        for(int i=0;i<n;i++)
            b=insert(b,in.nextInt());
        System.out.print(mirror(a,b));
    }
}
