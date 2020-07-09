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

class list {
    int data;
    list next;
    list(int d){
        this.data=d;
        next=null;
    }

    list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class minimumsumlist {
    
    public static list push(list node,int data){
        if(node==null)
            return new list(data);
        else
        {
            list new_node = new list(data);
            new_node.next=node;
            return new_node;
                    
        }
    }
    
    public static void maxsum(list a,list b){
        list result = null;
         list c1=a,c2=b,p1=a,p2=b;
         while(c1!=null || c2!=null){
             
             int sum1=0,sum2=0;
             while(c1!=null&& c2!=null && c1.data!=c2.data){
                 if(c1.data<c2.data){
                     sum1+=c1.data;
                     c1=c1.next;
                 }
                 else
                 {
                     sum2+=c2.data;
                     c2=c2.next;
                 }
             }
             if(c1==null){
                 while(c2!=null)
                 {
                     sum2+=c2.data;
                     c2=c2.next;
                 }
                 
             }
             if(c2==null){
                 while(c1!=null){
                     sum1+=c1.data;
                     c1=c1.next;
                 }
             }
             if(p1==a && p2==b)
                 result = (sum1>sum2)?p1:p2;
             else
             {
                 if(sum1>sum2)
                     p2.next = p1.next;
                 else
                     p1.next = p2.next;
             }
             
             p1=c1;
             p2=c2;
             if(c1!=null)
                 c1=c1.next;
             if(c2!=null)
                 c2=c2.next;
             
         }
         while(result!=null)
         {
             System.out.print(result.data+" ");
             result=result.next;
         }
         System.out.println();
    }
    public static void print(list n){
        if(n==null)
            return ;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args){
       
        list n1 = null;
        list n2 = null;
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            n1=push(n1,in.nextInt());
        }
        int m = in.nextInt();
        for(int i=0;i<m;i++){
            n2=push(n2,in.nextInt());
        }
        print(n1);
        System.out.println();
        print(n2);
        System.out.println();
        maxsum(n1,n2);
        
    }

    
}
