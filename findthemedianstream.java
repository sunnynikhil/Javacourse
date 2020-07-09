/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import static javacourse.longestropes.longropes;

/**
 *
 * @author oyo
 */
public class findthemedianstream {
    static PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> min = new PriorityQueue<>();
    
    public static void insertHeap(int x){
        if(min.size()==0 || x>min.peek())
            min.add(x);
        else
            max.add(x);
    }
    public static void balance(){
        int min_size=min.size();
        int max_size=max.size();
        int data;
        if(Math.abs(min_size-max_size)<=1)
            return;
        if (min_size > max_size)
    {
        data=min.peek();
        max.add(min.peek());
        min.poll();
    }
    else
    {   data=max.peek();
        min.add(max.peek());
        max.poll();
    }
    }
    public static double getMedain(){
        if(min.size()==max.size())
            return (min.peek()+max.peek())/2;
        else if(min.size()>max.size())
            return min.peek();
        else
            return max.peek();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            insertHeap(in.nextInt());
            balance();
            System.out.print(getMedain());
        }
        
    }
}
