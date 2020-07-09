/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.minimumsumlist.print;
import static javacourse.removeNthNodefromend.push;
import static javacourse.rotateknodes.rotateKNodes;

/**
 *
 * @author oyo
 */
public class ksmallestelementBST {
  
    public static void inorder(Tree root,List<Integer> list)
    {
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
        
    }
    public static int kthSmallest(Tree root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list.get(k-1);
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            Tree head = null;
            for(int i=0;i<n;i++)
                head=insert(head,in.nextInt());
            int k = in.nextInt();
            System.out.println(kthSmallest(head,k));
            
        
        }
        
    }
}
