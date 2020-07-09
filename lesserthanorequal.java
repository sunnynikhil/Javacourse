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
public class lesserthanorequal {
    
    public static int findMaxforKey(Tree root,int n,int key){
        int min_key=-1,diff=99999999;
        if(root==null)
            return -1;
        Tree cur = root;
        while(cur!=null)
        {
            if(cur.data==key)
            {
                return cur.data;
            }
            if(diff>Math.abs(cur.data-key) && cur.data<key){
                diff=Math.abs(cur.data-key);
                min_key=cur.data;
            }
            if(key<cur.data)
                cur=cur.left;
            else
                cur=cur.right;
            
        }
        return min_key;
        
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root= insert(root,in.nextInt());
        int key = in.nextInt();
        System.out.print(findMaxforKey(root,n,key));
        
    }
}
