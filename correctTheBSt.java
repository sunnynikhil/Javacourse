/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import java.util.Vector;
import static javacourse.binarytreefromparentarray.printTree;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class correctTheBSt {
    public static void sorteNodes(Tree root,Vector<Integer> v)
    {
        if(root==null)
            return;
        sorteNodes(root.left,v);
        v.add(root.data);
        sorteNodes(root.right,v);
    }
    public static Vector<Integer> insertionSort(Vector<Integer> v)
    {
        int n = v.size();
        for(int i=1;i<n;i++)
        {
            int key = v.get(i);
            int j=i-1;
            if(j>=0 && v.get(j)>key)
            {
                int temp = v.get(j);
                v.set(j+1, temp);
                j=j-1;
            }
            v.set(j+1, key);
        }
        return v;
    }
    public static void swap(Tree root, int n1,int n2)
    {
        if(root==null)
            return;
        swap(root.left,n1,n2);
        if(root.data==n1)
        {
            root.data=n2;
        }
        if(root.data==n2)
            root.data=n1;
        swap(root.right,n1,n2);
    }
    public static Tree correctBST(Tree root)
    {
        Vector<Integer> v = new Vector<>();
        sorteNodes(root,v);
        Vector<Integer> v1 = (Vector<Integer>) v.clone();
        v1=insertionSort(v1);
        System.out.print(v1);
        
        for(int i=0;i<v.size();i++)
        {
            if(v.get(i)!=v1.get(i))
            {
                swap(root,v.get(i),v1.get(i));
                break;
            }
        }
        return root;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        correctBST(root);
        printTree(root);
    }
}
