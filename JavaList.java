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
public class JavaList {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            arr.add(in.nextInt());
        int q = in.nextInt();
        while(q>0){
            String qur = new String();
            qur=in.nextLine();
            switch(qur){
                case "Insert":
                    int x=in.nextInt();
                    int y=in.nextInt();
                    arr.add(x, y);
                    q--;
                    break;
                case "Delete":
                    int z=in.nextInt();
                    arr.remove(z);
                    q--;
                    break;
                    
            }
        }
        
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    
}
