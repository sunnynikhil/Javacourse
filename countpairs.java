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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
public class countpairs {
    public static int getPairs( LinkedList<Integer> h1 , LinkedList<Integer> h2, int x)
    {
        int sum=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<h1.size();i++)
            set.add(h1.get(i));
        for(int i=0;i<h2.size();i++)
        {
            if(set.contains(x-h2.get(i)))
                sum++;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> h1 = new LinkedList<>();
        LinkedList<Integer> h2 = new LinkedList<>();
        int n1 = in.nextInt();
        for(int i=0;i<n1;i++)
            h1.add(in.nextInt());
        int n2 = in.nextInt();
        for(int i=0;i<n2;i++)
            h2.add(in.nextInt());
        int x = in.nextInt();
        System.out.print(getPairs(h1,h2,x));
        
        
    }
    
}
