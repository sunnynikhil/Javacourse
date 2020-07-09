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
import java.util.Queue;
import java.util.LinkedList;

public class genratebinarynumber {
    
    public static void binary(long n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-->0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        binary(n);
    }
}
