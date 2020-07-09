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
import static javacourse.minimumsumlist.print;

import static javacourse.minimumsumlist.push;
public class reverselinkedlist {
    public static list reverselist(list root){
        list prev=null,next,cur=root;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            
        }
        return prev;
        
        
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        root = reverselist(root);
        print(root);    
    }
}
