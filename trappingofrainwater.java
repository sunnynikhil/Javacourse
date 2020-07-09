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
public class trappingofrainwater {
    public static int trap(int a[])
    {
        int water=0,right=0,left=0,l=0,h=a.length-1;
        while(l<=h)
        {
            if(a[l]<a[h])
            {
                if(a[l]>left)
                    left=a[l];
                else
                    water+=left-a[l];
                l++;
            }
            else
            {
                if(a[h]>right)
                    right=a[h];
                else
                    water+=right-a[h];
                h--;
            }
        }
        return water;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.print(trap(a));
    }
}
