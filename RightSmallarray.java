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
import java.util.ArrayList;

public class RightSmallarray {
    
    public static void main(String[] args){
            
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        int k=0;
        ArrayList<ArrayList<Integer> > arr2d = new ArrayList<ArrayList<Integer> >();
            while(t>0){
               ArrayList<Integer> ar = new ArrayList<Integer>();
               int n = in.nextInt();
               for(int i=0;i<n;i++){
                   int temp = in.nextInt();
                   ar.add(temp);
                   
               }
               arr2d.add(k, ar);
             k++;
             t--;
              
        }
            int q= in.nextInt();
            while(q-->0){
                int i=in.nextInt();
                int j=in.nextInt();
                try{
                System.out.println(arr2d.get(i-1).get(j-1));
                }
                catch(Exception e){
                    System.out.println("ERROR!");
                }
            }
    }
    
}
