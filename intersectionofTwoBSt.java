/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.maxsumleaftoleaf.getMax;

/**
 *
 * @author oyo
 */
public class intersectionofTwoBSt {
    public static void getIntoSet(Tree t , HashSet<Integer> set)
    {
        if(t==null)
            return;
        getIntoSet(t.left,set);
        set.add(t.data);
        getIntoSet(t.right,set);
    }
    public static void getIntersectionOfTwoBSTsUtil(Tree t ,HashSet<Integer> set,ArrayList<Integer> res)
    {
        if(t==null)
            return;
        getIntersectionOfTwoBSTsUtil(t.left,set,res);
        if(set.contains(t.data))
            res.add(t.data);
        getIntersectionOfTwoBSTsUtil(t.right,set,res);
    }
    public static ArrayList<Integer> getIntersectionOfTwoBSTs(Tree t1,Tree t2)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        getIntoSet(t1,set);
        getIntersectionOfTwoBSTsUtil(t2,set,res);
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null,root1=null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        for(int i=0;i<n;i++)
            root1=insert(root1,in.nextInt());
        
        ArrayList<Integer> list = new ArrayList<>();
        list=getIntersectionOfTwoBSTs(root,root1);
        System.out.println(list);
    }
}
