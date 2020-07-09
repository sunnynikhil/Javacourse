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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Queue 
{ 
    long front, rear, size; 
    long  capacity; 
    long array[]; 
       
    public Queue(long capacity) { 
         this.capacity = capacity; 
         front = this.size = 0;  
         rear = capacity - 1; 
         array = new long[(int)this.capacity]; 
            
    } 
       
    // Queue is full when size becomes equal to  
    // the capacity  
    boolean isFull(Queue queue) 
    {  return (queue.size == queue.capacity); 
    } 
       
    // Queue is empty when size is 0 
    boolean isEmpty(Queue queue) 
    {  return (queue.size == 0); } 
       
    // Method to add an item to the queue.  
    // It changes rear and size 
    void enqueue( int item) 
    { 
        if (isFull(this)) 
            return; 
        this.rear = (this.rear + 1)%this.capacity; 
        this.array[(int)this.rear] = item; 
        this.size = this.size + 1;  
    } 
       
    // Method to remove an item from queue.   
    // It changes front and size 
    void dequeue() 
    { 
        if (isEmpty(this)) 
            return; 
           
        long item = this.array[(int)this.front]; 
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
    } 
       
    // Method to get front of queue 
    long front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[(int)this.front]; 
    } 
        
    // Method to get rear of queue 
    long rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[(int)this.rear]; 
    } 
} 
public class twostacks {

    public static void main(String[] args) {
        long cap=1000000000;
        Queue queue = new Queue(cap);
        Scanner in = new Scanner(System.in);
        long T=in.nextLong();
        while(T>0)
        {
            long choice =in.nextLong();
            if(choice==1)
            {
              int ele =in.nextInt();
              queue.enqueue(ele);
            }
            else if(choice==2)
            {
               queue.dequeue();
            }
            else if(choice==3)
            {
               System.out.println(queue.front());
            }
            T--;
        }

    }
}


