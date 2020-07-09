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
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class reversekqueue {
    public static Queue<Integer> kreverse(Queue<Integer> queue , int k){
    if(queue.isEmpty()||k>=queue.size())
        return null;
    if(k<=0)
        return null;
    Stack<Integer> stack = new Stack<Integer>();
    for(int i=0;i<k;i++)
    {
        stack.push(queue.peek());
        queue.remove();
    }
    while(!stack.empty()){
        queue.add(stack.pop());
        
    }
    System.out.println(queue);
    for(int i=0;i<queue.size()-k;i++)
    { queue.add(queue.peek());
        queue.remove();
    }
    return queue;
    }
    
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Queue<Integer> queue = new LinkedList<>();
    for(int i=0;i<n;i++)
    {
        queue.add(in.nextInt());
    }
    System.out.println(queue);
    int k = in.nextInt();
    queue=kreverse(queue,k);
    System.out.println(queue);
    }
}
