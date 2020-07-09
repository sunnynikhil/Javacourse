/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static javacourse.binarytreefromparentarray.printTree;
import static javacourse.deleteBST.insert;
import static javacourse.modifyBSTTree.modify;
import java.util.LinkedList;
/**
 *
 * @author oyo
 */
public class binarytoBST {
    
    public static void copyElements(Tree root,LinkedList<Integer> list)
    {
        if(root==null)
            return;
        copyElements(root.left,list);
        root.data=list.getFirst();
        list.removeFirst();
        copyElements(root.right,list);
        
    }
    public static Tree convertToBST(Tree root)
    {
        LinkedList<Integer> elements = new LinkedList<>();
                elements = getElement(root,elements);
        Collections.sort(elements);
        copyElements(root,elements);
        return root;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        root=convertToBST(root);
        printTree(root);
    }

    private static LinkedList<Integer> getElement(Tree root, LinkedList<Integer> elements) {
       if(root==null)
           return elements;
       getElement(root.left,elements);
       elements.addFirst(root.data);
       getElement(root.right,elements);
       return elements;
    }
}
