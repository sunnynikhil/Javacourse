/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.TreeBasic.insert;
import static javacourse.levelordertraversal.levelordertraversalQueue;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author oyo
 */
public class maxsumlevel {
    
    public static int maxsum(rootNode root){
        int result=0;
        Queue<rootNode> queue = new LinkedList<rootNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            int sum=0;
            while(count--!=0){
                rootNode temp = queue.poll();
                
                sum=sum+temp.data;
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
                
            }
            result = Math.max(sum, result);
             
        }
      return result;  
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int t= in.nextInt();
            rootNode root = null;
            while(t-->0){
                int data= in.nextInt();
                root=insert(root,data);
            }
            
            int result=maxsum(root);
            System.out.print(result);
    }
}
