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
public class insertnodeinsortlist {
     public static list megre(list root,int key){
         list cur=root,prev=null;
         boolean flag=false;
         while(cur!=null && flag==false)
         {
             if(key<=cur.data)
             {
                 flag=true;
                 list new_node= new list(key);
                 if(prev==null)
                 {
                     new_node.next=root;
                     root=new_node;
                 }
                 else
                 {
                     prev.next=new_node;
                     new_node.next=cur;
                 }
                 
             }
             
             prev=cur;
             cur=cur.next;
         }
         if(flag==false)
         {
             list new_node= new list(key);
             prev.next=new_node;
             new_node.next=null;
         }
         return root;
     }
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        int key = in.nextInt();
        root=megre(root,key);
        print(root);
           
    }
}
