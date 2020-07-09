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

public class parentandgrandparent {
    
    public static void findparentgp(Tree gp , Tree p , Tree c ,int sum ){
        if(c==null)
            return;
        if((gp!=null&&p!=null)&&(gp.data+p.data+c.data)>=sum){
            System.out.println(gp.data+","+p.data+","+c.data);
        }
        findparentgp(p,c,c.left,sum);
        findparentgp(p,c,c.right,sum);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree head = null;
        for(int i=0;i<n;i++)
            head = insert(head,in.nextInt());
        int sum = in.nextInt();
        findparentgp(null,null,head,sum);
        
    }
}
