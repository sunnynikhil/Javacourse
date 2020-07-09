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
import java.lang.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class find_minimum_numbers_moves_needed_move_one_cell_matrix_another {
        static final int inf=(int)1e9;
        static class pair{
                int a,b;
                pair(int c,int d){
                        a=c;b=d;
                }
        }
        static int[] dx={1,-1,0,0},dy={0,0,1,-1};
        public static void main(String[] args) throws java.lang.Exception {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int mat[][]=new int[n][n];
                int sx=0,sy=0,fx=0,fy=0;
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                mat[i][j]=in.nextInt();
                                if(mat[i][j]==1){
                                        sx=i;sy=j;
                                }
                                if(mat[i][j]==2){
                                        fx=i;fy=j;
                                }
                        }
                }
                int dist[][]=new int[n][n];
                for (int i = 0; i < n; i++) {
                        Arrays.fill(dist[i],inf);
                }
                dist[sx][sy]=0;
                Queue<pair>qu=new LinkedList<>();
                qu.add(new pair(sx,sy));
                while(!qu.isEmpty()){
                    pair temp=qu.poll();
                    int x=temp.a;
                    int y=temp.b;
                    for(int i=0;i<4;i++){
                        int pt1=x+dx[i];
                        int pt2=y+dy[i];
                        if(pt1>=0 && pt1<=n-1 && pt2>=0 && pt2<=n-1 && mat[pt1][pt2]!=0){
                            if(dist[pt1][pt2]>1+dist[x][y]){
                                dist[pt1][pt2]=1+dist[x][y];
                                qu.add(new pair(pt1,pt2));
                            }
                        }
                    }
            }
            System.out.println(dist[fx][fy]);
        }
}

