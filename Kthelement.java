/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.countnoofturs.countTurns;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class Kthelement {
    static int count=0;
    public static void inorder(Tree root,int a[])
    {
        if(root==null)
            return;
        inorder(root.right,a);
        a[count++]=root.data;
        inorder(root.left,a);
    }
    public static void Kthelement(Tree root,int k){
        if(root==null||count>k)
            return ;

        Kthelement(root.right,k);
        count+=1;
        if(count==k)
            System.out.print(root.data);
        Kthelement(root.left,k);
        
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root  = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int k = in.nextInt();
        Kthelement(root,k);
    }
}
