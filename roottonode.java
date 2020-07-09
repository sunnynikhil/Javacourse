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
import static javacourse.deleteBST.insert;
public class roottonode {
    public static boolean pathhas(Tree root,ArrayList<Integer> arr , int x){
    
        if(root==null)
            return false;
        
        arr.add(root.data);
        if(root.data==x)
            return true;
        
        if(pathhas(root.left,arr,x)||pathhas(root.right,arr,x))
          return true;
            
        
        arr.remove(arr.size()-1);
        return false;
        
    }
    public static void printpath(Tree root , int key){
        ArrayList<Integer> arr = new ArrayList();
        

        
        
        if(pathhas(root,arr,key)){
            for (int i=0; i<arr.size()-1; i++)      
                System.out.print(arr.get(i)+"->"); 
            System.out.print(arr.get(arr.size() - 1)); 
        }
        else
        {
            System.out.print("NO PATH");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        int key = in.nextInt();
        printpath(root,key);
    }
}
