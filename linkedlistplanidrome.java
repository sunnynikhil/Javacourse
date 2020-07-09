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
import java.util.Stack;
import static javacourse.minimumsumlist.push;

public class linkedlistplanidrome {
    
    public static boolean checkpland(list node){
        boolean ipl = false;
        Stack<Integer> s = new Stack<Integer>();
        list cur = node;
        while(cur!=null)
        {
            s.push(cur.data);
            cur=cur.next;
        }
        while(node!=null)
        {
            int data = s.peek();
            s.pop();
            if(data==node.data)
                ipl=true;
            else
            {
                ipl = false;
                break;
            }
            node=node.next;
        }
      return ipl;  
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        list node = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            node=push(node,in.nextInt());
        boolean check = checkpland(node);
        if(check== true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
