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
public class eggs {
     public static int row =0;
    public static int col =0;
    public static void main(String[] args) {
        int matrix[][]=  new int[][]{
                   {2 ,1 , 0, 2, 1},
                   {1,0,1,2,1},
                   {0,0,1,2,1} 
        };
        System.out.println(numGroups(matrix));
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++)
        {for(int j=0;j<cols;j++)
               System.out.print(matrix[i][j]+" ");
        System.out.println();
        }
        
    }
   static int numGroups(int[][] matrix) {
  int rows = matrix.length;
  int cols = matrix[0].length;
  int count = 0;
  for(int i=0; i<rows; i++) {
    for(int j=0; j<cols; j++) {
      if(matrix[i][j] == 2) {
        count++;
        traverse(matrix, i, j);
      }
    }
  }
  return count;
}

static void traverse(int[][] matrix, int i, int j) {
  if(i<0 || j<0)
    return;
  if(i>=matrix.length || j>=matrix[0].length)
    return;
  if(matrix[i][j] == -1 || matrix[i][j] ==0 )
    return;
  matrix[i][j] = -1;
  traverse(matrix, i-1, j);
  traverse(matrix, i+1, j);
  traverse(matrix, i, j-1);
  traverse(matrix, i, j+1);
}
}
