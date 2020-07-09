/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */import java.util.*;
import java.util.LinkedList;
import static javacourse.deleteBST.insert;


public class burnthetree {
    public static int burnutil(Tree root,Queue<Tree> queue,int target){
        if(root==null)
            return 0;
        if(root.data==target){
            if(root.left!=null)
                queue.add(root.left);
            if(root.right!=null)
                queue.add(root.right);
            return 1;
            
        }
        int a = burnutil(root.left,queue,target);
        if(a==1)
        {
            int qsize=queue.size();
            while(qsize-->0)
            {
                Tree temp = queue.peek();
                System.out.print(temp.data);
                queue.poll();
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            if(root.right!=null)
                queue.add(root.right);
            System.out.print(root.data);
            return 1;
            
        }
        int b = burnutil(root.right,queue,target);
        if(b==1)
        {
            int qsize=queue.size();
            while(qsize-->0)
            {
                Tree temp = queue.peek();
                System.out.print(temp.data);
                queue.poll();
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            if(root.left!=null)
                queue.add(root.left);
            System.out.println(root.data);
            return 1;
        }
        return 0;
    }
    public static void burn(Tree root, int target){
        Queue<Tree> queue = new LinkedList<Tree>();
        burnutil(root,queue,target);
        
        while(!queue.isEmpty()){
            int qsize = queue.size();
            while(qsize-->0){
                Tree temp = queue.peek();
                System.out.print(temp.data);
                queue.poll();
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
                
                
            }
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        int target = in.nextInt();
        burn(root,target);
    }
}
