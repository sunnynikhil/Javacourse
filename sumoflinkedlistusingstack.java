/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.sumod2linkelist.print;
import static javacourse.sumod2linkelist.push;
import java.util.Stack;

/**
 *
 * @author oyo
 */
public class sumoflinkedlistusingstack {
    public static sum sumstack(sum h1,sum h2){
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        if(h1==null && h2==null)
            return null;
        sum cur1=h1,cur2=h2,re=null;
        while(cur1!=null){
            s1.push(cur1.data);
            cur1=cur1.next;
        }
        while(cur2!=null){
            s2.push(cur2.data);
            cur2=cur2.next;
        }
        int c=0,sum;
        while(s1.empty()!=false && s2.empty()!=false){
          sum=s1.peek()+s2.peek()+c;
          if(sum>=10)
          {
              c=1;
              sum=sum%10;
              re=push(re,sum);
          }
          else
          {
              c=0;
              re=push(re,sum);
          }
          s1.pop();
          s2.pop();
        }
        while(s1.empty()!=false)
        {
          sum=s1.peek()+c;
          if(sum>=10)
          {
              c=1;
              sum=sum%10;
              re=push(re,sum);
          }
          else
          {
              c=0;
              re=push(re,sum);
          }
          s1.pop();  
        }
        while(s2.empty()!=false)
        {
          sum=s2.peek()+c;
          if(sum>=10)
          {
              c=1;
              sum=sum%10;
              re=push(re,sum);
          }
          else
          {
              c=0;
              re=push(re,sum);
          }
          s2.pop();  
        }
        return re; 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        sum h1 = null;
        sum h2 = null;
        for(int i=0;i<n1;i++)
            h1=push(h1,in.nextInt());
        int n2 = in.nextInt();
        for(int i=0;i<n2;i++)
            h2=push(h2,in.nextInt());
        sum res = sumstack(h1,h2);
        print(res);
    }
}
