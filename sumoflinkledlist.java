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
public class sumoflinkledlist {
    public static Node sum(Node h1,Node h2){
        Node result = null;
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        Node h1 = null;
        Node h2 = null;
        for(int i=0;i<n1;i++)
            h1=push(h1,in.nextInt());
        int n2 = in.nextInt();
        for(int i=0;i<n2;i++)
            h2=push(h2,in.nextInt());
        Node sum = sum(h1,h2);
        print(sum);
    }
}
