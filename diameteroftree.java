/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.rightveiw.rightview;

/**
 *
 * @author oyo
 */
class Height 
{ 
    int h; 
} 
public class diameteroftree {
    public static int hieght(Tree root)
    {
        if(root==null)
            return 0;
        int lh=0;
        int rh=0;
         lh=hieght(root.left)+1;
         rh=hieght(root.right)+1;
        return Math.max(rh, lh);
    
    }
    public static int diameterutil(Tree root,Height height){
        Height lh = new Height(), rh = new Height();
        if(root==null)
        {
            height.h=0;
            return 0;
        
        }
        
        
        int ldiameter = diameterutil(root.left,lh);
        int rdiameter = diameterutil(root.right,rh);
        height.h=Math.max(rh.h, lh.h)+1;
        return Math.max(rh.h+lh.h+1, Math.max(ldiameter,rdiameter));
    }
    public static int diameter(Tree root){
        Height height =new Height();
        return diameterutil(root,height);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        System.out.print(diameter(root));
    }
}
