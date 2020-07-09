/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class boxStacking {

    static class Box implements Comparable<Box>{
        int h,d,w,area;
        Box(int h,int w,int d)
        {
            this.h=h;
            this.d=d;
            this.w=w;
        }
        public int compareTo(Box o)
        {
            return o.area-this.area;
        }
    }
    public static int getMaxHeightOfBoxes(Box[] boxes,int n)
    {
        Box[] rotations = new Box[3*n];
        for(int i=0;i<n;i++)
        {
            Box box = boxes[i];
            
            rotations[3*i] = new Box(box.h,Math.max(box.w, box.d),Math.min(box.d, box.w));
            rotations[3*i+1] = new Box(box.w,Math.max(box.h, box.d),Math.min(box.d, box.h));
            rotations[3*i+2] = new Box(box.d,Math.max(box.w, box.h),Math.min(box.h, box.w));     
        }
        for(int i=0;i<rotations.length;i++)
        {
            rotations[i].area=rotations[i].w*rotations[i].d;
        }
        Arrays.sort(rotations);
        int count = 3*n;
        int msh[] = new int[count];
        for(int i=0;i<count;i++)
            msh[i]=rotations[i].h;
        for(int i=0;i<count;i++)
        {
            msh[i]=0;
            Box box = rotations[i];
            int val =0;
            for(int j=0;j<i;j++)
            {
                Box prevBox = rotations[j];
                if(box.w<prevBox.w && box.d<prevBox.d)
                    val = Math.max(val, msh[j]);
            }
            msh[i]=val+box.h;
        }
        int max =-1;
        for(int i=0;i<count;i++)
        {
            max = Math.max(max, msh[i]);
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Box[] box = new Box[n];
        for(int i=0;i<n;i++)
        {
            int h = in.nextInt();
            int w = in.nextInt();
            int d = in.nextInt();
            box[i] = new Box(h,w,d);
        }
        System.out.println(getMaxHeightOfBoxes(box,n));
    }
}
