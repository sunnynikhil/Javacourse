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
public class CFG {
    
    public static int steps(int source,int steps,int dest){
        if(Math.abs(source)>dest)
            return Integer.MAX_VALUE;
        if(dest==source)
            return steps;
        
        int pos = steps(source+steps+1,steps+1,dest);
        
        int neg = steps(source-steps-1,steps+1,dest);
        
        return Math.min(pos,neg);
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int dest = in.nextInt();
        System.out.print(steps(0,0,dest));
    }
    
}
