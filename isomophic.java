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
public class isomophic {
    public static boolean isomphric(Tree r1,Tree r2 ){
        if(r1==null && r2==null)
            return true;
        if(r1==null || r2==null)
            return false;
        if(r1.data!=r2.data)
            return false;
        return ((isomphric(r1.left,r2.left)&&isomphric(r1.right,r2.right))||(isomphric(r1.left,r2.right)&&isomphric(r1.right,r2.left)));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree a = null,b=null;
        for(int i=0;i<n;i++)
            a=insert(a,in.nextInt());
        for(int i=0;i<n;i++)
            b=insert(b,in.nextInt());
        System.out.print(isomphric(a,b));
    }
}
