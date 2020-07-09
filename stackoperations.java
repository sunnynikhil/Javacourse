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
public class stackoperations {
    class DLL{
        int data;
        DLL next;
        DLL perv;
        DLL(int d)
        {
            this.data=d;
        }
    }
    class mystack{
        DLL head;
        DLL mid;
        int count;
    }
    
    mystack createstack(){
        mystack ms = new mystack();
        ms.count=0;
        return ms;
    }
    void push(mystack ms,int data){
        DLL new_node = new DLL(data);
        new_node.next=ms.head;
        new_node.perv=null;
        ms.count+=1;
        if(ms.count==1)
            ms.mid=new_node;
        else
        {
            ms.head.perv=new_node;
            if(ms.count%2!=0)
                ms.mid=ms.mid.perv;
        }
        ms.head=new_node;
    }
    int pop(mystack ms){
        if(ms.count==0)
        { System.out.print("stack is empty");
        return -1;
        }
        DLL head = ms.head;
        int item = head.data;
        ms.head = head.next;
        if(ms.head!=null)
            ms.head.perv=null;
        ms.count-=1;
        if(ms.count%2==0)
            ms.mid=ms.mid.next;
        return item;
    }
    int findmiddle(mystack ms)
    {
        if(ms.count==0)
        { System.out.print("stack is empty");
        return -1;
        }
        return ms.mid.data;
          
    }
    void deletemiddle(mystack ms){
        ms.mid.perv.next=ms.mid.next;
        
        ms.count-=1;
        if(ms.count%2==0)
          ms.mid=ms.mid.next;
        else
            ms.mid=ms.mid.perv;
    }
    public static void main(String[] args){
        stackoperations obj = new stackoperations();
        mystack ms = obj.createstack();
        obj.push(ms,1);
        obj.push(ms,2);
        obj.push(ms,3);
        obj.push(ms,4);
        obj.push(ms,5);
        obj.push(ms,6);
        System.out.println("middle:"+obj.findmiddle(ms));
        System.out.println("pop:"+obj.pop(ms));
        System.out.println("middle:"+obj.findmiddle(ms));
        obj.deletemiddle(ms);
        System.out.println("middle:"+obj.findmiddle(ms));
        System.out.println("pop:"+obj.pop(ms));
        
        System.out.println("middle:"+obj.findmiddle(ms));
        
    }
}
