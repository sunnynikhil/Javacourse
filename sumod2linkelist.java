/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;

/**
 *
 * @author oyo
 */
class sum{
    int data;
    sum next;
    sum(int d){
        this.data=d;
        next=null;
    }
}
public class sumod2linkelist {
    public static sum push(sum node,int data){
        if(node==null)
            return new sum(data);
        else
        {
            sum new_n = new sum(data);
            new_n.next=node;
            return new_n;
        }
    }
    public static void print(sum node){
        if(node==null)
            return;
        sum cur = node;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
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
        sum res = sum(h1,h2);
        print(res);
    
    }

    private static sum sum(sum h1, sum h2) {

        int sum =0;
        int carry =0;
        sum result=null;
        while(h1!=null && h2!=null){
           
            sum=h1.data+h2.data+carry;
            if(sum>=10){
            carry = 1;
            sum=sum%10;
            result=push(result,sum);
            }
            else
            {
                carry=0;
                result=push(result,sum);
            }
            h1=h1.next;
            h2=h2.next;
        }
        while(h1!=null)
        {
            
            sum=h1.data+carry;
            if(sum>=10){
            carry = 1;
            sum=sum%10;
            result=push(result,sum);
            }
            else
            {
                carry=0;
                result=push(result,sum);
            }
            h1=h1.next;
            
        }
        while(h2!=null){
            
            sum=h2.data+carry;
            if(sum>=10){
            carry = 1;
            sum=sum%10;
            result=push(result,sum);
            }
            else
            {
                carry=0;
                result=push(result,sum);
            }
            h2=h2.next;
        }
        return result;
     
    }
}
