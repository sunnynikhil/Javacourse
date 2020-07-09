/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deletemid.deletemiddle;
import static javacourse.minimumsumlist.print;
import static javacourse.minimumsumlist.push;

/**
 *
 * @author oyo
 */
public class quicksort {
    public static void swap(list p , list q){
        int temp = p.data;
        p.data=q.data;
        q.data=temp;
    }
    public static list partition(list start,list end){
        int pivot = start.data;
        list p = start;
        list q = start.next;
        while(q!=end)
        {
            if(q.data<pivot){
                p=p.next;
                swap(p,q);
            }
            q=q.next;
        }
        swap(p,start);
        return p;
    }
    public static void QuickSortUtil(list start,list end){
        if(start!=end){
            list mid = partition(start,end);
            QuickSortUtil(start,mid);
            QuickSortUtil(mid.next,end);
        }
    }
    public static list QuickSort(list head){
        QuickSortUtil(head,null);
        return head;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        root=QuickSort(root);
        print(root);
           
    }
}
