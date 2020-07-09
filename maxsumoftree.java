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
import java.util.LinkedList;
import static javacourse.deleteBST.insert;
public class maxsumoftree {
    
    public static int maxsum(Tree root){
        if(root==null)
            return 0;
        int result=root.data;
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            int sum=0;
            while(count>0){
               Tree temp = queue.peek();
               queue.poll();
                
                sum=sum+temp.data;
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
                    
                count--;
            }
            System.out.println("sum:"+sum);
            result = Integer.max(sum, result);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root=null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int sum=maxsum(root);
        System.out.print(sum);
    }
}
