/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.reverselevelordertrans.reversePrint;

/**
 *
 * @author oyo
 */
public class findpairinBST {
    public static void inorder(Tree root,ArrayList<Integer> list)
    {
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static int findpair(ArrayList<Integer> list,int sum)
    {
        int i=0,j=list.size()-1;
        while(i<j)
        {
            if(sum==list.get(i)+list.get(j))
                return 1;
            else if(sum>list.get(i)+list.get(j))
                i++;
            else
                j--;
        }
        return 0;
    }
    public static int findSumPair(Tree root,int sum)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return findpair(list,sum);
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());      
        int sum = in.nextInt();
        System.out.println(findSumPair(root,sum));
        
    }
}
