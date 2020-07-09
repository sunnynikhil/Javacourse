/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.print;
import static javacourse.minimumsumlist.push;
import static javacourse.reverselinkedlist.reverselist;

/**
 *
 * @author oyo
 */
public class occuranceofanumber {
    public static int countfrequent(list head, int key){
        int count =0;
        list cur =head;
        while(cur!=null)
        {
            if(cur.data==key)
                count++;
            cur=cur.next;
        }
        return count;
    }
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        int key = in.nextInt();
        System.out.print(countfrequent(root,key));
           
    }
}
