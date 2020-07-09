/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import static javacourse.randomlist.print;
import static javacourse.randomlist.push;

/**
 *
 * @author oyo
 */

import java.util.HashMap;
import java.util.Map;
public class clonelinkedlist {
    public static randlist clone(randlist root){
        Map<randlist,randlist> map = new HashMap<>();
        randlist orglist = root;
        randlist clone =  null;
        while(orglist!=null)
        {
            clone = new randlist(orglist.data);
            map.put(orglist, clone);
            orglist = orglist.next;
        }
        randlist cur = root;
        while(cur!=null){
            clone = map.get(cur);
            clone.next = map.get(cur.next);
            clone.rand = map.get(cur.rand);
            cur=cur.next;
        }
        return map.get(root);
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
        randlist cloned = clone(node);
        print(cloned);
    }
}
