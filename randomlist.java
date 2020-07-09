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
import java.util.HashMap;
import java.util.Map;
class randlist{
    int data;
    randlist next,rand;
    randlist(int d){
        this.data=d;
        next=rand=null;
    }
}
public class randomlist {
    
    public static randlist push(randlist node,int data){
        if(node==null)
            return new randlist(data);
        randlist new_node = new randlist(data);
        new_node.next=node;
        return new_node;
    }
    public static void print(randlist node){
        if(node==null)
            return;
        randlist cur = node;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    
    public static randlist clone(randlist node){
        Map<randlist,randlist> map = new HashMap<>();
        randlist clone = null;
        randlist cur = node;
        
        while(cur!=null){
            clone = new randlist(cur.data);
            map.put(cur, clone);
            cur=cur.next;
        }
        randlist cur1 = node;
        while(cur1!=null){
            
            clone = map.get(cur1);
            clone.next = map.get(cur1.next);
            clone.rand = map.get(cur1.rand);
            cur1=cur1.next;
            
        }
        
        return map.get(node); 
        
    }
    
    public static void main(String[] args){
        randlist node = null;
        node=push(node,5);
        node=push(node,4);
        node=push(node,3);
        node=push(node,2);
        node=push(node,1);
        node.rand=node.next.next;
        node.next.rand = 
           node.next.next.next; 
        node.next.next.rand = 
            node.next.next.next.next; 
        node.next.next.next.rand = 
            node.next.next.next.next.next; 
        node.next.next.next.next.rand = 
            node.next; 
        print(node);
        System.out.println();
        randlist clone = clone(node);
        print(clone);
        
    }
    
}
