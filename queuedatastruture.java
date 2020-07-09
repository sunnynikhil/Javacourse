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
class queue{
    int rear,front, size, capcity,a[];
    queue(int c){
        this.capcity = c;
        front=this.size=0;
        rear=capcity-1;
        a = new int[c];
    }
    
}
public class queuedatastruture {
    public static void enqueue(queue queue,int data){
        if(isFull(queue))
            return;
        queue.rear =(queue.rear+1)%queue.capcity;
        queue.a[queue.rear]=data;
        queue.size = queue.size+1;
        
    }
    public static void print(queue queue){
        int n=queue.size;
        int i=queue.rear;
        System.out.println("elements:");
        for(i=0;i<n;i++)
            System.out.print(queue.a[i]+" ");
    }
    public static void dequeue(queue queue){
        if(queue.size==0)
            return;
        queue.front=(queue.front+1)%queue.capcity;
        queue.size=queue.size-1;
        
      
      }
    
    public static int front(queue queue){
        if(queue.size==0)
            return 0;
        return queue.a[queue.front-1];
        
    }
    public static boolean isFull(queue queue){
        return queue.size == queue.capcity?true:false;
    }
    public static int rear(queue queue){
        if(queue.size==0)
            return 0;
        return queue.a[queue.rear-1];
    }
    public static void main(String[] args){
        queue queue = new queue(1000);
        enqueue(queue,20);
        enqueue(queue,30);
        enqueue(queue,40);
        enqueue(queue,50);
        enqueue(queue,60);
        print(queue);
        dequeue(queue);
        print(queue);
        System.out.println("front:"+front(queue));
        System.out.println("rear: "+rear(queue));
    }
}
