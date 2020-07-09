/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;
/**
 *
 * @author oyo
 */
public class revsere {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder B =new StringBuilder();
        B.append(A);
        B=B.reverse();
        String a=B.toString();
        if(A.compareTo(a)==0)
            System.out.print("Yes");
        else
            System.out.print("No");
            
    }
    
}
