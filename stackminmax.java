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
import java.util.Stack;
public class stackminmax {
    
    Stack<Integer> s; 
    Integer minEle; 
    Integer maxEle;
    stackminmax() { s = new Stack<Integer>(); } 
    public void push(int x){
        if(s.empty()){
            minEle = x;
            maxEle = x;
            s.push(x);
            System.out.println("Number inserted :"+x);
            return;
        }
        if(x<minEle){
            s.push(2*x-minEle);
            minEle=x;
        }
//        else if(x>maxEle)
//        {
//            s.push(2*x-maxEle);
//            maxEle = x;
//        }
        
        else
            s.push(x);
        System.out.println("Number inserted :"+x);
    }
    public void pop(){
        System.out.println("stack:"+s);
        if(s.empty())
        {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("Top element of stack");
        Integer t = s.pop();
        if(t<minEle){
            System.out.println(minEle);
            minEle=2*minEle-t;
        }
//        else if(t>maxEle){
//            System.out.print(maxEle);
//            maxEle=2*maxEle-t;
//        }
        else
           System.out.println(t);
    }
    public void getMin(){
        System.out.print("min=");
        if(s.empty())
            System.out.println("stack is empty");
        else
            System.out.println(minEle);
    }
    public void getMax(){
        System.out.print("max=");
        if(s.empty())
            System.out.println("stack is empty");
        else
            System.out.println(maxEle);
    }
    public static void main(String[] args){
     stackminmax s = new stackminmax();
        s.push(3); 
        System.out.print(s.s);
        s.push(5); 
        System.out.print(s.s);
        s.getMin(); 
//        s.getMax();
        s.push(2); 
        System.out.print(s.s);
        s.push(1); 
        System.out.print(s);
        s.getMin(); 
//        s.getMax();
        s.pop(); 
        System.out.print(s.s);
        s.getMin(); 
//        s.getMax();
        s.pop(); 
       System.out.print(s.s);
        
    }
    
}
