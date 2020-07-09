/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.printleftandright.printLeftAndRight;

/**
 *
 * @author oyo
 */
public class printRange {
    public static void inorder(Tree root,int l,int h,ArrayList<Integer> list)
    {
        if(root==null)
            return;
        inorder(root.left,l,h,list);
        if(root.data>=l && root.data<=h)
            list.add(root.data);
        inorder(root.right,l,h,list);
    }
    public static void printRange(Tree root,int l,int h)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,l,h,list);
        System.out.print(list);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int l = in.nextInt();
        int h = in.nextInt();
        
        printRange(root,l,h);
        
    }
}
