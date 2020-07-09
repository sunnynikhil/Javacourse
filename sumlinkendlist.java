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
import java.util.LinkedList;
import java.util.Stack;
class node{
    int data;
    node next;
    node(int d){
        this.data=d;
        next=null;
    }
}
public class sumlinkendlist {
    
    public static node push(node h ,int data){
        node newnode = new node(data);
        if(h==null){
            return newnode;
        }
        else
        {
            newnode.next=h;
            return newnode;
        }
    }
    public static void print(node h){
        while(h!=null){
            System.out.print(h.data+" ");
            h=h.next;
        }
    }
    public static node reverse(node h){
        node cur = h;
        node prev = null;
        node next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur=next;
        }
        return prev;
    }
    public static node ceratelist(Stack<Integer> s){
        node h = null;
        while(!s.empty()){
            int value = s.pop();
            h=push(h,value);
        }
        return reverse(h);
    }
    public static node sum(node h1 , node h2 ,int carry){
      if(h1==null && h2==null){
          if(carry>0){
              return new node(carry);
          }
          return null;
      }
      
      int v1 = (h1!=null)?h1.data:0;
      int v2 = (h2!=null)?h2.data:0;
      
      int sum = (v1+v2+carry)%10;
      carry = (v1+v2+carry)/10;
      node newl = new node(sum);
      node h1next = (h1!=null)?h1.next:null;
      node h2next = (h2!=null)?h2.next:null;
      
      newl.next=sum(h1next,h2next,carry);
      
      return newl;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        node h1=null;
        node h2=null;
        for(int i=0;i<n;i++){
            h1=push(h1,in.nextInt());
        }
        for(int i=0;i<m;i++){
            h2=push(h2,in.nextInt());
        }
        node h=sum(h1,h2,0);
        print(h);
    }
}
