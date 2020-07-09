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
public class treeidenticalornot {
    public static boolean identical(Tree a,Tree b){
        if(a==null&&b==null)
            return true;
        if((a==null&&b!=null) || (a!=null &&b==null))
            return false;
        if(a.data!=b.data)
            return false;
        if(a.data==b.data&&identical(a.left,b.left)&&identical(a.right,b.right))
            return true;
        
        return false;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree a=null,b=null;
        for(int i=0;i<n;i++)
            a=insert(a,in.nextInt());
        for(int i=0;i<n;i++)
            b=insert(b,in.nextInt());
        System.out.print(identical(a,b));
    }
    
}
