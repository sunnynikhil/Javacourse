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
public class reversekarray {
    public static ArrayList<Integer> reverseK(ArrayList<Integer> in , int k, int n){
    
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i=0;
        
        while(i<n)
        {int count=0;
            while(i<n &&count<k)
            {
                stack.push(in.get(i));
                i++;
                count++;
            }
            while(stack.size()>0)
            {
                res.add(stack.pop());
            }
        }
        return res;
     }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            a.add(in.nextInt());
        int k = in.nextInt();
        a=reverseK(a,k,n);
        System.out.print(a);
    }
}
