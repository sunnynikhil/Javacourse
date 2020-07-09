/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.HashSet;
import java.util.PriorityQueue;
import javacourse.origin.PointDistance;

/**
 *
 * @author oyo
 */

public class nearestpointtooriginsorting {
    class sortByDist implements Comparator<origin.PointDistance>{
        
        @Override
        public int compare(origin.PointDistance a, origin.PointDistance b){
            return b.dist - a.dist;
        }
    } 
    class PointDist{
        int x,y,dist;
        PointDist(int x, int y , int distance){
            this.x=x;
            this.y=y;
            this.dist=distance;
        }
    }
    public int[][] kclosest(int a[][],int k){
        if(a==null);
          return new int[0][];
        PriorityQueue<PointDist> queue = new PriorityQueue<PointDist>(new sortByDist());
        
          
        
          
        
        
    }
    public static int distance(int p[]){
        return p[0]*p[0]+p[1]*p[1];
    }
    public  void main(String[] args){
        
        int a[][]=new int[][]{ {-2,4},{0,-2},{-1,0},{3,5},{-2,-3},{3,4}
                                            };
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        kclosest(a,k);
    }  
}
