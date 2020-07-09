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
import java.util.Stack;
public class nonmatching {
    
    public static boolean isleaf(rootNode node){
        return (node.left==null && node.right==null);
    }
    
    public static void non_matching(rootNode r1 , rootNode r2){
        if(r1==null || r2==null )
            return;
        Stack<rootNode> s1 = new Stack<rootNode>();
        Stack<rootNode> s2 = new Stack<rootNode>();
        s1.push(r1);
        s2.push(r2);
        
        while(!s1.isEmpty()|| !s2.isEmpty()){
            
            if(s1.isEmpty() || s2.isEmpty())
                return;
            
            rootNode temp = s1.peek();
            s1.pop();
            while(temp!=null && isleaf(temp)==false){
                s1.push(temp.right);
                s1.push(temp.left);
                temp=s1.peek();
                s1.pop();
            }
            rootNode temp1 = s2.peek();
            s2.pop();
            while(temp1!=null && isleaf(temp1)==false){
                s2.push(temp1.right);
                s2.push(temp1.left);
                temp1=s2.peek();
                s2.pop();
            }
            
            if(temp!=null && temp1!=null){
                if(temp.data!=temp1.data)
                {
                    System.out.print(temp.data+"-"+temp1.data);
                    return;
                }
            }
            
        }
    }
    public static void main(String[] args){
        rootNode r1=new rootNode(5);
        r1.left=new rootNode(2);
        r1.right = new rootNode(7);
        r1.left.left = new rootNode(10);
        r1.left.right = new rootNode(11);
        
        rootNode r2 = new rootNode(6);
        r2.left = new rootNode(10);
        r2.right = new rootNode(15);
        non_matching(r1,r2);
        
      
    }
}
