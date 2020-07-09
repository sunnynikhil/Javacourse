/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.print;
import static javacourse.minimumsumlist.push;
import static javacourse.pairwiseswap.swap;

/**
 *
 * @author oyo
 */
public class addtwolinkedlist {
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
    public static list add(list h1 , list h2){
        h1=reverselist(h1);
        h2=reverselist(h2);
        list res=null;
        int carry=0,sum=0;
        while(h1!=null&&h2!=null){
         sum=h1.data+h2.data+carry;
         carry=sum/10;
         res=push(res,sum%10);
         h1=h1.next;
         h2=h2.next;
         
        
    }
        while(h1!=null)
        {
            sum=h1.data+carry;
            carry=sum/10;
            res=push(res, sum%10);
            h1=h1.next;
        }
        while(h2!=null)
        {
            sum=h2.data+carry;
            carry=sum/10;
            res=push(res, sum%10);
            h2=h2.next;
        }
        if(carry>0)
            res=push(res,carry);
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2 = in.nextInt();
        list l1 = null;
        for(int i=0;i<n;i++)
            l1=push(l1,in.nextInt());
        list l2 = null;
        for(int i=0;i<n2;i++)
            l2=push(l2,in.nextInt());
       list res=add(l1,l2);
        print(res);
           
    }
}
