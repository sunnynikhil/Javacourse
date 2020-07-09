/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.sumod2linkelist.print;
import static javacourse.sumod2linkelist.push;

/**
 *
 * @author oyo
 */
public class sumoflinkedlistsrecursion {
    sum result,tempnode;
    int c=0;
    public void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        sum h1 = null;
        sum h2 = null;
        for(int i=0;i<n1;i++)
            h1=push(h1,in.nextInt());
        int n2 = in.nextInt();
        for(int i=0;i<n2;i++)
            h2=push(h2,in.nextInt());
        addlists(h1,h2);
        print(result);
    }
    public void addlists(sum n1, sum n2){
        int c1=0,c2=0;
        sum h1 = n1,h2=n2;
        while(n1!=null)
        {
            c1++;
            n1=n1.next;
        }
        while(n2!=null)
        {
            c2++;
            n2=n2.next;
        }
        if(c1==c2)
            calsum(h1,h2);
        else
        {
            if(c1<c2)
            {
                sum temp = h1;
                h1=h2;
                h2=temp;
            }
            int d = Math.abs(c1-c2);
            n1 = h1;
            n2=h2;
            while(d>0){
                n1=n1.next;
                d--;
                tempnode = n1;
            }
            calsum(n1,n2);
            addrestlist(h1);
        }
        if(c>0)
        {
            result=push(result,c);
        }
    }
    public void addrestlist(sum node){
         if(node == null) {
      return;
    }
    
    if(node != tempnode) {
      addrestlist(node.next);
      int s = node.data + c;
      c = s / 10;
      result=push(result,s%10);
    }
    }
    public void calsum(sum node1,sum node2){
        if(node1==null)
            return;
        calsum(node1.next,node2.next);
        int s = node1.data+node2.data+c;
        c = s/10;
        result = push(result,s%10);
    }
    
    
    
}
