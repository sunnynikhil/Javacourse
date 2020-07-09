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
public class blastbombs {
    public static void main(String[] args){
        int count=0;
        int rows =5;
        int cols =5;
        int matrix[][]=  new int[][]{
                   {1 ,1 , 0, 0, 1},
                   {1,0,1,1,1},
                   {0,0,1,0,1},
                   {0,0,0,0,1},
                   {0,0,0,0,0}

        };
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==1)
                    count++;
                trans(matrix,i,j);
            }
        }
        System.out.print("count="+count);
        System.out.println();
        for(int i=0;i<rows;i++)
        {  for(int j=0;j<cols;j++)
            {
                System.out.print(matrix[i][j]);
            
            }
        System.out.println();
        }
    }
    public static void trans(int m[][],int i,int j){
        if(i<0||j<0)
            return;
        if(i>=m[0].length||j>=m.length)
            return ;
        if(m[i][j]!=1)
            return;
        m[i][j]=-1;
        trans(m,i-1,j);
        trans(m,i,j-1);
        trans(m,i,j+1);
        trans(m,i+1,j);
        trans(m,i-1,j+1);
        trans(m,i-1,j-1);
        trans(m,i+1,j-1);
        trans(m,i+1,j+1);
    }
    }
    

