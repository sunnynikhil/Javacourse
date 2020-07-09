/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import java.util.LinkedList;
import java.util.Stack;
/**
 *
 * @author oyo
 */
public class MergeTwoBST {
    
    
    public static List<Integer> mergeList(Tree l1,Tree l2)
    {
        List<Integer> list = new LinkedList<>();
        Stack<Tree> s1 = new Stack<>();
        Stack<Tree> s2 = new Stack<>();
        while(l1!=null || l2!=null || !s1.isEmpty() || !s2.isEmpty() )
        {
            while(l1!=null)
            {
                s1.push(l1);
                l1=l1.left;
            }
            while(l2!=null)
            {
                s2.push(l2);
                l2=l2.left;
            }
            
            if(!s1.isEmpty() && !s2.isEmpty())
            {
                if(s1.peek().data <= s2.peek().data)
                {
                    Tree tmp = s1.peek();
                    list.add(tmp.data);
                    s1.pop();
                    l1=tmp.right;
                    
                }
                else
                {
                    Tree tmp = s2.peek();
                    list.add(tmp.data);
                    s2.pop();
                    l2=tmp.right;
                }
            }
            else
            {
              if(!s1.isEmpty())
              {
                    Tree tmp = s1.peek();
                    list.add(tmp.data);
                    s1.pop();
                    l1=tmp.right;
                  
              }
              else if(!s2.isEmpty())
              {
                    Tree tmp = s2.peek();
                    list.add(tmp.data);
                    s2.pop();
                    l2=tmp.right;
              }
            }
            
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tree l1 = null,l2=null;
        int n1=in.nextInt();
        for(int i=0;i<n1;i++)
            l1=insert(l1,in.nextInt());
        int n2 = in.nextInt();
        for(int i=0;i<n2;i++)
            l2=insert(l2,in.nextInt());
        List<Integer> mergeList = new LinkedList<>();
        mergeList = mergeList(l1,l2);
        System.out.print(mergeList);
        
    }
    
}
